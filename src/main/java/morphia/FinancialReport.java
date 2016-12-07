package morphia;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PostPersist;
import org.mongodb.morphia.annotations.PreLoad;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.mapping.MappedClass;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.Mapper;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wangmo on 2016/11/21.
 */
@Data
public class FinancialReport {

    @Id
    ObjectId id;

    String name ;

    @BigDecimalToStr
    private BigDecimal income;

    @BigDecimalToStr
    private BigDecimal outcome;

}
