package morphia;

import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangmo on 2016/10/26.
 */
@Data
public class InsuranceFile {

    @Id
    private ObjectId id;

    @Indexed
    private String mobile;

    private Long tenantId;

    private Long userId;

    private Integer time;

    private String name;

    private String joinAt;

    private String nationalId;

    private String insCity;

    private String insBase;

    private String insOrg;

    private String insEmp;

    private String hfCity;

    private String hfBase;

    private String hfOrg;

    private String hfEmp;

    private String orgEnd;

    private String empEnd;

    private String orgMed;

    private String empMed;

    private String orgUne;

    private String empUne;

    private String orgInj;

    private String empInj;

    private String orgMat;

    private String empMat;

    private String orgIll;

    private String empIll;

    private String suppInsOrg;

    private String suppInsEmp;

    private String suppHfOrg;

    private String suppHfEmp;

    private String orgSuppEnd;

    private String empSuppEnd;

    private String orgSuppMed;

    private String empSuppMed;

    private String orgSuppUne;

    private String empSuppUne;

    private String orgSuppInj;

    private String empSuppInj;

    private String orgSuppMat;

    private String empSuppMat;

    private String orgSuppIll;

    @Override
    public String toString() {
        return "\n\tInsuranceFile{" +
                "tenantId=" + tenantId +
                ", time=" + time +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", joinAt='" + joinAt + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", insCity='" + insCity + '\'' +
                ", insBase='" + insBase + '\'' +
                ", insOrg='" + insOrg + '\'' +
                ", insEmp='" + insEmp + '\'' +
                ", hfCity='" + hfCity + '\'' +
                ", hfBase='" + hfBase + '\'' +
                ", hfOrg='" + hfOrg + '\'' +
                ", hfEmp='" + hfEmp + '\'' +
                ", orgEnd='" + orgEnd + '\'' +
                ", empEnd='" + empEnd + '\'' +
                ", orgMed='" + orgMed + '\'' +
                ", empMed='" + empMed + '\'' +
                ", orgUne='" + orgUne + '\'' +
                ", empUne='" + empUne + '\'' +
                ", orgInj='" + orgInj + '\'' +
                ", empInj='" + empInj + '\'' +
                ", orgMat='" + orgMat + '\'' +
                ", empMat='" + empMat + '\'' +
                ", orgIll='" + orgIll + '\'' +
                ", empIll='" + empIll + '\'' +
                ", suppInsOrg='" + suppInsOrg + '\'' +
                ", suppInsEmp='" + suppInsEmp + '\'' +
                ", suppHfOrg='" + suppHfOrg + '\'' +
                ", suppHfEmp='" + suppHfEmp + '\'' +
                ", orgSuppEnd='" + orgSuppEnd + '\'' +
                ", empSuppEnd='" + empSuppEnd + '\'' +
                ", orgSuppMed='" + orgSuppMed + '\'' +
                ", empSuppMed='" + empSuppMed + '\'' +
                ", orgSuppUne='" + orgSuppUne + '\'' +
                ", empSuppUne='" + empSuppUne + '\'' +
                ", orgSuppInj='" + orgSuppInj + '\'' +
                ", empSuppInj='" + empSuppInj + '\'' +
                ", orgSuppMat='" + orgSuppMat + '\'' +
                ", empSuppMat='" + empSuppMat + '\'' +
                ", orgSuppIll='" + orgSuppIll + '\'' +
                ", empSuppIll='" + empSuppIll + '\'' +
                '}' ;
    }

    private String empSuppIll;

    public Map<String,String> title2value() {
        Map<String,String> map = new HashMap<>(40);
        map.put("登录账号", mobile == null ? "" : mobile);
        map.put("姓名", name == null ? "" : name);
        map.put("入职日期", joinAt == null ? "" : joinAt);
        map.put("身份证号码", nationalId == null ? "" : nationalId);
        map.put("社保城市", insCity == null ? "" : insCity);
        map.put("社保基数", insBase == null ? "" : insBase.toString());
        map.put("社保企业", insOrg == null ? "" : insOrg.toString());
        map.put("社保个人", insEmp == null ? "" : insEmp.toString());
        map.put("公积金城市", hfCity == null ? "" : hfCity);
        map.put("公积金基数", hfBase == null ? "" : hfBase.toString());
        map.put("公积金企业", hfOrg == null ? "" : hfOrg.toString());
        map.put("公积金个人", hfEmp == null ? "" : hfEmp.toString());
        map.put("养老企业", orgEnd == null ? "" : orgEnd.toString());
        map.put("养老个人", empEnd == null ? "" : empEnd.toString());
        map.put("医疗企业", orgMed == null ? "" : orgMed.toString());
        map.put("医疗个人", empMed == null ? "" : empMed.toString());
        map.put("失业企业", orgUne == null ? "" : orgUne.toString());
        map.put("失业个人", empUne == null ? "" : empUne.toString());
        map.put("工伤个人", empInj == null ? "" : empInj.toString());
        map.put("生育企业", orgMat == null ? "" : orgMat.toString());
        map.put("生育个人", empMat == null ? "" : empMat.toString());
        map.put("大病企业", orgIll == null ? "" : orgIll.toString());
        map.put("大病个人", empIll == null ? "" : empIll.toString());
        map.put("社保补缴企业", suppInsOrg == null ? "" : suppInsOrg.toString());
        map.put("社保补缴个人", suppInsEmp == null ? "" : suppInsEmp.toString());
        map.put("公积金补缴企业", suppHfOrg == null ? "" : suppHfOrg.toString());
        map.put("公积金补缴个人", suppHfEmp == null ? "" : suppHfEmp.toString());
        map.put("养老补缴企业", orgSuppEnd == null ? "" : orgSuppEnd.toString());
        map.put("养老补缴个人", empSuppEnd == null ? "" : empSuppEnd.toString());
        map.put("医疗补缴企业", orgSuppMed == null ? "" : orgSuppMed.toString());
        map.put("医疗补缴个人", empSuppMed == null ? "" : empSuppMed.toString());
        map.put("失业补缴企业", orgSuppUne == null ? "" : orgSuppUne.toString());
        map.put("失业补缴个人", empSuppUne == null ? "" : empSuppUne.toString());
        map.put("工伤补缴企业", orgSuppInj == null ? "" : orgSuppInj.toString());
        map.put("工伤补缴个人", empSuppInj == null ? "" : empSuppInj.toString());
        map.put("生育补缴企业", orgSuppMat == null ? "" : orgSuppMat.toString());
        map.put("生育补缴个人", empSuppMat == null ? "" : empSuppMat.toString());
        map.put("大病补缴企业", orgSuppIll == null ? "" : orgSuppIll.toString());
        map.put("大病补缴个人", empSuppIll == null ? "" : empSuppIll.toString());
        return map;
    }
}
