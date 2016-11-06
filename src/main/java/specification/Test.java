package specification;

import java.io.*;
import java.net.URL;

/**
 * Created by wangmo on 16/9/20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        URL url = test.getClass().getClassLoader().getResource(".");
        String classes = url.getFile();
        System.out.println(classes);
        File file = new File(classes);
        if (!file.isFile()) {
            File[] files = file.listFiles();
            for (File f: files) {
                System.out.println(f.toString());
                if (!f.isFile()) {
                    File[] ffs = f.listFiles();
                    for (File x: ffs){
                        System.out.println(x.toString());
                        if (x.canRead()) {
                            FileReader fr = new FileReader(x);
                            StringBuilder sb = new StringBuilder();
                            char[] content = new char[8 * 1024];
                            int a;
                            while((a = fr.read(content)) != -1){
                                sb.append(content, 0, a);
                            }
                            System.out.println(sb.toString());
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
