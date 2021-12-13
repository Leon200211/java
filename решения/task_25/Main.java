package task_25;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        RedShapeDecorator rsDecorator = new RedShapeDecorator(rect);
        rsDecorator.setRedBorder();
        rsDecorator.draw();
    }
}
