package basic;

/**
 * Created by liuxi on 2017/6/3.
 */
public class OO3 {
    public static void main(String args[]) {
        PersonC lx = new PersonC("Xiao", 30);
        System.out.println("Name: " + lx.getName());
        System.out.println("Age: " + lx.getAge());
    }
}

class PersonC {
    private String name;
    private int age;

    PersonC() {
        System.out.println("Need Name and Age");
    }

    PersonC(String n, int a) {
        setName(n);
        setAge(a);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a < 0) System.out.println("Age cannot smaller than 0");
        else age = a;
    }

    public int getAge() {
        return age;
    }

}
