import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String[] strArr = {
                "Believe or not it is true",
                "Do or do not there is no try",
        };

        Arrays.stream(strArr)
              .flatMap(line->Stream.of(line.split(" +")))
              .forEach(System.out::println);
        System.out.println();

        
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"});
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
        strStrm.map(String::toLowerCase)
               .distinct()
               .sorted()
               .forEach(System.out::println);               
        System.out.println();

    }
}

