import java.util.Scanner;

class Triangle {
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public String getArea() {
        return String.format("%.2f", (float)this.base * this.height / 2);
    }

    public String toString() {
        return ("Triangle [base="+base+", height="+height+", area="+getArea()+"]");
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        Triangle[] triangle = new Triangle[cnt];
        for (int i = 0; i < cnt; i++) {
            int base = sc.nextInt();
            int height = sc.nextInt();
            triangle[i] = new Triangle(base, height);
            System.out.println(triangle[i].toString());
        }
    }
}
