import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.DoubleStream.generate;

class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> istm = list.stream();
        istm.forEach(System.out::print);
        System.out.println();

        ArrayList<Integer> arrList = new ArrayList<>(4);
        arrList.add(1); arrList.add(2); arrList.add(3); arrList.add(4);
        Stream<Integer> istm2 = arrList.stream();
        istm2.forEach(System.out::print);
        System.out.println();

        LinkedList<Integer> lkList = new LinkedList<>();
        lkList.add(1); lkList.add(2); lkList.add(3);
        Stream<Integer> istm3 = lkList.stream();
        istm3.forEach(System.out::print);
        System.out.println();

        String[] Sarr = new String[]{"ab", "bc", "cd"};
        Stream<String> istm4 = Stream.of(Sarr); //Arrays.stream(iarr) 동일
        istm4.forEach(System.out::print);
        System.out.println();

        int[] Iarr = new int[]{1,2};
        IntStream istm5 = Arrays.stream(Iarr); //Stream.of 동일
        istm5.forEach(System.out::print);
        System.out.println();

        IntStream istm6 = IntStream.range(1, 5);
        istm6.forEach(System.out::print);
        System.out.println();

        Stream<Integer> dstm = Stream.generate( ()->(int)(Math.random() * 5) );
        dstm.limit(3).forEach(System.out::print);
        System.out.println();

        Stream<Integer> evenStm = Stream.iterate(0, n->n+2);
        evenStm.limit(5).forEach(System.out::print);
        System.out.println();     //Intstream으로 하려면 mapToInt(Integer::valueOf)필요
    }
}
