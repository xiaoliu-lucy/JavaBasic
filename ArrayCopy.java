package basic;

/**
 * Created by liuxi on 2017/6/2.
 */
public class ArrayCopy {
    public static void main(String args[]){
        int source[] = {1,2,3,4,5,6};
        int dest[] = {10,13,15,98,25,36,48,58,36,12,35};
        System.out.println("before copy");
        System.out.print("source: ");
        print(source);
        System.out.print("\ndest: ");
        print(dest);
        System.arraycopy(source,0,dest,0,source.length);
        System.out.println("\nafter copy");
        System.out.print("source: ");
        print(source);
        System.out.print("\ndest: ");
        print(dest);
    }
    public static void print(int s[]){
        for (int i=0;i<s.length;i++){
            System.out.print(s[i] + " ");

        }
    }
}
