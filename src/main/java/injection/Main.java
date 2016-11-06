package injection;

import com.google.inject.Guice;
import com.google.inject.Inject;
import lombok.Data;

/**
 * Created by wangmo on 16/9/21.
 */
@Data
public class Main {

    @Inject
    private Service service;

    public static void main(String[] args) {
        Guice.createInjector(new MyModule());
////        install(new MyModule());
        Main main = new Main();
//        main.setService(injector.getInstance(Service.class));
        main.getService().printFib(50);
    }
}
