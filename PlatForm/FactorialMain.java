import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("Factorial of "+i+" = "+getFactorial(i));
        }
    }
    private static long getFactorial(final int n) {
        if(n == 1)
            return 1;
        else
            return n*getFactorial(n-1);
    }
}
