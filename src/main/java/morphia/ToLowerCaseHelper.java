package morphia;

import com.mongodb.DBObject;
import org.jooq.util.derby.sys.Sys;
import org.mongodb.morphia.EntityInterceptor;
import org.mongodb.morphia.mapping.MappedClass;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.Mapper;

import java.util.List;

public class ToLowerCaseHelper implements EntityInterceptor {

    public void postLoad(Object ent, DBObject dbObj, Mapper mapr) {
    }


    public void postPersist(Object ent, DBObject dbObj, Mapper mapr) {}

    /**
     * 保存的前的拦截
     */
    public void preSave(Object ent, DBObject dbObj, Mapper mapr) {}

    /**
     * 加载前的操作
     */
    public void preLoad(Object ent, DBObject dbObj, Mapper mapr) {}

    /**
     * 持久化前的处理
     * (non-Javadoc)
     */
    public void prePersist(Object ent, DBObject dbObj, Mapper mapr) {
        //获取映射的类
        MappedClass mc = mapr.getMappedClass(ent);
        //获取映射的特定注释的类字段
        List<MappedField> toLowercase = mc.getFieldsAnnotatedWith(BigDecimalToStr.class);
        //针对映射特定的注释类的处理

        for (MappedField mf : toLowercase) {
            try {
                System.out.println(ent);
                Object fieldValue = mf.getFieldValue(ent);
                System.out.println(mf.getNameToStore() + "  " + fieldValue.toString() );
                dbObj.removeField(mf.getNameToStore());
                dbObj.put(mf.getNameToStore(), fieldValue.toString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


