import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a begin number : ");
        int begin = sc.nextInt();
        System.out.print("Enter an end number : ");
        int end = sc.nextInt();

        long sum = getSumBetween(begin-1, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }
    public static long getSumBetween(int start, int finish) {
        long ans = (long) finish *(finish+1)/2;
        long mi = (long) start *(start+1)/2;
        return ans-mi;
    }
    public static long getProductBetween(int start, int finish) {
        if(finish == start)
            return finish;
        else
            return (long)finish*getProductBetween(start, finish-1);
    }
}
