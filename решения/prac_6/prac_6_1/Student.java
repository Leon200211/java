package prac_6.prac_6_1;

public class Student implements Comparable<Student> {

    private String iDNumber;


    Student(){

    }

    Student(String iDNumber){
        this.iDNumber = iDNumber;
    }


    String getiDNumber(){
        return this.iDNumber;
    }

    public int compareTo(Student p){
        return iDNumber.compareTo(p.getiDNumber());
    }

}
