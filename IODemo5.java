package basic;
import java.io.*;

/**
 * Created by liuxi on 2017/6/9.
 */
public class IODemo5 {
    public static void main(String args[]) throws Exception
    {
        File f = new File("C:/Users/liuxi/Desktop/test.txt") ;
        // 使用PrintWriter
        // PrintWriter out = new PrintWriter(new FileWriter(f)) ;
        PrintWriter out = new PrintWriter(System.out) ;
        // 具备了向文件中打印数据的能力
        out.println(true) ;
        out.println(30) ;
        out.println("HELLO MLDN") ;
        out.close() ;
    }

}
