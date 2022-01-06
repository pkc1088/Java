import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String[] strArr1 = {"aaa", "bb", "c", "dddd"};
        String[] strArr2 = {"aaa", "bb", "c", "dddd"};
        String[] strArr3 = {"aaa", "bb", "c", "dddd"};
        String[] strArr4 = {"aaa", "bb", "c", "dddd"};
        String[] strArr5 = {"aaa", "bb", "c", "dddd"};
        String[] strArr6 = {"aaa", "bb", "c", "dddd"};

                         //stream만들기     //IntStream만들기      //OptionalInt로 반환
        OptionalInt max = Stream.of(strArr1).mapToInt(String::length).max();
        System.out.println(max.getAsInt());

                        //stream만들기     //IntStream만들기      //T로 반환
        int max2 = Stream.of(strArr2).mapToInt(String::length).reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b);
        System.out.println(max2);

                        //stream만들기     //IntStream만들기              //Optional<T>로 반환
        OptionalInt max3 = Stream.of(strArr3).mapToInt(String::length).reduce(Integer::max);
        System.out.println(max3.getAsInt());

                        //stream만들기     //Stream<T>반환       //T로 반환
        Integer max4 = Stream.of(strArr4).map(String::length).reduce(Integer.MIN_VALUE, (p,q)->Integer.max(p,q));
        System.out.println(max4);

        
        Stream.of(strArr5).map(String::length).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

        
        Stream.of(strArr6).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).forEach(System.out::println); 
    }
}
