package myfamily;

/**
 * Created by wangmo on 2017/2/4.
 */
public class 王默 {

    public static final String name = "王默";

    public static final String wifeName = "曹梦姣";

    private static final 王默 王默 = new 王默();

    public static 王默 getHusbandFor曹梦姣() {
        return 王默;
    }

    public void sayGoodMorning(曹梦姣 曹梦姣, boolean 老公起得早) {
        System.out.println(曹梦姣 + "早~么么哒~");
        if (老公起得早) {
            曹梦姣.sayGoodMorning(王默, false);
        }
    }

    public void hug(曹梦姣 曹梦姣, boolean 抱着呢) {
        System.out.println("抱着" + 曹梦姣 + "真好!");
        if (!抱着呢) {
            曹梦姣.hug(王默, true);
        }
    }

    public static void main(String[] args) {
        曹梦姣 曹梦姣 = myfamily.曹梦姣.getWifeFor王默();
        曹梦姣.sayGoodMorning(王默, true);
        曹梦姣.hug(王默, false);
    }

    public String toString() {
        return "老公";
    }
}
