package dealerNetwork;

public class CustomerHasNoMoneyException extends Exception{
    public CustomerHasNoMoneyException() {
        super();
    }

    public CustomerHasNoMoneyException(String message) {
        super(message);
    }
}