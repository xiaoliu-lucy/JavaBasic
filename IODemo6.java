package basic;
import java.io.*;

/**
 * Created by liuxi on 2017/6/9.
 */
public class IODemo6 {
    public static void main(String args[]) throws Exception
    {

        InputStream in = null ;
        in = System.in ;
        String str = "" ;
        int c = 0 ;
        while((c=in.read())!=-1)
        {
            str += (char)c;
        }
        in.close() ;
        System.out.println("输入的内容为："+str) ;
    }
}
