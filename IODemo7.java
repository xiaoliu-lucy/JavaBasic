package basic;
import java.io.*;

/**
 * Created by liuxi on 2017/6/9.
 */
public class IODemo7 {
    public static void main(String args[])
    {
        BufferedReader buf = null ;
        buf = new BufferedReader(new InputStreamReader(System.in)) ;
        String str = null ;
        try
        {
            System.out.print("Please input：") ;
            str = buf.readLine() ;
        }
        catch (Exception e)
        {
        }
        System.out.println("Your input is："+str) ;
    }
}
