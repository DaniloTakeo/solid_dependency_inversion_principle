package case3.solution;

public class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; // Injeção de dependência
    }

    public void process(double amount) {
        System.out.println("Iniciando processamento do pagamento...");
        paymentMethod.pay(amount); // Flexível e desacoplado
    }
}