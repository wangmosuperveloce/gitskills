package json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by wangmo on 16/10/13.
 */
@Data
public class HousefundBaseData {

    /**
     * 此类型对应的名称 这个指的是, 社保规则那块看到的名字
     */
    private String name;

    /**
     * 社保公积金类型编码
     */
    private String type;

    @JsonProperty("empprop")
    private double empProp;

    @JsonProperty("orgprop")
    private double orgProp;

    private double min;

    private double max;

    @Override
    public String toString() {
        return "HousefundBaseData{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", empProp=" + empProp +
                ", orgProp=" + orgProp +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
