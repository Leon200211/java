package task5;

public abstract class Dog {

    private String name;
    private int price;

    public Dog(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){ return name; }
    public int getPrice(){ return price; }

    public abstract void displayInfo();

}
