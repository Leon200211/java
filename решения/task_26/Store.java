package task_26;

import java.util.Random;
import java.util.Scanner;

public class Store {
    int MAX_PRICE = 10000;

    public void startShopping()
    {
        Contex context = new Contex();
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        Random random = new Random();
        String productName;

        int randomPrice = random.nextInt(MAX_PRICE);
        int paymentMethodNum;

        System.out.println("Добро пожаловать");
        System.out.print("Название продукта: ");
        productName = scanner.next();

        System.out.print("Способ оплаты: (0 : Credit card, 1 : EWallet): ");
        paymentMethodNum = scanner.nextInt();

        context.setPaymentMethod(PaymentMethods.values()[paymentMethodNum]);
        context.pay(randomPrice);

        System.out.println("Success");
    }
}