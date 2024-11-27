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


    }
}