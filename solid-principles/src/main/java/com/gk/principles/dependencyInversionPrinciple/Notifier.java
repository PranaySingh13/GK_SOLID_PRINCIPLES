package main.java.com.gk.principles.dependencyInversionPrinciple;

//High-Level Modules(classes) Depends only on the abstraction (NotificationService), not on specific implementations.
public class Notifier {
    NotificationService notificationService;

    /**
     * Dependency injection via constructor( no direct dependency with low-level modules)
     */
    public Notifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message);
    }
}
