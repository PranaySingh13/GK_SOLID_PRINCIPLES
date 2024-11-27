import main.java.com.gk.principles.dependencyInversionPrinciple.EmailService;
import main.java.com.gk.principles.dependencyInversionPrinciple.NotificationService;
import main.java.com.gk.principles.dependencyInversionPrinciple.Notifier;
import main.java.com.gk.principles.dependencyInversionPrinciple.SMSService;
import main.java.com.gk.principles.interfaceSegregationPrinciple.AdvancedPrinter;
import main.java.com.gk.principles.interfaceSegregationPrinciple.BasicPrinter;
import main.java.com.gk.principles.liskovSubstitutionPrinciple.Rectange;
import main.java.com.gk.principles.liskovSubstitutionPrinciple.Square;
import main.java.com.gk.principles.openClosedPrinciple.BikeNumberValidator;
import main.java.com.gk.principles.openClosedPrinciple.CarNumberValidator;
import main.java.com.gk.principles.openClosedPrinciple.VehicleNumberValidationService;
import main.java.com.gk.principles.singleResponsibilityPrinciple.Percentage;
import main.java.com.gk.principles.singleResponsibilityPrinciple.PrintDetails;
import main.java.com.gk.principles.singleResponsibilityPrinciple.StudentDetails;

public class Main {
    public static void main(String[] args) {

        /**
         * Single Responsibility Principle
         * Every class have a single responsibility in the entire system.
         */
        StudentDetails studentDetails = new StudentDetails("Pranay Singh", 90);

        Percentage percentage = new Percentage();
        double calculatedPercentage = percentage.calculatePercentage(100, studentDetails.getTotalMarks());

        PrintDetails printDetails = new PrintDetails();
        printDetails.printStudentDetails(studentDetails, calculatedPercentage);

        /**
         * Open Closed Principle
         * A classes should be open for extension but closed for modification
         * Here, we can add N number for validating vehicle number without modifying existing code.
         */
        VehicleNumberValidationService service = new VehicleNumberValidationService();
        service.validateVehicle(new BikeNumberValidator(), "Bike-9999");
        service.validateVehicle(new CarNumberValidator(), "Car-8888");

        /**
         * Liskov's Substitution Principle
         * If class A is subtype of class B we should be able to replace B with A without disrupting behaviour of our program.
         * Ex: A Square is special type of rectangle with all sides equal, but it can't be considered as Rectangle.
         * Avoid Using Inheritance when the subclass doesn't fit the behaviour of super class, Instead use
         * Abstraction(abstract class or interface) to maintain integrity of LSP.
         */
        Rectange rectange = new Rectange(10, 9);
        System.out.println("Rectangle Area: " + rectange.calculateArea());

        Square square = new Square(10);
        System.out.println("Square Area: " + square.calculateArea());

        /**
         * Interface Segregation Principle
         * Larger interface should be split into smaller ones, to provide requirement specific interface.
         * We are free to use the required functionality interface rather than larger interface for which
         * other functionality doesn't support.
         */
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("document 1");

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print("document 2");
        advancedPrinter.scan("document 2");
        advancedPrinter.fax("document 2");

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