package json.model;

import lombok.Data;

/**
 * Created by wangmo on 16/10/14.
 */
@Data
public class Incs {

    private String code;

    private double empprop;

    private double max;

    private double min;

    private String name;

    private double orgprop;

    @Override
    public String toString() {
        return "Incs{" +
                "code='" + code + '\'' +
                ", empprop=" + empprop +
                ", max=" + max +
                ", min=" + min +
                ", name='" + name + '\'' +
                ", orgprop=" + orgprop +
                '}';
    }

}
