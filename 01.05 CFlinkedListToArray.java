import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1.peekFirst());
        Integer[] x = l1.toArray(new Integer[l1.size()]);
        //int아니고 Integer임 wrapperClass
        System.out.println(x[7]);
/*
        LinkedList<String> list
                = new LinkedList<String>();
        list.add("Welcome");
        list.add("To");
        list.add("Geeks");
        list.add("For");
        list.add("Geeks");
        System.out.println("The LinkedList: "
                + list);
        String[] arr = new String[5];
        arr = list.toArray(arr);
        System.out.println("Returned Array: "
                + Arrays.toString(arr));*/
    }
}
