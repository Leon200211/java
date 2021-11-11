package task_13.task_13_3;

import java.lang.reflect.Array;


class FakeArrayList<T> {
    private final int size;
    private int actual_size = 0;
    private final T[] array;

    public FakeArrayList(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }

        if (size == i){
            System.out.println("Недостаточно места");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void remove(T item){
        int i = 0;
        while (i < size && array[i] != item){
            ++i;
        }

        if (size == i) {
            System.out.println("Элемент не найден");
            return;
        }

        if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

        array[size - 1] = null;
        actual_size--;

    }
}

public class Main {
    public static void main(String[] args) {
        FakeArrayList<Integer> arr = new FakeArrayList<Integer>(Integer.class, 10);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(24);
        arr.add(13);
        arr.add(7);
        arr.add(0);
        arr.add(11);

        System.out.println(arr.get(2));

        arr.set(3,10);

        arr.remove(5);

        System.out.println();
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}