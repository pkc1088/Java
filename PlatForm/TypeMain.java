import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printType(str);
        System.out.println("Type conversion to int...");
        int a = Integer.parseInt(str);
        printType(a);
        System.out.println("Type conversion int to float...");
        float b = (float) a;
        printType(b);
        scanner.close();
    }
    private static void printType(String x){
        System.out.println(x + " is a string");
    }
    private static void printType(int x){
        System.out.println(x + " is an int");
    }
    private static void printType(float x){
        System.out.println(x + " is a float");
    }
}
