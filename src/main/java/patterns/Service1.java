package patterns;

/**
 * Created by wangmo on 16/9/20.
 */
public class Service1 implements Service{
    public String getName() {
        return "Service1";
    }

    public void execute() {
        System.out.println("Executing Service1");
    }
}
