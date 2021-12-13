package task_27;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task_27_1 task_1 = new Task_27_1();
        task_1.fun_1();

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Москва", "Россия"));
        cities.add(new City("Нью-Йорк", "США"));
        cities.add(new City("Лос Анджелис", "США"));
        cities.add(new City("Берлин", "Германия"));
        cities.add(new City("Париж", "Франция"));
        cities.add(new City("Алмата", "Казахстан"));
        cities.add(new City("Рим", "Италия"));

        HashMap<String, ArrayList<String>> citiesCountry = new HashMap<>();
        ArrayList<String> temp = new ArrayList<>();

        for (City city : cities)
        {
            temp = citiesCountry.get(city.getCountry());
            if (temp == null)
                temp = new ArrayList<>();
            temp.add(city.city);
            citiesCountry.put(city.getCountry(), temp);
        }
        System.out.println(citiesCountry);
    }

}
