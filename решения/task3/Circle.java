package task3;


// 1
public class Circle {
    private double square;
    private double circumference;
    private String color;


    public Circle(double s, double ci, String co){
        this.square = s;
        this.circumference = ci;
        this.color = co;
    }

    public double getSquare(){
        return square;
    }
    public double getCircumference(){
        return circumference;
    }
    public String getColor(){
        return color;
    }

    public void setSquare(double s){
        this.square = s;
    }
    public void setCircumference(double ci){
        this.circumference = ci;
    }
    public void setColor(String co){
        this.color = co;
    }

}

/*
// 3
public class Book {
    private String author;
    private String title;
    private int year;


    public Book(String a, String t, int y){
        this.author = a;
        this.title = t;
        this.year = y;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }

    public void setAuthor(String a){
        this.author = a;
    }
    public void setTitle(String t){ this.title = t; }
    public void setYear(int y){
        this.year = y;
    }
}
*/