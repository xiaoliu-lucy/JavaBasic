package basic;

/**
 * Created by liuxi on 2017/6/4.
 */
public class OO5 {
    public static void main(String args[]){
        Student lx = new Student("Xiao",26,"UMD");
//        lx.setSchool("UMD");
//        lx.setName("Xiao");
//        lx.setAge(26);
        System.out.println("Name: "+lx.getName()+" Age: " + lx.getAge() + " Shool: " + lx.getSchool());
        StudentA jm = new StudentA();
        System.out.println(jm.say());           //Parent class's constructor is being called. private function isn't.

    }
}
class Student extends PersonC{
    private String school;
    Student(){

    }
    Student(String name,int age,String school){         //use super to call certain constructor in parent class
        super(name,age);
        this.school = school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return this.school;
    }
    public String say(){
       return "I'm a student";
    }

}
class StudentA extends Student{
    public String say(){
        return super.say() + "A";     //use super call parent method;
        //override function: same name, same variable, more authority.

    }
}

