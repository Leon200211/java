package task_12;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int Id;
    private String Name;
    private int Score;

    public Student(int Id, String Name, int Score) {
        setId(Id);
        setName(Name);
        setScore(Score);
    }

    public int getId() { return Id; }

    public void setId(int id) { Id = id; }

    public int getScore() { return Score; }

    public void setScore(int score) { Score = score; }

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getScore() - o1.getScore();
    }
}

public class Main{
    private Student[] FirstArr () {
        Student[] array_1 = new Student[5];
        array_1[0] = new Student(3,"Leon",10);
        array_1[1] = new Student(1,"Bogdan",14);
        array_1[2] = new Student(2, "Artem", 15);
        array_1[3] = new Student(5,"Ivan", 7);
        array_1[4] = new Student(4,"Alica",1);

        return array_1;
    }

    private Student[] SecondArr() {
        Student[] array_2 = new Student[5];
        array_2[0] = new Student(7,"Sergey",20);
        array_2[1] = new Student(8,"Anton",11);
        array_2[2] = new Student(10,"Lisa",17);
        array_2[3] = new Student(6,"Misha",5);
        array_2[4] = new Student(9,"Danya",19);

        return array_2;
    }

    public static void InsertionSort (Student[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left].getId();
            int i = left - 1;
            for(; i>= 0 ; i--){
                if (value < arr[i].getId()) arr[i+1].setId(arr[i].getId());
                else break;
            }
            arr[i+1].setId(value);
        }
    }

    public void InsertionTest() {
        Student[] students = FirstArr();
        System.out.println("До сортировки вставкой: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);

        InsertionSort((Student[]) students);
        System.out.println("После сортировки вставкой: ");
        for (int i=0;i<students.length;i++) System.out.println(students[i]);
    }

    public void QuickSortTest() {
        Student[] students = FirstArr();

        System.out.println("До быстрой сортировки: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);

        Comparator cmpr = new SortingStudentsByGPA();
        Arrays.sort(students,cmpr);
        System.out.println("После быстрой сортировки: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);
    }

    public Student[] merge() {
        Student[] arr_1 = FirstArr();
        Student[] arr_2 = SecondArr();
        Student[] arr = new Student[arr_1.length + arr_2.length];

        for (int i=0; i < arr_1.length; i++) arr[i] = arr_1[i];

        for(int i=0; i < arr_2.length; i ++) arr[i + arr_2.length]=arr_2[i];

        return arr;
    }

    public void MergeSort(Student[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        MergeSort(a, lo, mid);
        MergeSort(a, mid + 1, hi);

        Student[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].getId() < buf[i].getId()) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public void MergeSortTest() {
        Student[] arr = merge();

        System.out.println("До сортировки: ");
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);

        MergeSort(arr, 0, arr.length-1);
        System.out.println("После сортировки: ");
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Main test = new Main();
        //test.InsertionTest();
        //test.QuickSortTest();
        //test.MergeSortTest();
    }
}