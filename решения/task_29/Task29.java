package task_29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Task29 {
    String currPath;

    public Task29()
    {
        currPath = System.getProperty("C:\\work\\work_java\\vyz_laba\\src\\task_29");
    }

    void serializeCurrency(CurrencyInfo ci, String fileName)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currPath + fileName))) {
            oos.writeObject(ci);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    CurrencyInfo deserializeCurrency(String pathToFile)
    {
        CurrencyInfo ci = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currPath + pathToFile)))
        {
            ci = (CurrencyInfo) ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return ci;
    }

    public static void main(String[] args) {
        Task29 task = new Task29();

        CurrencyInfo ci = new CurrencyInfo("Dollar", new ArrayList<>(Arrays.asList(
                "USA", "Australia", "Canada", "New Zealand", "Belize")), "Cent");
        ci.printCurrencyInfo();

        task.serializeCurrency(ci, "currencyInfo.dat");

        CurrencyInfo deserializedCi = task.deserializeCurrency("currencyInfo.dat");
        System.out.println("Currency info from deserialized object: ");
        deserializedCi.printCurrencyInfo();
    }
}
