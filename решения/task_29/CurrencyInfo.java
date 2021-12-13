package task_29;

import java.io.Serializable;
import java.util.ArrayList;

public class CurrencyInfo implements Serializable {
    String name;
    ArrayList<String> countries;
    String derivedCurrencyName;

    public CurrencyInfo(String name, ArrayList<String> countries, String derivedCurrencyName)
    {
        this.name = name;
        this.countries = countries;
        this.derivedCurrencyName = derivedCurrencyName;
    }

    public void printCurrencyInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Countries: " + countries);
        System.out.println("Derived currency name: " + derivedCurrencyName);
    }

}