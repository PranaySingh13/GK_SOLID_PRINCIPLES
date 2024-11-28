package main.java.com.gk.principles.dependencyInversionPrinciple;

public class DIPExample {
    public static void main(String[] args) {
        /**
         * Dependency Inversion Principle
         * Higher Level Modules should not depend on low-level modules. Both should be depended on abstraction.
         * Adding a new notification type (e.g., PushNotificationSender) does not require modifying NotificationService.
         * High-level and low-level modules depend on the abstraction (NotificationService).
         */
        NotificationService emailService = new EmailService();
        Notifier notifier1 = new Notifier(emailService);
        notifier1.sendNotification("Hello via Email!");

        NotificationService smsService = new SMSService();
        Notifier notifier2 = new Notifier(smsService);
        notifier2.sendNotification("Hello via SMS!");
    }
}
