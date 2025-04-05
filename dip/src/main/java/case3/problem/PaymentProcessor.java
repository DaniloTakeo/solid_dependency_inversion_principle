package case3.problem;

public class PaymentProcessor {
    private CreditCardPayment payment;

    public PaymentProcessor() {
        this.payment = new CreditCardPayment();
    }

    public void process(double amount) {
        payment.pay(amount);
    }
}
