package task_25;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape)
    {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
    }

    void setRedBorder()
    {
        System.out.println("green border");
    }
}
