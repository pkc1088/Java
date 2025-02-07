import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("aA", "bb", "cC");
        int sum = strStream.parallel()
                            .mapToInt(s -> s.length())
                            .sum();
        System.out.println(sum);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intstream = list.stream();
        intstream.forEach(System.out::print);
        System.out.println();

        IntStream.of(1,2,3).forEach(System.out::print);
        System.out.println();

        IntStream is1 = new Random().ints(2, 100, 200);
        is1.forEach(System.out::print);

        System.out.println();
        String str1[] = {"abc", "bvd"};
        String str2[] = {"123", "456"};
        Stream<String> strs1 = Stream.of(str1);
        Stream<String> strs2 = Stream.of(str2);
        Stream<String> strs3 = Stream.concat(strs1, strs2);
        strs3.forEach(System.out::print);
    }
}
