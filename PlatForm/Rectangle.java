package coms.bdobe;

public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.printf("Rectangle, Area: %.2f, Length: %.2f%n", getArea(), getLength());
    }
    @Override
    public float getArea() {
        return width*height;
    }
    @Override
    public float getLength() {
        return 2*(width + height);
    }
}