package prac_1;

public class Book {
    private String name;
    private String author;
    private int price;


    public Book(String n, String a, int p){
        name = n;
        author = a;
        price = p;
    }
    public Book(String n){
        name = n;
        author = "";
        price = 0;

    }

    public void setAuthor(String a) {
        this.author = a;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void  setPrice(int p){
        this.price = p;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return this.name+", aithor "+this.author + " | price = " + this.price;
    }
    public void showinfo(){
        System.out.println("Название: "+this.name + " | автор: "+this.author + " | цена = " + this.price );
    }

}
