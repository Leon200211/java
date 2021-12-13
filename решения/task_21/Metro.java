package task_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Metro {
    ArrayList<String> lines;

    public Metro()
    {
        lines = new ArrayList<>(Arrays.asList("Сокольническая", "Замоскворецкая", "Арбатско-Покровская",
                "Филевская", "Кольцевая", "Калужско-Рижская", "Таганско-Краснопресненская",
                "Калининская", "Солнцевская", "Серпуховско-Тимерязевская", "Люблинско-Дмитровская",
                "Большая кольцевая", "Каховская", "Бутовская"));
    }

    public void printLines(boolean flag)
    {
        int i = flag ? 1 : 0;

        for (;i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }
}