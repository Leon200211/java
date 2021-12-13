package task_26;

import java.util.Scanner;

enum PaymentMethods {
    CREDIT_CARD,
    EWALLET;
}

public class Contex {
    PaymentMethod paymentMethod;

    CreditCard creditCard;
    EWallet eWallet;

    public Contex(){

    }

    public void setPaymentMethod(PaymentMethods paymentMethodName)
    {
        if (paymentMethodName == PaymentMethods.CREDIT_CARD) {
            paymentMethod = new CreditCard();
            paymentMethod.setPaymentData();
        }
        else if (paymentMethodName == PaymentMethods.EWALLET) {
            paymentMethod = new EWallet();
            paymentMethod.setPaymentData();
        }
    }

    public void pay(double money)
    {
        try {
            paymentMethod.pay(money);
        } catch (NotEnoughFundsToPayException exc) {
            exc.printStackTrace();
            System.exit(1);
        }
    }




}
