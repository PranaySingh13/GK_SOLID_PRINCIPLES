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
    }
}