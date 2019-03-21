class Animal{

    String name;
    int age;

    private int test;
    protected int test2;
    
    public int getTest(){
        return test;
    }

    public void setTest(int _test){
        test = _test;
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
    }

    public void sleep(){
        System.out.println(name + " sleeps");
    }

}