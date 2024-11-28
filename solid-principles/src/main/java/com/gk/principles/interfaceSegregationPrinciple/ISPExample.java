package main.java.com.gk.principles.interfaceSegregationPrinciple;

public class ISPExample {
    public static void main(String[] args) {
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
    }
}
