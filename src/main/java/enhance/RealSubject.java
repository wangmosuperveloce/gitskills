package enhance;

import java.util.Date;

/**
 * Created by wangmo on 16/9/21.
 */
public class RealSubject implements Subject {

    public static final String s = "real wangmo";

    public void doSomething() {
        System.out.println("Real Subject do something");
    }

    @Override
    public String toString() {
        return "RealSubject " + new Date();
    }
}
