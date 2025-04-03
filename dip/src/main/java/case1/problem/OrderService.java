package case1.problem;

public class OrderService {
    private MySQLOrderRepository repository;

    public OrderService() {
        this.repository = new MySQLOrderRepository(); // Dependência direta em uma implementação concreta
    }

    public void processOrder(String order) {
        System.out.println("Processando pedido: " + order);
        repository.saveOrder(order); // Alto acoplamento
    }
}