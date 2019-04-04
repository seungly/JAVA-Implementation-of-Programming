
public class RoboDog extends Robot implements Pet {
    public RoboDog(int _year){
        year = _year;
    }

    public void callFood(String food){
        System.out.println("I don't need " + food);
    }
}