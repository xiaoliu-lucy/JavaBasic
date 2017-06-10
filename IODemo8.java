package basic;
import java.io.* ;
import java.awt.*;

/**
 * Created by liuxi on 2017/6/9.
 */

class PersonS implements Serializable
{
    private String name ;
    private transient int age ;
    public PersonS(String name,int age)
    {
        this.name = name ;
        this.age = age ;
    }
    public String toString()
    {
        return "name："+this.name+"，age："+this.age ;
    }
};
public class IODemo8
{
    public static void main(String args[]) throws Exception
    {
        PersonS per = new PersonS("Xiao",26) ;
        ser(per) ;
        System.out.println(dser()) ;
    }
    //Serialization
    public static void ser(PersonS per) throws Exception
    {
        ObjectOutputStream oos = null ;
        oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/liuxi/Desktop/test1.txt"))) ;
        oos.writeObject(per) ;
        oos.close() ;
    }
    //Deserialization
    public static Person dser() throws Exception
    {
        ObjectInputStream ois = null ;
        ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/liuxi/Desktop/test2.txt"))) ;
        Object obj = ois.readObject() ;
        ois.close() ;
        return (Person)obj ;
    }
};