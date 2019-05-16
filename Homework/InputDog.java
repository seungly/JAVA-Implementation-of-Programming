package Homework;
import java.io.*;

class InputDog{
    Dog totu = new Dog("toto", 3);
    public static void main(String[] args) {
        InputDog serial = new InputDog();
        try{
            FileOutputStream fs = new FileOutputStream("./serialDog.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(serial);
            os.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}