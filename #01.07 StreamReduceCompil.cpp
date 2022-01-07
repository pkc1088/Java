import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').findFirst();

        System.out.println("noEmptyStr="+noEmptyStr);
        System.out.println("sWord="+ sWord.get());

        // Stream<String[]>   ->  IntStream
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a,b) -> a + 1);   //IntStream 초기값 o reduce이용
        int sum   = intStream2.reduce(0, (a,b) -> a + b);   //int 로 반환
        System.out.println("count="+count);
        System.out.println("sum="+sum);


        OptionalInt OPmax = intStream3.reduce(Integer::max);   //IntStream이용 초기값 x reduce이용
        OptionalInt OPmin = intStream4.reduce(Integer::min);   //min은 OptionalInt로 반환
        System.out.println("max="+ OPmax.getAsInt());          //getAsInt는 int로 반환
        System.out.println("min="+ OPmin.getAsInt());


        long cnt = Stream.of(strArr).count();
        Optional<String> xxmin = Stream.of(strArr).max(Comparator.naturalOrder());
        System.out.println("cnt : "+cnt);
        System.out.println(xxmin.get());


        Stream<String> SIX = Stream.of(strArr);
        SIX.limit(5).forEach(s->System.out.printf("%s ", s));
    }

}
