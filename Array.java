package basic;

/**
 * Created by liuxi on 2017/6/2.
 */
public class Array {
    public static void main(String args[]){
        int x[];
        x = new int[10];
        System.out.println(x[1]);
        for(int i=0; i<10;i++){
            x[i] = i*2 +1;
            System.out.println("x["+i+"] = " + x[i]);
        }
        int y[] = x;
        for(int i=0; i<10;i++){
            System.out.println("y["+i+"] = " + y[i]);
        }
        System.out.println(x == y);
        //above x[] is dynamic assignment example
        //below is a static assignment example
        int s[] = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("the length of s is " + s.length);
        for(int i=0;i<s.length;i++){     //i<=s is not correct
            System.out.println("s["+i+"] = " + s[i]);
        }
        //2 dimensions array
        int a[][] = {{1,2,3},{2,3,4,5,6},{0,5,6,8}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
