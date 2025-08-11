package Test;

abstract class PaymentMethod {
    public abstract boolean validate();
    public abstract boolean processPayment(double amount);
}
