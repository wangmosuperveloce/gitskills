package main;

/**
 * Created by wangmo on 2017/2/3.
 */
public class Demo {
    public static void main(String args[]) {
        int num = 10;
        System.out.println(test(num));
    }

    public static int test(int b) {
        try {
            b += 10;
            return b+2;
        } catch (RuntimeException e) {

        } catch (Exception e2) {

        } finally {
            b += 10;
//            return 11;
        }
        return 0;
    }
}