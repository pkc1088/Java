import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 2, 3, 4};
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(Arr));
    }
}
