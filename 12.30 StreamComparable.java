import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1, 10);
        is.skip(3).limit(5).forEach(System.out::print);
        System.out.println();

        Stream<T> strStream = Stream.of(new T("av"), new T("cv"), new T("bv"));
        strStream.sorted(T::compareTo)
                .forEach(System.out::print);
    }
}

class T implements Comparable<T> {
    String str;
    T(String str) {
        this.str = str;
    }
    public int compareTo(T t) {
        return (t.str.equals(this.str)) ? 1 : 0;
    }
}
