package case2.solution;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier; // Injeção de dependência com abstração
    }

    public void notifyUser(String message) {
        System.out.println("Notificando usuário...");
        notifier.send(message); // Aplicação do Strategy Pattern
    }
}
