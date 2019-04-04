package Homework;
/**
 * RobotLauncher
 */
public class RobotLauncher {

    public static void main(String[] args) {

        //Create 5 Robot instances array
        Robot[] robbys = new Robot[5];
        int year = 2010;
        String[] mats = {"iron", "PL"};

        //Initialize each instance
        for (Robot robo : robbys){
            robo = new RoboDog(year++);
            if (year <2012){
                robo.material = mats[0];
            }else{
                robo.material = mats[1];
            }

            //Call the method of super class
            robo.speaking();
            robo.madeFrom();

            //Call the method of interface
            ((RoboDog)robo).callFood("Meat");
            
        }

    }
}