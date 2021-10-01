package task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author b1 = new Author("leon", "aaaa@aaaa.com", 'm');
        System.out.println(b1);
        b1.setEmail("none");
        System.out.println(b1);
    }

}
