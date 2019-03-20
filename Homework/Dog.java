/**
 * Dog
 */
public class Dog extends Animal {
    public Dog(String _name, int _age){
        name = _name;
        age = _age;
    }
    public void makeNoise(){
        System.out.println(name + ": awooooooooooooo" );
    }
}