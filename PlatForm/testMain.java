import java.util.Arrays;

public class testMain {
    public static void main(String[] args) {
        String[] strC = new String[100];
        strC[0]="";
        String str2  = "hey";
        func1(strC, str2);
        System.out.println(strC[0]);
    }
    static void func1(String[] strC, String str2) {
        strC[0] += str2;
    }
}
