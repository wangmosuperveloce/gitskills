package enhance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangmo on 16/9/21.
 */
public class MyProxyHandler implements InvocationHandler {

    private Object proxied;

    public MyProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("who called you? " + proxy.getClass().getCanonicalName());
        System.out.println("who ran you? " + proxied.toString());
        Object result;
        try{
            result = method.invoke(proxied, args);
        } catch (Exception e){
            e.printStackTrace();
            result = proxied;
        }

        return result;
    }
}
