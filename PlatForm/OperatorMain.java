import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float)a/b;
        int p = a % b;
        System.out.println(a+" / "+b+" = "+String.format("%.3f", c));
        System.out.println(a+" = "+(int) c+" x "+b+" + "+p);
    }
}