package task_26;

public class NotEnoughFundsToPayException extends Exception {
    NotEnoughFundsToPayException(String errorMessage)
    {
        super(errorMessage);
    }
}