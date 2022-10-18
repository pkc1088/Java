import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(;;) {
            String str = sc.next().toUpperCase();
            if(str.equals("QUIT")) {
                System.out.println("Bye");
                break;
            }

            switch(str) {
                case "TRIANGLE":
                    float a = sc.nextInt();
                    float b = sc.nextInt();
                    System.out.printf("Area of Triangle: %.2f\n", a*b/2);
                    break;

                case "RECTANGLE":
                    float c = sc.nextInt();
                    float d = sc.nextInt();
                    System.out.printf("Area of Rectangle: %.2f\n", c*d);
                    break;

                case "CIRCLE":
                    float r = sc.nextInt();
                    System.out.printf("Area of Circle: %.2f\n", r*r*Math.PI);
                    break;

                default:
                    System.out.println("Invalid");
            }

        }
    }
}
