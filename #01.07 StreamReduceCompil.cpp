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

        int count = intStream1.reduce(0, (a,b) -> a + 1);   //IntStream �ʱⰪ o reduce�̿�
        int sum   = intStream2.reduce(0, (a,b) -> a + b);   //int �� ��ȯ
        System.out.println("count="+count);
        System.out.println("sum="+sum);


        OptionalInt OPmax = intStream3.reduce(Integer::max);   //IntStream�̿� �ʱⰪ x reduce�̿�
        OptionalInt OPmin = intStream4.reduce(Integer::min);   //min�� OptionalInt�� ��ȯ
        System.out.println("max="+ OPmax.getAsInt());          //getAsInt�� int�� ��ȯ
        System.out.println("min="+ OPmin.getAsInt());


        long cnt = Stream.of(strArr).count();
        Optional<String> xxmin = Stream.of(strArr).max(Comparator.naturalOrder());
        System.out.println("cnt : "+cnt);
        System.out.println(xxmin.get());


        Stream<String> SIX = Stream.of(strArr);
        SIX.limit(5).forEach(s->System.out.printf("%s ", s));
    }

}
