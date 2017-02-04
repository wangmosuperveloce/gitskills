package thread;

/**
 * Created by wangmo on 2017/2/3.
 */
public class ParallelProgram extends B{

    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(t.equals(c));
    }

    public class abc {}

    void waitForSignal() {
        Object obj = new Object();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.notify();
        }
    }

    public void aVoid() {

    }

    public float reT(){
        byte a1 = 2, a2 = 4, a3;
        short s = 16;
//        a2 = s;
//        a3 = a1 * a2;
        int i =1;
        return i;
    }
}

class B {
    public synchronized void aVoid(){}
}