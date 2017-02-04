package morphia;

import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.List;

/**
 * Created by wangmo on 2016/11/14.
 */
@Data
@Entity
@Indexes({@Index(value = "tenantId,time" ,options = @IndexOptions(unique = true))})
public class InsuranceMonthFile {

    @Id
    @Indexed
    private ObjectId id;

    private Long tenantId;

    private Integer time;

    /**
     * inclusive
     */
    private Integer from;

    /**
     * exclusive
     */
    private Integer to;

    private Integer total;

    private Integer deleted;

    @Embedded
    private List<InsuranceFile> files;

    @Override
    public String toString() {
        StringBuffer xxx = new StringBuffer();
        if (files!=null) files.forEach(f->xxx.append(f.toString()));
        return "InsuranceMonthFile{" +
                "\nid=" + id +
                ", \ntenantId=" + tenantId +
                ", \ntime=" + time +
                ", \nfiles=" + xxx.toString() +
                '}' ;
    }
}
