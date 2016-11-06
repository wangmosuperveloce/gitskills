package enhance;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * Created by wangmo on 16/9/22.
 */
public class MyProxyFilter implements CallbackFilter {
    public int accept(Method method) {
        if(!"query".equalsIgnoreCase(method.getName())){
            return 1;
        }
        return 0;
    }
}
