package task7.prac_3_2;

public class Square extends Rectangle{

    protected double side;

    Square(){
        super();
    };
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    double getSide(){
        return this.side;
    }
    void setSide(double side){
        this.side = side;
    }

    void setWidth(double side){
        this.width = side;
    }
    void setLength(double side){
        this.length = side;
    }
    String toStaring(){
        return "P = " + this.side;
    }
}
