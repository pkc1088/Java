import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0 && a%3==0)
            System.out.println(a+" is a multiple of 2 and 3");
        else if(a%2==0)
            System.out.println(a+" is a multiple of 2");
        else if(a%3==0)
            System.out.println(a+" is a multiple of 3");
        else
            System.out.println(a+" is not a multiple of 2 and 3");
    }
}
