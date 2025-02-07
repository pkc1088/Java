import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        List<String> lt
                = Stream
                .of("GEEKS", "For", "GEEKS")
                .collect(Collectors
                        .collectingAndThen(
                                Collectors.toList(),
                                Collections::<String> unmodifiableList));
        System.out.println(lt);


        Map<String, String> mp
                = Stream
                .of(new String[][] {
                        { "1", "Geeks" },
                        { "2", "For" },
                        { "3", "Geeks" } })
                .collect(
                        Collectors
                                .collectingAndThen(
                                        Collectors.toMap(p -> p[0], p -> p[1]),
                                        Collections::<String, String>
                                                unmodifiableMap));
        System.out.println(mp);


        Set<String> st
                = Stream
                .of("GEEKS", "FOR", "GEEKS")
                .collect(
                        Collectors
                                .collectingAndThen(Collectors.toSet(),
                                        Collections::<String>
                                                unmodifiableSet));
        System.out.println(st);


    }
}

