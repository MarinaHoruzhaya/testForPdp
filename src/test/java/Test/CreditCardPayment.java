package Test;

public class CreditCardPayment extends PaymentMethod implements Refundable{

    private String creditNumber;

    public CreditCardPayment(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    @Override
    public boolean validate() {
        return creditNumber != null && creditNumber.length()>=16;
    }

    @Override
    public boolean processPayment(double amount) {
        return validate() && amount > 0;
    }

    @Override
    public boolean refund(double amount) {
        return amount > 0;
    }

    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment("1234567891011121511111");
        System.out.println(creditCard.validate());
    }


}
