package task5;

public abstract class Dish {

    private String name;
    private int price;

    public Dish(String n, int price) {
        this.name = n;
        this.price = price;
    }

    public String getName(){ return name; }
    public int getPrice(){ return price; }

    public abstract void displayInfo();
}

