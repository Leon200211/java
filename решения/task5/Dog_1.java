package task5;

class Dog_1 extends Dog {

    private String color;

    public Dog_1(String n, int price, String c){
        super(n, price);
        this.color = c;
    };

    public String getColor() { return color; }



    public void displayInfo(){
        System.out.println("Name: "+getName()+" Price: "+getPrice() + " color: "+ getColor());
    }

}