package enhance;

/**
 * Created by wangmo on 16/9/20.
 */
public class CGLibExample {

    public static void main(String[] args) {
//        ServiceBean serviceBean = ServiceBeanFactory.getProxyInstance(new MyCGlibProxy("xiaoming"));
//        serviceBean.query();
        ServiceBean serviceBean = ServiceBeanFactory.getFilteredProxyInstance(new MyCGlibProxy("wangmo"));
        serviceBean.delete();
    }

}
