package case3.solution;

public class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pagamento com PayPal: R$" + amount);
    }
}