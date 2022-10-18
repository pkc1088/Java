import java.util.ArrayList;
import java.util.*;

public class BinaryMain {
    public static void main(String[] args) {
       ArrayList<Integer> arrlist = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = a;
       while(a != 1) {
           arrlist.add(a%2);
           a /= 2;
       }
       System.out.print("Number "+b+" in Binary Number: 1");
       for(int i = arrlist.size()-1; 0 <= i; i--)
           System.out.print(arrlist.get(i));
    }
}
