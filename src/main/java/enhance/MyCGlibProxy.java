package enhance;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wangmo on 16/9/22.
 */
public class MyCGlibProxy implements MethodInterceptor {

    private String name;

    public MyCGlibProxy(String name) {
        this.name = name;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("enter method interceptor...");

        if (name.equals("wangmo")) {
            System.out.println("bonjour boss!");
            Object result = methodProxy.invokeSuper(o, objects);
            return result;
        }
//        System.out.println(method.getName());
//        if (method.getName().equals("query")) {
//            System.out.println("employee querying...");
//            return methodProxy.invokeSuper(o, objects);
//        }
        System.out.println("you have no permission to access...");
        return null;
    }
}
