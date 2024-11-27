package main.java.com.gk.principles.dependencyInversionPrinciple;

//Low-Level Modules(classes) Can be injected into the NotificationService via dependency injection.
public class EmailService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
