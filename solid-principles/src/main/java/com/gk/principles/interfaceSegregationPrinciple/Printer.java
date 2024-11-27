package main.java.com.gk.principles.interfaceSegregationPrinciple;

// Large interface for all printer functionalities
public interface Printer {
    void print(String document);

    void scan(String document);

    void fax(String document);
}
