package case1.solution;

public class MySQLOrderRepository implements OrderRepository {
    public void saveOrder(String order) {
        System.out.println("Pedido salvo no MySQL: " + order);
    }
}