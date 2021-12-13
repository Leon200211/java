package task_26;

import java.util.Scanner;
public class CreditCard implements PaymentMethod {
    String number;
    int cvv;
    double balance;

    public CreditCard(){

    }

    public CreditCard(String number, int cvv, double balance)
    {
        this.number = number;
        this.cvv = cvv;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void chargeOff(double money) {
        this.balance -= money;
    }

    @Override
    public void setPaymentData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сard number: ");
        String cardNumber = sc.next();
        System.out.print("Сvv: ");
        int cvv = sc.nextInt();
        this.number = cardNumber;
        this.cvv = cvv;
        this.balance = 10000;
    }
    @Override
    public void pay(double money) throws NotEnoughFundsToPayException {
        if (this.getBalance() >= money)
            this.chargeOff(money);
        else
            throw new NotEnoughFundsToPayException("Недостаточно средств.");
    }

}
