package basic;

/**
 * Created by liuxi on 2017/6/2.
 */
public class Method {
    public static void main(String args[]){
        printHello();
        int k = add(10);
        System.out.println(k);
        System.out.println(add(10,30));
        int[] s = new int[10];
        init(s);
        print(s);
    }
    public static void printHello(){
        System.out.println("********************");
        System.out.println("*******Hello********");
        System.out.println("********************");
    }
    public static int add(int x, int y){
        int temp = x + y;
        return temp;
    }
    public static int add(int x){
        return x;              // the overload of method
    }
    public static void init(int s[]){
        for(int i=0;i<s.length;i++){
            s[i] = i+1;
        }
    }
    public static void print(int s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
