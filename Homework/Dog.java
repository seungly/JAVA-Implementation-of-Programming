package Homework;
import java.io.Serializable;
/**
 * Dog
 */
public class Dog extends Animal implements Serializable {
    String name;
    int age;
    
	public Dog(String _name, int _age){
        name = _name;
        age = _age;
    }
    public void makeNoise(){
        System.out.println(name + ": awooooooooooooo");
    }
    
    public void ttt(){
        this.setTest(3);
        System.out.println(this.getTest());
    }

    /*
    public void ttt2(){
        this.test = 3;
        System.out.println(this.test);
    }
    */
}