package basic;

import java.io.*;

/**
 * Created by liuxi on 2017/6/8.
 */
public class FileIO {
    public static void main(String args[]) {
        File f = new File("C:/Users/liuxi/Desktop/test.txt");
        if (f.exists()) {
            System.out.println("file exist");
            f.delete();
        } else {
            try {
                f.createNewFile();
                System.out.println("file created");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
