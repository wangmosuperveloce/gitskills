package morphia;

import com.mongodb.*;
import org.apache.commons.beanutils.BeanUtils;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.aggregation.AggregationPipeline;
import org.mongodb.morphia.aggregation.Projection;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.*;

import static org.mongodb.morphia.aggregation.Projection.projection;

/**
 * Created by wangmo on 16/9/24.
 */
public class Main {
    private static Morphia morphia = new Morphia();
    private static Datastore datastore = morphia.createDatastore(new MongoClient(), "test");
    private static final int singleDocFileNum = 10000;

    public static void main(String[] args) throws Exception{
        String url = "bad";
        String[] sed = url.split("\\?");
        System.out.println(sed.length);
    }

















    private static Projection[] projections = new Projection[] {projection("_id").suppress(),
            projection("mobile", "files.mobile"),
            projection("name", "files.name"),
            projection("userId", "files.userId"),
            projection("joinAt", "files.joinAt"),
            projection("nationalId", "files.nationalId"),
            projection("insCity", "files.insCity"),
            projection("insBase", "files.insBase"),
            projection("insOrg", "files.insOrg"),
            projection("insEmp", "files.insEmp"),
            projection("hfCity", "files.hfCity"),
            projection("hfBase", "files.hfBase"),
            projection("hfOrg", "files.hfOrg"),
            projection("hfEmp", "files.hfEmp"),
            projection("orgEnd", "files.orgEnd"),
            projection("empEnd", "files.empEnd"),
            projection("orgMed", "files.orgMed"),
            projection("empMed", "files.empMed"),
            projection("orgUne", "files.orgUne"),
            projection("empUne", "files.empUne"),
            projection("orgInj", "files.orgInj"),
            projection("empInj", "files.empInj"),
            projection("orgMat", "files.orgMat"),
            projection("empMat", "files.empMat"),
            projection("orgIll", "files.orgIll"),
            projection("empIll", "files.empIll"),
            projection("suppInsOrg", "files.suppInsOrg"),
            projection("suppInsEmp", "files.suppInsEmp"),
            projection("suppHfOrg", "files.suppHfOrg"),
            projection("suppHfEmp", "files.suppHfEmp"),
            projection("orgSuppEnd", "files.orgSuppEnd"),
            projection("empSuppEnd", "files.empSuppEnd"),
            projection("orgSuppMed", "files.orgSuppMed"),
            projection("empSuppMed", "files.empSuppMed"),
            projection("orgSuppUne", "files.orgSuppUne"),
            projection("empSuppUne", "files.empSuppUne"),
            projection("orgSuppInj", "files.orgSuppInj"),
            projection("empSuppInj", "files.empSuppInj"),
            projection("orgSuppMat", "files.orgSuppMat"),
            projection("empSuppMat", "files.empSuppMat"),
            projection("orgSuppIll", "files.orgSuppIll"),
            projection("empSuppIll", "files.empSuppIll")};

    public static <T> T dbObject2Bean(DBObject dbObject, T bean) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {
        if (bean == null) {
            return null;
        }
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            String varName = field.getName();
            Object object = dbObject.get(varName);
            if (object != null) {
                BeanUtils.setProperty(bean, varName, object);
            }
        }
        return bean;
    }


    public static InsuranceMonthFile getMonthFile_SearchName(Long tenantId, int time, Integer offset, Integer limit) {
        AggregationPipeline pipeline = datastore.createAggregation(InsuranceMonthFile.class)
                .match(datastore.createQuery(InsuranceMonthFile.class).field("tenantId").equal(tenantId).field("time").equal(time).filter("deleted", 0))
                .project(Projection.projection("_id").suppress(), Projection.projection("files"))
                .unwind("files")
                .project(projections);
//                .match(datastore.createQuery(InsuranceFile.class).field("name").contains(name));
        if (offset != null && limit != null) {
            pipeline.skip(offset).limit(limit);
        }
        Iterator<InsuranceFile> fileIterator = pipeline.aggregate(InsuranceFile.class);
        List<InsuranceFile> files = new ArrayList<>();
        while (fileIterator.hasNext()) {
            InsuranceFile file = fileIterator.next();
            file.setTenantId(tenantId);
            file.setTime(time);
            files.add(file);
        }

        InsuranceMonthFile result = new InsuranceMonthFile();
        result.setTenantId(tenantId);
        result.setTime(time);
        result.setTotal(files.size());
        result.setFiles(files);
        return result;
    }

    public static InsuranceMonthFile monthFile(Long tenantId, int time, Integer offset, Integer limit, String name) {
        if (name == null || name.equals("")) {
            return getMonthFile(tenantId, time, offset, limit);
        }
        return getMonthFile(tenantId, time, offset, limit, name);
    }

    public static InsuranceMonthFile getMonthFile(Long tenantId, int time, Integer offset, Integer limit) {
        DB db = datastore.getDB();
        DBCollection dbCollection = db.getCollection("InsuranceMonthFile");
        InsuranceMonthFile result = new InsuranceMonthFile();
        int from;
        if (offset/singleDocFileNum != (offset+limit-1)/singleDocFileNum) {  // 分多次请求，合并结果
            int start = offset;
            int end = offset + limit;
            while (start < end) {
                int nextStart = (start/singleDocFileNum+1) * singleDocFileNum;
                int boundary = nextStart < end ? nextStart : end;
                InsuranceMonthFile partResult = getMonthFile(tenantId, time, start, boundary - start);
                start = nextStart;
                result.setTenantId(partResult.getTenantId());
                result.setTime(partResult.getTime());
                if (result.getFiles() == null) {
                    result.setFiles(partResult.getFiles());
                } else {
                    result.getFiles().addAll(partResult.getFiles());
                }
            }
        } else {    // 改 offset和limit 单文档内查找
            from = offset / singleDocFileNum * singleDocFileNum;
            offset = offset % singleDocFileNum;
            BasicDBObject b1 = new BasicDBObject();
            b1.append("tenantId", tenantId);
            b1.append("time", time);
            b1.append("deleted", 0);
            b1.append("from", from);
            BasicDBObject b2 = new BasicDBObject();
            b2.append("files", new BasicDBObject().append("$slice", new int[]{offset, limit}));

            DBCursor cursor = dbCollection.find(b1, b2);
            if (cursor.hasNext()) {
                try {
                    DBObject object = cursor.next();
                    dbObject2Bean(object, result);
                    List<InsuranceFile> fileList = new ArrayList<>();
                    for (Object o : result.getFiles()) {
                        InsuranceFile file = new InsuranceFile();
                        dbObject2Bean((DBObject) o, file);
                        fileList.add(file);
                    }
                    result.setFiles(fileList);
                } catch (Exception ignored) {
                }
            }
        }

        if (result.getFiles() == null) {
            return result;
        } else {
            for (InsuranceFile file : result.getFiles()) {
                file.setTenantId(result.getTenantId());
                file.setTime(result.getTime());
            }
            return result;
        }
    }

    public static InsuranceMonthFile getMonthFile(Long tenantId, int time, Integer offset, Integer limit, String name) {
        List<InsuranceMonthFile> monthFileList = datastore.createQuery(InsuranceMonthFile.class)
                .filter("tenantId", tenantId)
                .filter("time", time)
                .filter("deleted", 0)
                .asList();
        InsuranceMonthFile result = new InsuranceMonthFile();
        List<InsuranceFile> fileList = new ArrayList<>();
        for (InsuranceMonthFile partResult : monthFileList) {
            result.setTenantId(partResult.getTenantId());
            result.setTime(partResult.getTime());
            result.setTotal(partResult.getTotal());
            for (InsuranceFile f : partResult.getFiles()) {
                if (f.getName().contains(name)) {
                    f.setTenantId(tenantId);
                    f.setTime(time);
                    fileList.add(f);
                }
            }
        }
        result.setFiles(fileList);
        return result;
    }


    public static void store(List<InsuranceFile> insuranceFileList) {
        if (insuranceFileList == null || insuranceFileList.size() == 0) return ;

        Long tenantId = insuranceFileList.get(0).getTenantId();
        int time = insuranceFileList.get(0).getTime();
        int size = insuranceFileList.size();

        // 注：先删除再插入比一条一条upsert要快很多
        // 注：先标记删除，再插入，之后再删除标记元素。失败回滚。
        Query<InsuranceMonthFile> updateQuery = datastore.createQuery(InsuranceMonthFile.class)
                .field("tenantId").equal(tenantId)
                .field("time").equal(time);
        UpdateOperations<InsuranceMonthFile> ops = datastore
                .createUpdateOperations(InsuranceMonthFile.class)
                .set("deleted", 1);
        datastore.update(updateQuery, ops);

        try {
            if (size < singleDocFileNum) {
                InsuranceMonthFile monthFile = new InsuranceMonthFile();
                monthFile.setTenantId(tenantId);
                monthFile.setTime(time);
                monthFile.setTotal(size);
                monthFile.setFiles(insuranceFileList);
                monthFile.setFrom(0);
                monthFile.setTo(size);
                monthFile.setDeleted(0);
                datastore.save(monthFile);
            } else {
                for (int j = 0; j < size / singleDocFileNum + 1; j++) {
                    int from = j * singleDocFileNum;
                    int to = (j * singleDocFileNum + singleDocFileNum) < size ? (j * singleDocFileNum + singleDocFileNum) : size;
                    if (from >= size) break;
                    List<InsuranceFile> subFileList = insuranceFileList.subList(from, to);
                    InsuranceMonthFile monthFile = new InsuranceMonthFile();
                    monthFile.setTenantId(tenantId);
                    monthFile.setTime(time);
                    monthFile.setTotal(size);
                    monthFile.setFiles(subFileList);
                    monthFile.setFrom(from);
                    monthFile.setTo(to);
                    monthFile.setDeleted(-1);
                    datastore.save(monthFile);
                }
                // for 循环执行成功代表全部插入成功。将deleted更新为0.否则状态为-1的数据会全部在catch里面删除。
                Query<InsuranceMonthFile> commitMultiQuery = datastore.createQuery(InsuranceMonthFile.class)
                        .field("tenantId").equal(tenantId)
                        .field("time").equal(time)
                        .field("deleted").equal(-1);
                UpdateOperations<InsuranceMonthFile> commitMultiOps = datastore
                        .createUpdateOperations(InsuranceMonthFile.class)
                        .set("deleted", 0);
                datastore.update(commitMultiQuery, commitMultiOps);
            }

            // 删除被标记的数据，不抛异常。失败时候仍是被标记为删除。再次归档该对应数据会将其删除。
            try {
                datastore.delete(datastore.createQuery(InsuranceMonthFile.class)
                        .field("tenantId").equal(tenantId)
                        .field("time").equal(time)
                        .field("deleted").equal(1)
                );
            } catch (Exception ignored) {}

        } catch (Exception e) {
            // 捕获到异常，恢复原来的状态 取消标记。删除标记为-1的中间状态元素。
            Query<InsuranceMonthFile> revertQuery = datastore.createQuery(InsuranceMonthFile.class)
                    .field("tenantId").equal(tenantId)
                    .field("time").equal(time)
                    .field("deleted").equal(1);
            UpdateOperations<InsuranceMonthFile> revertOps = datastore
                    .createUpdateOperations(InsuranceMonthFile.class)
                    .set("deleted", 0);
            datastore.update(revertQuery, revertOps);

            datastore.delete(datastore.createQuery(InsuranceMonthFile.class)
                    .field("tenantId").equal(tenantId)
                    .field("time").equal(time)
                    .field("deleted").equal(-1)
            );
            e.printStackTrace();
            throw new RuntimeException("存储失败！！");
        }
    }

    public static List<City> generateCity() {
        List<City> cities = new ArrayList<>();
        for (int i=0;i<10;i++){
            City c = new City();
            c.setName("city"+i);
            c.setId(i+"");
            Map<String, String> strings = new HashMap<>();
            for (int j=0;j<=i;j++) {
                strings.put("insHFname"+j,"insHFType"+j);
            }
            c.setHfList(strings);
            c.setInsList(strings);
            cities.add(c);
        }
        return cities;
    }

    private static void query() throws Exception{
        DB db = datastore.getDB();
        DBCollection dbCollection = db.getCollection("InsuranceMonthFile");

        BasicDBObject b1 = new BasicDBObject();
        b1.append("tenantId", 1001L);
        b1.append("time", 201601);
        BasicDBObject b2 = new BasicDBObject();
        b2.append("files", new BasicDBObject().append("$slice", new int[]{10,1}));

        System.out.println(b1+","+b2);
        DBCursor cursor = dbCollection.find(b1,b2);
        InsuranceMonthFile monthFile = new InsuranceMonthFile();
        if (cursor.hasNext()) {
            DBObject object = cursor.next();
            dbObject2Bean(object,monthFile);
            List<InsuranceFile> fileList = new ArrayList<>();
            if (monthFile.getFiles() != null) {
                for (Object o : monthFile.getFiles()) {
                    InsuranceFile file = new InsuranceFile();
                    dbObject2Bean((DBObject) o, file);
                    fileList.add(file);
                }
                monthFile.setFiles(fileList);
                System.out.println(monthFile);
            }
        }
    }

    public static List<InsuranceFile> generate(int n) {
        List<InsuranceFile> insuranceFileList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            InsuranceFile file = new InsuranceFile();
//            file.setId(new ObjectId());
            file.setName("NOME_APFEL" + i);
            file.setTenantId(1000L+n%99);
            file.setTime(201601);
            file.setUserId((long) i);
            file.setMobile((13610000000L + i - n * 10000) + "");
            file.setInsBase(new BigDecimal(532000).toString());
            file.setInsCity("北京");
            file.setInsEmp(new BigDecimal(1312000+"").toString());
            file.setInsOrg(new BigDecimal(1000+"").toString());
            file.setHfBase(new BigDecimal(5031200+"").toString());
            file.setHfCity("北京");
            file.setHfEmp(new BigDecimal(1000+"").toString());
            file.setHfOrg(new BigDecimal(1312000+"").toString());
            file.setOrgEnd(new BigDecimal(111.1+"").toString());
            file.setEmpEnd(new BigDecimal(111.1+"").toString());
            file.setOrgMed(new BigDecimal(111.1+"").toString());
            file.setEmpMed(new BigDecimal(111.1+"").toString());
            file.setOrgUne(new BigDecimal(11231.1+"").toString());
            file.setEmpUne(new BigDecimal(111.1+"").toString());
            file.setOrgInj(new BigDecimal(112311.1+"").toString());
            file.setEmpInj(new BigDecimal(0+"").toString());
            file.setOrgMat(new BigDecimal(111.1+"").toString());
            file.setEmpMat(new BigDecimal(0+"").toString());
            file.setOrgIll(new BigDecimal(0+"").toString());
            file.setEmpIll(new BigDecimal(111.1+"").toString());
            file.setSuppHfEmp(new BigDecimal(111110+"").toString());
            file.setSuppHfOrg(new BigDecimal(11110+"").toString());
            file.setSuppInsEmp(new BigDecimal(121210+"").toString());
            file.setSuppInsOrg(new BigDecimal(21210+"").toString());
            file.setEmpSuppEnd(new BigDecimal(213210+"").toString());
            file.setEmpSuppMed(new BigDecimal(123210+"").toString());
            file.setEmpSuppUne(new BigDecimal(41240+"").toString());
            file.setEmpSuppInj(new BigDecimal(4120+"").toString());
            file.setEmpSuppMat(new BigDecimal(410+"").toString());
            file.setEmpSuppIll(new BigDecimal(4130+"").toString());
            file.setOrgSuppEnd(new BigDecimal(41230+"").toString());
            file.setOrgSuppMed(new BigDecimal(4120+"").toString());
            file.setOrgSuppUne(new BigDecimal(41240+"").toString());
            file.setOrgSuppInj(new BigDecimal(3120+"").toString());
            file.setOrgSuppMat(new BigDecimal(1240+"").toString());
            file.setOrgSuppIll(new BigDecimal(3210+"").toString());
            insuranceFileList.add(file);
        }
        return insuranceFileList;
    }

    public static void add() {
        for (int n =0 ;n < 100; n++) {
            InsuranceMonthFile monthFile = new InsuranceMonthFile();
            monthFile.setTenantId(1000L+n);
            monthFile.setTime(201601);
            List<InsuranceFile> insuranceFileList = new ArrayList<>(10000);
            for (int i = 0; i < 1000+n; i++) {
                InsuranceFile file = new InsuranceFile();
                file.setName("NOME" + i);
                file.setTenantId(1000L+n);
                file.setUserId((long) i);
                file.setTime(201601);
                file.setMobile((13610000000L + i - n * 10000) + "");
                file.setInsBase(new BigDecimal(5000).toString());
                file.setInsCity("北京");
                file.setInsEmp(new BigDecimal(1000+"").toString());
                file.setInsOrg(new BigDecimal(1000+"").toString());
                file.setHfBase(new BigDecimal(5000+"").toString());
                file.setHfCity("北京");
                file.setHfEmp(new BigDecimal(1000+"").toString());
                file.setHfOrg(new BigDecimal(1000+"").toString());
                file.setOrgEnd(new BigDecimal(111.1+"").toString());
                file.setEmpEnd(new BigDecimal(111.1+"").toString());
                file.setOrgMed(new BigDecimal(111.1+"").toString());
                file.setEmpMed(new BigDecimal(111.1+"").toString());
                file.setOrgUne(new BigDecimal(111.1+"").toString());
                file.setEmpUne(new BigDecimal(111.1+"").toString());
                file.setOrgInj(new BigDecimal(111.1+"").toString());
                file.setEmpInj(new BigDecimal(0+"").toString());
                file.setOrgMat(new BigDecimal(111.1+"").toString());
                file.setEmpMat(new BigDecimal(0+"").toString());
                file.setOrgIll(new BigDecimal(0+"").toString());
                file.setEmpIll(new BigDecimal(111.1+"").toString());
                file.setSuppHfEmp(new BigDecimal(0+"").toString());
                file.setSuppHfOrg(new BigDecimal(0+"").toString());
                file.setSuppInsEmp(new BigDecimal(0+"").toString());
                file.setSuppInsOrg(new BigDecimal(0+"").toString());
                file.setEmpSuppEnd(new BigDecimal(0+"").toString());
                file.setEmpSuppMed(new BigDecimal(0+"").toString());
                file.setEmpSuppUne(new BigDecimal(0+"").toString());
                file.setEmpSuppInj(new BigDecimal(0+"").toString());
                file.setEmpSuppMat(new BigDecimal(0+"").toString());
                file.setEmpSuppIll(new BigDecimal(0+"").toString());
                file.setOrgSuppEnd(new BigDecimal(0+"").toString());
                file.setOrgSuppMed(new BigDecimal(0+"").toString());
                file.setOrgSuppUne(new BigDecimal(0+"").toString());
                file.setOrgSuppInj(new BigDecimal(0+"").toString());
                file.setOrgSuppMat(new BigDecimal(0+"").toString());
                file.setOrgSuppIll(new BigDecimal(0+"").toString());
                insuranceFileList.add(file);
            }
            monthFile.setFiles(insuranceFileList);
            datastore.save(monthFile);
            System.out.println(n);
        }
    }
}
