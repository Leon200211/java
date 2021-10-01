package task6;



public class Main {
    public static void main(String[] args) {
        // 1
        aliens obj_1 = new aliens("s", 12);
        aliens obj_2 = new aliens("es", 120);
        obj_1.showinfo();
        obj_2.showinfo();

        //Nameable obj_3 = new aliens("sd", 150);
        //obj_3.showinfo();
        //obj_3 = new aliens("sdas", 15);
        //obj_3.showinfo();


        // 2
        Product pro_1 = new Product(12);
        Product pro_2 = new Product(120);
        pro_1.showinfo();
        pro_2.showinfo();
        Priceable one = new Product(10);
        System.out.println(one.getAge());

    }
}
