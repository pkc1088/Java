import java.util.function.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        IntSupplier  s = ()-> (int)(Math.random()*100)+1;
        Consumer<Integer>  c = i -> System.out.print(i+", ");
        Predicate<Integer> p = i -> i%2==0;
        Function<Integer, Integer> f = i -> i/10*10; 

        int[] arr = new int[10];
        makeRandomList(s, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i : arr)
            System.out.print(i+" ");
        System.out.print("\n"+Arrays.toString(arr));
    }

    static void makeRandomList(IntSupplier s, int[] arr) {
        for(int i=0;i<arr.length;i++) {
            arr[i] = s.getAsInt();
        }
    }
}
