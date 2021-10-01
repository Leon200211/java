package task7.prac_3_2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){
        super();
    }
    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width = width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length = length;
    }




    double getArea(){
        return width;
    }
    double getPerimeter(){
        return width;
    }
    String toStaring(){
        return "P = " + this.width;
    }

}
