package task8.laba_5_1;

public class Triangle extends Shape{

    public Triangle(){
        super();
        this.r = (int)(Math.random()*256);
        this.g = (int)(Math.random()*256);
        this.b = (int)(Math.random()*256);

        this.x = (int)(Math.random()*740)+10;
        this.y = (int)(Math.random()*440)+10;
    }

}
