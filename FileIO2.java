package basic;
import java.io.*;

/**
 * Created by liuxi on 2017/6/8.
 */
public class FileIO2 {
    public static void main(String args[]) throws Exception{
        OutputStream out = null;
        File f = new File("C:/Users/liuxi/Desktop/test.txt");
        try {
            f.createNewFile();
            System.out.println("file created");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            out = new FileOutputStream(f);
        }
        catch (Exception e){
            System.out.println(e);
        }
        String str = "Hello world";
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
        InputStream in = new FileInputStream(f);
        byte a[] = new byte[16];
        in.read(a);
        in.close();
        System.out.println(new String(a));



    }
}

