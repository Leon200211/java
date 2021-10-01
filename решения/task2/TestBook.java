package task2;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("test1", "author1", 1000);
        Book d2 = new Book("Helen", "author2", 2400);
        Book d3 = new Book("test3");
        d3.setAuthor("author3");
        d3.setPrice(999);
        System.out.println(d1);
        d1.showinfo();
        d2.showinfo();
        d3.showinfo();
    }
}
