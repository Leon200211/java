package task5;

class plate extends Dish {

    private String color;


    public plate(String n, int price){
        super(n, price);
    };

    public String getColor() { return color; }
    public void setColor(String color){ this.color = color; }


    public void displayInfo(){
        System.out.println("Name: "+getName()+" Price: "+getPrice() + " color: "+ getColor());
    }
}