package task5;

class mug extends Dish {

    private String material;

    public mug(String n, int price){
        super(n, price);
    };

    public String getMaterial() { return material; }
    public void setMaterial(String material){ this.material = material; }


    public void displayInfo(){
        System.out.println("Name: "+getName()+" Price: "+getPrice() + " Material: "+ getMaterial());
    }

}