package task_26;



import java.util.Scanner;

public class EWallet implements PaymentMethod {
    String login;
    String password;
    double balance;

    public EWallet(){

    }

    public EWallet(String login, String password, double balance)
    {
        this.login = login;
        this.password = password;
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
        System.out.print("EWallet login: ");
        String ewalletNumber = sc.next();
        System.out.print("EWallet password: ");
        String ewalletPassword = sc.next();
        this.login = ewalletNumber;
        this.password = ewalletPassword;
        this.balance = 2000;

    }


    public void pay(double money) throws NotEnoughFundsToPayException {
        if (this.getBalance() >= money)
            this.chargeOff(money);
        else
            throw new NotEnoughFundsToPayException("Недостаточно средств.");
    }
}
