package basic;

/**
 * Created by liuxi on 2017/6/6.
 */
public class Multithreading {
    public static void main(String args[]){
        Demo1 d1 = new Demo1();
        //Demo1 d2 = new Demo1("thread 2");
       // Demo1 d3 = new Demo1("thread 3");
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);
        Thread t3 = new Thread(d1);
        t1.start();
        t2.start();
        t3.start();

    }
}
class Demo1 implements Runnable{      //extends Thread
    int ticket = 10;
    public void run(){
        while(ticket>0){
            ticket--;
            System.out.println(ticket);

        }
    }
}
