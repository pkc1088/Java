import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Number1 : "+a+", Number2 : "+b);
        System.out.print("Number1 > Number2 ? ");
        if(a>b) System.out.println("true");
        else System.out.println("false");
        System.out.print("Number1 < Number2 ? ");
        if(a<b) System.out.println("true");
        else System.out.println("false");
        System.out.print("Number1 == Number2 ? ");
        if(a==b) System.out.println("true");
        else System.out.println("false");
    }
}
