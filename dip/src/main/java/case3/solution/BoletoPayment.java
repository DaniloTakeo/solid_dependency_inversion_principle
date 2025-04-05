package case3.solution;

public class BoletoPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pagamento com boleto: R$" + amount);
    }
}
