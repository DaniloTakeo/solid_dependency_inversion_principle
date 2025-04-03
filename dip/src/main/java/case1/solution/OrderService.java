package case1.solution;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository; // Injeção de dependência com abstração
    }

    public void processOrder(String order) {
        System.out.println("Processando pedido: " + order);
        repository.saveOrder(order);
    }
}