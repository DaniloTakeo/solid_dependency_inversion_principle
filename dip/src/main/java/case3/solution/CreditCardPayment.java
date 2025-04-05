package case3.solution;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pagamento com cartão de crédito: R$" + amount);
    }
}