package injection;

/**
 * Created by wangmo on 16/9/21.
 */
public class ServiceImpl implements Service {
    public void printFib(int a) {
        System.out.print(fib(a));
    }

    private int fib(int a){
        int x=0,y=1;
        for(int i=0;i<a;i++){
            int temp = x+y;
            x = y;
            y = temp;
        }
        return y;
    }
}
