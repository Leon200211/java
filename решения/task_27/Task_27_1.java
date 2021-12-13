package task_27;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_27_1 {

    public void Task_27_1(){

    }

    public void fun_1(){
        HashMap<String, String> people = new HashMap<>();
        people.put("Artemov", "Andrey");
        people.put("Smirnov", "Alexey");
        people.put("Ivanov", "Gleb");
        people.put("Lukin", "Leon");
        people.put("Ivanov", "Igor");
        people.put("Ogonikov", "Andro");
        people.put("Pavlov", "Ivan");

        HashMap<String, String> temp = new HashMap<>();


        for(Map.Entry<String, String> entry : people.entrySet())
            temp.put(entry.getValue(), entry.getKey());

        people.clear();

        for(Map.Entry<String, String> entry : temp.entrySet())
            people.put(entry.getValue(), entry.getKey());

        temp.clear();

        System.out.println(people);
    }


}
