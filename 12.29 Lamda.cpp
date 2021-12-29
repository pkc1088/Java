import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

class Main {
    interface Myfunc {
        public abstract int max(int a, int b);
    }
    public static void main(String args[]) {
        Myfunc f = new Myfunc() {
            public int max(int a , int b) {
                return a > b ? a : b;
            }
        };
        Myfunc f2 = (int a, int b) -> a > b ?  a : b;

        System.out.println(f.max(5, 3));
        System.out.println(f2.max(3, 7));

        List<String> list = Arrays.asList("ABC", "1", "aaa", "0");
        Collections.sort(list, (s1,s2) -> s2.compareTo(s1));    //Comparator를 대체함
        System.out.println(list);
    }
}
