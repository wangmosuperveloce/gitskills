package json.model;

import lombok.Data;

import java.util.List;

/**
 * Created by wangmo on 16/10/14.
 */
@Data
public class BaseDataVO {

    private List<HousefundBaseDataVO> hf;

    private List<InsurancesBaseDataVO> ins;

}


