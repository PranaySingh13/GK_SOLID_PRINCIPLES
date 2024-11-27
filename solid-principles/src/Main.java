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
    }
}