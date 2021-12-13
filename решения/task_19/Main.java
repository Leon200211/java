package task_19;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle tr = new Triangle(90, 809, 1);
        } catch (LeonError exc) {
            exc.printStackTrace();
        }
    }
}
