package main.java.com.gk.principles.liskovSubstitutionPrinciple;

public class LSPExample {
    public static void main(String[] args) {
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
