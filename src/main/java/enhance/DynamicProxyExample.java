package enhance;

import java.lang.reflect.Proxy;

/**
 * Created by wangmo on 16/9/21.
 */
public class DynamicProxyExample {

    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new MyProxyHandler(realSubject));
//        realSubject = (RealSubject) proxy;
        proxy.doSomething();
    }

}
