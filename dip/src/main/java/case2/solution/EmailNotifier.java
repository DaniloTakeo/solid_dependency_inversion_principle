package case2.solution;

public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}