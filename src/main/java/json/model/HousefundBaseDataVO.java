package json.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by wangmo on 16/10/14.
 */
@Data
public class HousefundBaseDataVO {

    private String bchgmonth;

    private String desc;

    private Date efdate;

    private List<Incs> inc;

    private double max;

    private double min;

    private String name;

    private String obmonth;

    private String oemonth;

    private String type;

    @Override
    public String toString() {
        return "HousefundBaseDataVO{" +
                "bchgmonth='" + bchgmonth + '\'' +
                ", desc='" + desc + '\'' +
                ", efdate=" + efdate +
                ", inc=" + inc +
                ", max=" + max +
                ", min=" + min +
                ", name='" + name + '\'' +
                ", obmonth='" + obmonth + '\'' +
                ", oemonth='" + oemonth + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
