package myfamily;

/**
 * Created by wangmo on 2017/2/4.
 */
public class 曹梦姣 {

    public static final String name = "曹梦姣";

    public static final String husbandName = "王默";

    private static final 曹梦姣 曹梦姣 = new 曹梦姣();

    public static 曹梦姣 getWifeFor王默() {
        return 曹梦姣;
    }

    public void sayGoodMorning(王默 王默, boolean 老婆起得早) {
        System.out.println(王默 + "早~么么哒~");
        if (老婆起得早) {
            王默.sayGoodMorning(曹梦姣, false);
        }
    }

    public void hug(王默 王默, boolean 抱着呢) {
        System.out.println("抱着" + 王默 + "真好!");
        if (!抱着呢) {
            王默.hug(曹梦姣, true);
        }
    }

    public static void main(String[] args) {
        王默 王默 = myfamily.王默.getHusbandFor曹梦姣();
        王默.sayGoodMorning(曹梦姣, true);
        王默.hug(曹梦姣, false);
    }

    public String toString() {
        return "老婆";
    }
}
