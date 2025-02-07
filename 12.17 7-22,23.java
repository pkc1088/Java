import java.awt.*;

class Point {
    int x, y;
    Point() {
        this(0, 0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public  String toString() {
        return "["+x+","+y+"]";
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();
    Point getPoint() {return p;}
    void setPoint(Point p) {this.p = p;}
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        super();
        this.r = r;
    }

    double calcArea() {
        return r*r*3.14;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width*height;
    }

    boolean isSquare() {
        if(width == height)
            return true;
        else
            return false;
    }
}

class SUB {
    public static double sumArea(Shape[] s) {
        double sum = 0;
        for (int i = 0; i < s.length; i++) {
                sum += s[i].calcArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(3.0, 6.0);
        s1.setPoint(new Point(3,5));
        s2.setPoint(new Point(10, 12));
        System.out.println("Circle의 면적 : "+s1.calcArea()+", 좌표 : "+s1.getPoint());
        System.out.println("Rectangle의 면적 : "+s2.calcArea()+", 좌표 : "+s2.getPoint());

        Shape[] Arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합 : "+sumArea(Arr));
    }
}
