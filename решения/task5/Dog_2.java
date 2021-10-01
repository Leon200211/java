package task5;

class Dog_2 extends Dog {

    private int speed;

    public Dog_2(String n, int price, int c){
        super(n, price);
        this.speed = c;
    };

    public int getSpeed() { return speed; }



    public void displayInfo(){
        System.out.println("Name: "+getName()+" Price: "+getPrice() + " speed: "+ getSpeed());
    }

}