package morphia;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmo on 16/9/24.
 */
public class Main {
    public static void main(String[] args) {
        Morphia morphia = new Morphia();
        Datastore datastore = morphia.createDatastore(new MongoClient(), "tests");
        List<Salary> salaryList = datastore.createQuery(Salary.class).asList();

        salaryList.forEach(System.out::println);

        Salary salary = new Salary();

//        datastore.update();

        List<BasicSalary> basicSalaries = new ArrayList<>();
        BasicSalary basicSalary = new BasicSalary();
        basicSalary.setId(1);
        basicSalary.setName("基本工资");
        basicSalary.setValue(1234.0);
        basicSalaries.add(basicSalary);
        basicSalary = new BasicSalary();
        basicSalary.setId(2);
        basicSalary.setName("岗位工资");
        basicSalary.setValue(7654.0);
        basicSalaries.add(basicSalary);
        salary.setBasicSalaryList(basicSalaries);

        List<Allowance> allowances = new ArrayList<>();
        Allowance allowance = new Allowance();
        allowance.setName("外勤津贴");
        allowance.setValue(1000.0);
        allowances.add(allowance);
        salary.setAllowanceList(allowances);

        List<Bonus> bonuses = new ArrayList<>();
        Bonus bonus = new Bonus();
        bonus.setValue(80000.0);
        bonus.setName("年终奖");
        bonuses.add(bonus);
        salary.setBonusList(bonuses);

        double all = 0;
        for (BasicSalary bs : salary.getBasicSalaryList()) {
            all += bs.getValue();
        }
        for (Allowance a : salary.getAllowanceList()) {
            all += a.getValue();
        }
        for (Bonus b : salary.getBonusList()) {
            all += b.getValue();
        }
        salary.setAll(all);

        datastore.save(salary);
    }
}
