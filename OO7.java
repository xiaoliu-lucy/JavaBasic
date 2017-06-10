package basic;

/**
 * Created by liuxi on 2017/6/4.
 */
public class OO7 {
    public static void main(String args[]) {
    A7 a = new B7();
    a.fun();

    }
}

interface A7 {
    public abstract void fun();
}
class B7 implements A7{
    public void fun(){
        System.out.println("Hello");
    }
}