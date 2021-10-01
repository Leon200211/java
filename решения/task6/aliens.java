package task6;

public class aliens implements Nameable {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    aliens(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void showinfo(){
        System.out.println("Name:" + getName()+ " age: " + this.age);
    }


}