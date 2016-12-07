package morphia;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wangmo on 2016/11/21.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public  @interface BigDecimalToStr {
}