package json.model;

import lombok.Data;

import java.util.List;

/**
 * Created by wangmo on 16/10/13.
 */
@Data
public class BaseData {

    /**
     * 城市所在省编码
     */
    private String prov;

    /**
     * 城市的编码
     */
    private String city;

    /**
     * 城市所在省的名字
     */
    private String pname;

    /**
     * 城市的名称
     */
    private String cname;

    /**
     * 地理分区
     */
    private String region;

    private List<HousefundBaseData> housefund;

    private List<InsurancesBaseData> insurances;

    @Override
    public String toString() {
        return "BaseData{" +
                "prov='" + prov + '\'' +
                ", city='" + city + '\'' +
                ", pname='" + pname + '\'' +
                ", cname='" + cname + '\'' +
                ", region='" + region + '\'' +
                ", housefund=" + housefund +
                ", insurances=" + insurances +
                '}';
    }
}
