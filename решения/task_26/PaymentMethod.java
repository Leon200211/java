package task_26;


public interface PaymentMethod {
    public void setPaymentData();
    public void pay(double money) throws NotEnoughFundsToPayException;
}
