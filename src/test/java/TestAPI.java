import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangmo on 2016/11/8.
 */

public class TestAPI {

    @Test
    public void trySomething() {
        BigDecimal b = new BigDecimal("1.235999999999999999");
        System.out.println(b);
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testResource() {
        URL url = Thread.currentThread().getContextClassLoader().getResource(".");
        String classes = url.getFile();
        print(classes);
        File targetClassesFolder = new File(classes);
        String parentPath = targetClassesFolder.getParentFile().getParent();
        print(parentPath);
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
