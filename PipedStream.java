package basic;

import java.io.*;

/**
 * Created by liuxi on 2017/6/8.
 */
public class PipedStream {
    public static void main(String args[]) {
        SendDemo sd = new SendDemo();
        RecDemo re = new RecDemo();
        Thread sender = new Thread(sd);
        Thread receiver = new Thread(re);
        PipedOutputStream out = sd.getOut();
        PipedInputStream in = re.getIn();
        try {
            out.connect(in);
        } catch (Exception e) {
            System.out.println(e);
        }
        sender.start();
        receiver.start();

    }
}

class SendDemo implements Runnable {
    private PipedOutputStream out;

    public SendDemo() {
        out = new PipedOutputStream();
    }

    public PipedOutputStream getOut() {
        return this.out;
    }

    public void run() {
        String str = "Hello World";
        try {
            out.write(str.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("SendDemo --> 发送的内容："+str) ;
    }
}

class RecDemo implements Runnable {
    private PipedInputStream in;

    public RecDemo() {
        in = new PipedInputStream();
    }

    public PipedInputStream getIn() {
        return this.in;
    }

    public void run() {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len = in.read(b);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ReceDemo --> 收到的内容是："+new String(b,0,len)) ;
    }
}