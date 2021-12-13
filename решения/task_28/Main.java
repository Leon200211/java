package task_28;

public class Main {
    public static void main(String[] args) {
        Auto auto_leon = new Auto(5);
        auto_leon.go();
        auto_leon.openWindow();
        auto_leon.turn("Лево");
        auto_leon.stop();
        //auto_leon.closeWindow();
    }
}
