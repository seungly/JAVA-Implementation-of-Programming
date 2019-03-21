/**
 * AnimalLauncher
 */
public class AnimalLauncher {

    public static void main(String[] args) {
        Dog totu = new Dog("totu", 2);

        //totu.test2 = 3; 

        //totu.setTest(3);
        //System.out.println(totu.getTest());

        totu.ttt();
        //totu.ttt2();

        totu.eat("Turkey");
        totu.makeNoise();
        totu.sleep();
    }
    
}