package main.java.com.gk.principles.interfaceSegregationPrinciple;

// Advanced printer that only supports all printing, scanning and Faxing.
public class AdvancedPrinter implements Printable, Scanable, Faxable {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }
}
