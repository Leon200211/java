package task6;

public class Product implements Priceable {
    private int age;

    public int getAge(){
        return age;
    }

    Product(int age){


        this.age = age;
    }

    public void showinfo(){
        System.out.println(" age: " + getAge());
    }

}
