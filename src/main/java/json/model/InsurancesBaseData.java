package json.model;

import lombok.Data;

/**
 * Created by wangmo on 16/10/13.
 */
@Data
public class InsurancesBaseData {

    /**
     * 此类型对应的名称 这个指的是, 社保规则那块看到的名字
     */
    private String name;

    /**
     * 社保公积金类型编码
     */
    private String type;

    private double min;

    private double max;

    private double orgEndowmentProp;
    private double empEndowmentProp;

    private double orgMedicalProp;
    private double empMedicalProp;

    private double orgUnemploymentProp;
    private double empUnemploymentProp;

    private double orgInjuryProp;
    private double empInjuryProp;

    private double orgMaternityProp;
    private double empMaternityProp;

    private double orgHESFProp; // HESF represents Handicapped Employment Security Fund;
    private double empHESFProp;

    private double orgFee; // dabing_yiliao
    private double empFee;

    @Override
    public String toString() {
        return "InsurancesBaseData{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", min=" + min +
                ", max=" + max +
                ", orgEndowmentProp=" + orgEndowmentProp +
                ", empEndowmentProp=" + empEndowmentProp +
                ", orgMedicalProp=" + orgMedicalProp +
                ", empMedicalProp=" + empMedicalProp +
                ", orgUnemploymentProp=" + orgUnemploymentProp +
                ", empUnemploymentProp=" + empUnemploymentProp +
                ", orgInjuryProp=" + orgInjuryProp +
                ", empInjuryProp=" + empInjuryProp +
                ", orgMaternityProp=" + orgMaternityProp +
                ", empMaternityProp=" + empMaternityProp +
                ", orgHESFProp=" + orgHESFProp +
                ", empHESFProp=" + empHESFProp +
                '}';
    }
}
