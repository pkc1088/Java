import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] original = new int[len];

        for (int i = 0; i < len; i++) {
            original[i] = sc.nextInt();
        }

        int[] shallow = original;
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(original));

        int[] deep = new int[original.length];
        System.arraycopy(original, 0, deep, 0, original.length);
        modifyArray(deep, 2);
        System.out.println("Deep Copy: " + Arrays.toString(original));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}