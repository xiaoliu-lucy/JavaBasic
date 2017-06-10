package basic;

/**
 * Created by liuxi on 2017/6/3.
 */
public class OO2 {
    public static void main(String args[]) {
        PrivatePerson lx = new PrivatePerson();
        lx.setName("Xiao");
        System.out.println("Name: " + lx.getName());
        lx.setAge(-30);
        System.out.println("Age: " + lx.getAge());
    }
}

class PrivatePerson {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    public void setAge(int a){
        if(a<0) System.out.println("Age cannot smaller than 0");
        else age = a;
    }
    public int getAge(){
        return age;
    }
}
