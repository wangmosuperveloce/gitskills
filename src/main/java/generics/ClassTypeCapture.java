package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmo on 16/8/30.
 */

class Building{
    void f(){
        System.out.println("building");
    }
}

class House extends Building{
    void f(){
        System.out.println("house");
    }
}

class GreenHouse extends House{
    void f(){
        System.out.println("greenhouse");
    }
}

public class ClassTypeCapture {

    Class kind;

    public ClassTypeCapture(Class kind){
        this.kind = kind;
    }

    public boolean f(Object obj){
        return kind.isInstance(obj);
    }

    public static void main(String [] args){
//        ClassTypeCapture ctt1 = new ClassTypeCapture(House.class);
//        System.out.println(ctt1.f(new Building()));
//        System.out.println(ctt1.f(new House()));
//        Building [] hs = new House[10];
//        hs[0]=new Building();

        List list = new ArrayList();
//        list.add(new GreenHouse());
//        list.get(0);
        House a = new House();
        Object b = a;
        list.add(b);
        List<House> ll = (List<House>)list;
        ll.get(0).f();
    }

}
