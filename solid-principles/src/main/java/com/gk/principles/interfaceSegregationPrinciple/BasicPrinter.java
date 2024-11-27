package main.java.com.gk.principles.interfaceSegregationPrinciple;

// Basic printer that only supports printing
public class BasicPrinter implements Printable {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
