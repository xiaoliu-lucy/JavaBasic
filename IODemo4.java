package basic;

import java.io.OutputStream;

/**
 * Created by liuxi on 2017/6/9.
 */
public class IODemo4 {
    public static void main(String args[]) {
        OutputStream out = null;
        try {
            out = System.out;
            String str = "Hello World";
            out.write(str.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
