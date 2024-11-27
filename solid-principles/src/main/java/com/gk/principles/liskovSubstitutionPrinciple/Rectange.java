package main.java.com.gk.principles.liskovSubstitutionPrinciple;

public class Rectange implements Shape {
    private int height;
    private int width;

    public Rectange(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return height * width;
    }
}
