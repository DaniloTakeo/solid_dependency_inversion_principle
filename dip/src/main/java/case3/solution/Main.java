package case3.solution;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        processor1.process(150.0);

        PaymentMethod boleto = new BoletoPayment();
        PaymentProcessor processor2 = new PaymentProcessor(boleto);
        processor2.process(200.0);
    }
}