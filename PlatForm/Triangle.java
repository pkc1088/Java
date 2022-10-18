package coms.bdobe;

public class Triangle extends Shape {
    int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void draw() {
        System.out.printf("Triangle, Area: %.2f, Length: %.2f%n", getArea(), getLength());
    }
    @Override
    public float getArea() {
        return (float) Math.sqrt((4*a*a*b*b)-(a*a+b*b-c*c)*(a*a+b*b-c*c)) / 4;
    }
    @Override
    public float getLength() {
        return a+b+c;
    }
}