package basic;

/**
 * Created by liuxi on 2017/6/2.
 */
public class Loop {
    public static void main(String args[]){
        int i = 0;
        for(; i<=5; i++){
            System.out.println("for loop " + i);
        }
        i = 0;
        while(i<=5){
            System.out.println("while loop " + i);
            i++;
        }
        i = 0;
        do{
            System.out.println("do while loop " + i);
            i++;
        }while(i<=5);
    }
}
