import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 2, 3, 4};
        int[] Brr = new int[5];
        for (int i = 0; i < Arr.length; i++) {
            Brr[i]=Arr[i];
            System.out.println("Arr : " + Arr[i] + " Brr : " + Brr[i]);
        }
        Brr[3]=12;
        System.out.println("Arr[3] : "+Arr[3]+ "\nBrr[3]: "+Brr[3]);
    }
}
