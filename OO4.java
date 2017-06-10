package basic;

/**
 * Created by liuxi on 2017/6/3.
 */
public class OO4 {
    public static void main(String args[]) {
        PersonD.setCountry("China");
        if(args.length!=2){
            System.out.println("Need name and age");
            System.exit(1);
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        PersonD lx = new PersonD(name, age);
        System.out.println("Name: " + lx.name + " Age: " + lx.age + " Nationality: " + lx.country);
    }
}

class PersonD {
    static {
       //this is a static code block. and only run once
    }
    {
       //this is a constructor block
    }
    static String country;
    String name;
    int age;

    PersonD(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void setCountry(String c) {
        //this.country = country;     this is not correct for static variable
        country = c;
    }
}
