package task5;

public class main {

    public static void main(String[] args) {
        // 1
        mug mug_1 = new mug("smth", 100);
        mug_1.setMaterial("smth");
        mug_1.displayInfo();

        plate plate_1 = new plate("smth_2", 230);
        plate_1.setColor("red");
        plate_1.displayInfo();


        // 2
        Dog_1 dog1 = new Dog_1("smth", 100, "black");
        dog1.displayInfo();

        Dog_2 dog2 = new Dog_2("smth_2", 230, 1000);
        dog2.displayInfo();
    }
}
