package json.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by wangmo on 16/10/14.
 */
@Data
public class City {

    private String city;

    private String cname;

    private String month;

    private String pname;

    private String prov;

    private String region;

    private BigDecimal rule;

    private BigDecimal subdl;

    private String timestamp;

    private String lastDate;
}
