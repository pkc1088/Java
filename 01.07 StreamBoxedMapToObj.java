import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String[] strArr = new String[]{"what.txt", "the.cpp", "hell.jpg"};

        Stream<String> strStm = Stream.of(strArr).map(String::toString);
        strStm//.map(String::toString)
              .filter(s -> s.indexOf('e')!=-1)
              .map(s -> s.substring(s.indexOf('.')+1))
              .map(String::toUpperCase)
              .distinct()
              .forEach(s->System.out.printf("%s ",s));
        System.out.println();


        IntStream istm = new Random().ints(1, 46);
        Stream<Integer> lotto = istm.distinct().limit(6).sorted().boxed();
        lotto.forEach(d->System.out.printf("%d ", d));
        System.out.println();

        istm = new Random().ints(1, 46);
        Stream<String> lotto2 = istm.distinct().limit(6).sorted().mapToObj(i->i+" ");
        lotto2.forEach(System.out::print);
    }
}
