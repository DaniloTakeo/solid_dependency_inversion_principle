package case2.problem;

public class NotificationService {
    private EmailNotifier emailNotifier;

    public NotificationService() {
        this.emailNotifier = new EmailNotifier(); // Dependência direta de uma implementação concreta
    }

    public void notifyUser(String message) {
        System.out.println("Notificando usuário...");
        emailNotifier.send(message); // Alto acoplamento
    }
}