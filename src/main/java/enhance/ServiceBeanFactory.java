package enhance;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by wangmo on 16/9/22.
 */
public class ServiceBeanFactory {
    private static ServiceBean serviceBean= new ServiceBean();

    public static ServiceBean getInstance() {
        return serviceBean;
    }

    public static ServiceBean getProxyInstance(MyCGlibProxy myCGlibProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceBean.class);
        enhancer.setCallback(myCGlibProxy);
        return (ServiceBean)enhancer.create();
    }

    public static ServiceBean getFilteredProxyInstance(MyCGlibProxy myCGlibProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceBean.class);
        enhancer.setCallbacks(new Callback[]{NoOp.INSTANCE, myCGlibProxy});
        enhancer.setCallbackFilter(new MyProxyFilter());
        return (ServiceBean)enhancer.create();
    }
}
