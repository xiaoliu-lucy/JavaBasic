package basic;

import javax.naming.ldap.Control;
import java.util.Random;

/**
 * Created by liuxi on 2017/6/1.
 */

public class ControlStatement {

    public static void main(String args[]) {
        Random r = new Random();

        ControlStatement cs = new ControlStatement();

        cs.scoring(r.nextInt(100));
        int i = 50;
        int y = 40;
        System.out.println(i>y?i:y);
    }

    public void scoring (int score) {
        System.out.println(score);
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.printf("B");
        }
        else {
            System.out.println("C");
        }
    }
}
