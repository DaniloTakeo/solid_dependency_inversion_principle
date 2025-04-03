package case1.solution;

public class Main {
    public static void main(String[] args) {
        OrderRepository repository = new MySQLOrderRepository(); // Pode ser substituído por outra implementação facilmente
        OrderService orderService = new OrderService(repository);
        orderService.processOrder("Pedido #123");
    }
}