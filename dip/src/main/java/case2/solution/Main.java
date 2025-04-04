package case2.solution;

public class Main {
    public static void main(String[] args) {
        // Podemos escolher a implementação em tempo de execução
        Notifier emailNotifier = new EmailNotifier();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.notifyUser("Seu pedido foi enviado por e-mail!");

        Notifier smsNotifier = new SMSNotifier();
        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.notifyUser("Seu pedido foi enviado por SMS!");
    }
}