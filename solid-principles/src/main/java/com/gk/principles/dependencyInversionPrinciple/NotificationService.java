package main.java.com.gk.principles.dependencyInversionPrinciple;

// Abstraction for notification, a common interface for all notification types.
public interface NotificationService {
    void send(String message);
}
