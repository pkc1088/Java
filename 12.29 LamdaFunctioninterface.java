import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

class Main {
    
    public static void main(String args[]) {

        Function<Integer, Double> f2 = b -> (double)b*b;

        System.out.println(f2.apply(3));

        List<String> list = Arrays.asList("ABC", "1", "aaa", "0");
        Collections.sort(list, (s1,s2) -> s2.compareTo(s1));    //Comparator를 대체함
        System.out.println(list);
    }
}
