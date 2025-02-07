import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String[] strArr1 = {"aaa", "bb", "c", "dddd"};
        String[] strArr2 = {"aaa", "bb", "c", "dddd"};
        String[] strArr3 = {"aaa", "bb", "c", "dddd"};
        String[] strArr4 = {"aaa", "bb", "c", "dddd"};
                        //stream만들기     //IntStream만들기      //IntStream 메서드
        int sum = Stream.of(strArr1).mapToInt(String::length).sum();
        System.out.println(sum);

                        //stream만들기     //IntStream만들기      //T로 반환
        int sum2 = Stream.of(strArr2).mapToInt(String::length).reduce(0, (a,b)->a+b);
        System.out.println(sum2);

                        //stream만들기     //IntStream만들기              //Optional<T>로 반환
        OptionalInt sum3 = Stream.of(strArr3).mapToInt(String::length).reduce((a,b)->a+b);
        System.out.println(sum3.getAsInt());

                        //stream만들기     //Stream<T>반환       //T로 반환
        Integer sum4 = Stream.of(strArr4).map(String::length).reduce(0, (p,q)->Integer.sum(p,q));
        System.out.println(sum4);
    }
}
