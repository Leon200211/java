package task7.prac_3_2;

public class Circle extends Shape {

    protected double radius;

    Circle(){
        super();
    };
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;

    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }


    double getArea(){
        return radius;
    }
    double getPerimeter(){
        return radius;
    }
    String toStaring(){
        return "P = " + this.radius;
    }

}
