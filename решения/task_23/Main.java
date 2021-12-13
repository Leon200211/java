package task_23;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        String str1 = "hello";
        String str2 = "world";

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.print(date.hashCode() + " and "+ str1.hashCode() + ": ");
        System.out.println(date.hashCode() == str1.hashCode());

        System.out.print(date.hashCode() + " and "+ arr1.hashCode() + ": ");
        System.out.println(date.hashCode() == arr2.hashCode());

        System.out.print(str1.hashCode() + " and "+ str2.hashCode() + ": ");
        System.out.println(str1.hashCode() == str2.hashCode());

        System.out.print(arr1.hashCode() + " and "+ arr2.hashCode() + ": ");
        System.out.println(arr1.hashCode() == arr2.hashCode());

        System.out.print(str1.hashCode() + " and "+ str1.hashCode() + ": ");
        System.out.println(arr1.hashCode() == arr2.hashCode());
    }
}