package task_13;


import java.util.*;

public class Main {
    public void ArrayTest() {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Leon");
        a.add("Artem");
        a.add("Alica");
        a.add(1,"Ivan");
        for (String i:a) System.out.println(i);

        System.out.println();
        System.out.println(a.get(2));
        a.set(2,"Lee");
        System.out.printf("Всего %d элементов \n", a.size());
        for(String i:a) System.out.println(i);
        if (a.contains("Leon")) System.out.println("Леон есть в массиве");
        a.remove("Artem");
        a.remove(3);

        for(String i:a) System.out.println(i);
    }

    public void LinkedTest() {
        LinkedList<String> a = new LinkedList<String>();

        a.add("Leon");
        a.add("Artem");
        a.add("Alica");
        a.addLast("Ivan");
        a.addFirst("Boris");
        a.add(1,"Lee");
        for (String i:a) System.out.println(i);

        System.out.printf("Всего %d элементов \n", a.size());
        System.out.println(a.get(2));
        a.set(1,"Danya");
        for (String i:a) System.out.println(i);

        a.remove("Artem");
        a.removeFirst();
        a.removeLast();
        for (String i:a) System.out.println(i);
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println("");
        System.out.println("Тестирование ArrayList");
        test.ArrayTest();
        System.out.println("Тестирование LinkedList");
        test.LinkedTest();
    }
}
