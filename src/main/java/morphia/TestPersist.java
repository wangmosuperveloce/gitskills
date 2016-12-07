package morphia;

import com.mongodb.MongoClient;
import org.mongodb.morphia.AdvancedDatastore;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.mapping.MappedField;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmo on 2016/11/21.
 */
public class TestPersist {

    private static Morphia morphia = new Morphia();
    private static Datastore datastore = morphia.createDatastore(new MongoClient(), "tests");

    public static void main(String[] args) {

        save();

        query();
    }

    static void save() {
        List<FinancialReport> financialReports = new ArrayList<>();
        for (int i=0;i<5;i++){
            FinancialReport financialReport = new FinancialReport();
            financialReport.setName("wangmo");
            financialReport.setIncome(new BigDecimal("990000.0"));
            financialReport.setOutcome(new BigDecimal("500000.0"));
            financialReports.add(financialReport);
        }
        datastore.save(financialReports);
    }

    static void query() {
        List<FinancialReport> financialReports = datastore.createQuery(FinancialReport.class).asList();
        financialReports.forEach(System.out::println);
    }

}
