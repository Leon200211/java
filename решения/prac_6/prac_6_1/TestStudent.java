package prac_6.prac_6_1;

import java.util.TreeSet;

public class TestStudent {
    public static void main(String[]args) {


        /*
        TreeSet<Student> people = new TreeSet<Student>();
        people.add(new Student("Tom"));
        people.add(new Student("Nick"));
        people.add(new Student("Alice"));
        people.add(new Student("Leon"));
        people.add(new Student("Bill"));
        for(Student  p : people){
            System.out.println(p.getiDNumber());
        }
        */


        Student[] a; // Null - ссылки
        Student[] c = new Student[5];
        c[0] = new Student("Tom");
        c[1] = new Student("Nick");
        c[2] = new Student("Alice");
        c[3] = new Student("Leon");
        c[4] = new Student("Bill");


    }
}
