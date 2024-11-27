package main.java.com.gk.principles.singleResponsibilityPrinciple;

public class PrintDetails {

    public void printStudentDetails(StudentDetails studentDetails, double percentage) {
        System.out.println(studentDetails.getName() + " has scored " + percentage + " %.");
    }
}
