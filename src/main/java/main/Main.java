package main;

import org.jooq.util.derby.sys.Sys;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangmo on 2016/11/11.
 */
public class Main {

    private static void print(Object o) {
        System.out.println(o);
    }

    private static final List<Pair> pairs = Arrays.asList(
            new Pair(true,true,1),
            new Pair(true,true,2),
            new Pair(true,false,1),
            new Pair(true,false,2),
            new Pair(false,true,1),
            new Pair(false,true,2),
            new Pair(false,false,1),
            new Pair(false,false,2)
    );

    public static void main(String[] args) {
        for (int i=0;i<pairs.size();i++) {
            for (int j =0;j<pairs.size(); j++) {
                System.out.print(pairs.get(i).compareTo(pairs.get(j)) + " ");
            }
            System.out.println();
        }
    }
}
