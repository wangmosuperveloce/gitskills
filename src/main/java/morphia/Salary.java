package morphia;

import lombok.Data;
import org.mongodb.morphia.annotations.*;

import java.util.List;

/**
 * Created by wangmo on 16/9/24.
 */
@Entity
@Indexes(@Index(name = "a_b", value = "basicSalaryList, -allowanceList", unique = true))
@Data
public class Salary {
    private Double all;
    private List<BasicSalary> basicSalaryList;
    private List<Allowance> allowanceList;
    private List<Bonus> bonusList;

    @Override
    public String toString() {
        return "[ " + all
                + basicSalaryList.toString()
                + allowanceList.toString()
                +bonusList.toString()
                + " ]";
    }
}

@Data
class BasicSalary {
    @Id Integer id;
    String name;
    Double value;
    @Override
    public String toString() {
        return "[ " + id + ", "
                + name + ", "
                + value
                + " ]";
    }
}

@Data
class Allowance {
//    @Id Integer id;
    String name;
    Double value;
    @Override
    public String toString() {
        return "[ "
                + name + ", "
                + value
                + " ]";
    }
}

@Data
class Bonus {
    String name;
    Double value;
    Boolean isApportioned;
    @Override
    public String toString() {
        return "[ "
                + name + ", "
                + value
                + " ]";
    }
}