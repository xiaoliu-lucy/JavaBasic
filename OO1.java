package basic;

/**
 * Created by liuxi on 2017/6/3.
 */
class Person {
    //This is a class about person.
    String name;
    int age;
    public void speak(){
        System.out.println(name + " says nothing");
    }
    public void speak(String content){
        System.out.println(name + " says " + content);
    }
}

public class OO1 {
    public static void main(String args[]) {
        Person lx = new Person();
        lx.name = "Xiao";
        lx.age = 26;
        System.out.println("Name: " + lx.name);
        System.out.println("Age: " + lx.age);
        Person jm;
        jm = new Person();
        System.out.println("Name: " + jm.name);
        System.out.println("Age: " + jm.age);
        lx.speak();
        lx.speak("she loves jiaming.");
    }
}
