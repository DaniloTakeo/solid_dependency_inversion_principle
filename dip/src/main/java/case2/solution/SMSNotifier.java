package case2.solution;

public class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
