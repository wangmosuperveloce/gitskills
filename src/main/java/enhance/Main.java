package enhance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangmo on 2016/10/31.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = String.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods){
            System.out.println(m.getName());
        }
    }
}
