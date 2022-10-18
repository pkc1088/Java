import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.equals(str2)) System.out.println("true");
        else System.out.println("false");

        if(str1.equalsIgnoreCase(str2)) System.out.println("true");
        else System.out.println("false");

        if(str1.toLowerCase(Locale.ROOT).equals(str2.toLowerCase(Locale.ROOT))) System.out.println("true");
        else System.out.println("false");

        str1 = str1.replace("easy", "fun");
        if(str1.equalsIgnoreCase(str2)) System.out.println("true");
        else System.out.println("false");
    }
}
