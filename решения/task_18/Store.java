package task_18;

import java.util.Collections;
import java.util.Scanner;


public class Store {
    String productName;
    public void start() {
        System.out.println("Hello");
        chooseProduct();
        try {
            makeOrder();
        } catch (IllegalArgumentException exc) {
            exc.printStackTrace();
            System.exit(-1);
        }
    }


    public void chooseProduct()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.print("Product: ");

        this.productName = sc.next();
    }

    public void makeOrder() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        String inn;
        String fullName;

        System.out.print("Full name: ");
        fullName = sc.nextLine();
        System.out.println("Your INN must be: " + Math.abs(fullName.hashCode()));
        System.out.print("INN: ");
        inn = sc.next();

        if (inn.length() != 12) {
            System.out.println("Wrong INN.");
            return;
        }

        String userInn = getInnForUser(fullName);
        if (!inn.equals(userInn)){
            System.out.println(inn);
            System.out.println(userInn);
            throw new IllegalArgumentException("Wrong INN.");
        }

        System.out.println("Success");
    }

    String getInnForUser(String fullName)
    {
        String Hash = "";

        Hash = String.valueOf(Math.abs(fullName.hashCode()));

        if (Hash.length() < 12)
            Hash += String.join("", Collections.nCopies(12-Hash.length(), "0"));
        else if (Hash.length() > 12)
            Hash = Hash.substring(0, 12);
        return Hash;
    }


}