package task3;


// 1
public class CircleTest {


    public static void main(String[] args) {
        Circle obj_1 = new Circle(10, 10, "red");
        System.out.println(obj_1.getSquare());
        System.out.println(obj_1.getCircumference());
        System.out.println(obj_1.getColor());
        obj_1.setSquare(1);
        obj_1.setCircumference(1);
        obj_1.setColor("green");
        System.out.println(obj_1.getSquare());
        System.out.println(obj_1.getCircumference());
        System.out.println(obj_1.getColor());
    }


}
