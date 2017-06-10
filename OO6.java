package basic;

/**
 * Created by liuxi on 2017/6/4.
 */
public class OO6 {
    public static void main(String args[]) {
        Manager jiaming = new Manager("Jiaming", 24, 300.00f, 2);
        System.out.println(jiaming.say());
        Employee xiao = new Employee("Xiao", 26, 200.00f);
        xiao.setMgr(jiaming);
        if (xiao.getMgr() != null) {
            System.out.println(xiao.say() + " Manager: " + xiao.getMgr().say());
        } else {
            System.out.println(xiao.say());
        }


    }
}

class Employee {
    private String name;
    private int age;
    private float salary;
    private Manager mgr = null;

    public Employee(String name, int age, float salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public String say() {
        return "Name: " + this.name + " Age: " + this.age + " Salary: " + this.salary;
    }

    void setMgr(Manager mgr) {
        this.mgr = mgr;
    }

    public Manager getMgr() {
        return this.mgr;
    }
}

class Manager extends Employee {
    private int number;

    public Manager(String name, int age, float salary, int number) {
        super(name, age, salary);
        this.setNumber(number);
    }

    void setNumber(int number) {
        this.number = number;
    }

    public String say() {
        return super.say() + " Employee Number: " + this.number;
    }

}
