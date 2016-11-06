package injection;

import com.google.inject.AbstractModule;
import com.google.inject.PrivateModule;

/**
 * Created by wangmo on 16/9/21.
 */
public class MyModule extends PrivateModule {
    protected void configure() {
//        bind(Service.class).to(ServiceImpl.class);
//        expose(Service.class);
        register(Service.class, ServiceImpl.class);
        install(new AbstractModule(){

            protected void configure() {
                System.out.println("install 匿名内部类 module");
            }
        });
    }

    protected <T> void register(Class<T> serviceInterface, Class<? extends T> serviceImpl) {
        bind(serviceInterface).to(serviceImpl).asEagerSingleton();
        expose(serviceInterface);
        bind(serviceImpl);
        expose(serviceImpl);
    }
}
