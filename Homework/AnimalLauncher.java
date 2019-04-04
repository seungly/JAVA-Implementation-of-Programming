
/**
 * AnimalLauncher
 */
public class AnimalLauncher {

    public static void main(String[] args) {
        Animal doggy = new Animal();
        Dog totu = new Dog("totu", 2);
        Animal tothree = new Dog("tothree", 3);

        //totu.test2 = 3; 

        //totu.setTest(3);
        //System.out.println(totu.getTest());

        totu.ttt();
        //totu.ttt2();

        System.out.println("Animal class: " + doggy.getTest());
        System.out.println("Dog class: " + totu.getTest());
        System.out.println("Animal-Dog class: " + tothree.getTest());

        totu.eat("Turkey");
        totu.makeNoise();
        totu.sleep();
    }
    
}