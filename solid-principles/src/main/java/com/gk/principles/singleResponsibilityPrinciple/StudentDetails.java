package main.java.com.gk.principles.singleResponsibilityPrinciple;

public class StudentDetails {
    private String name;
    private int totalMarks;

    public StudentDetails(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
