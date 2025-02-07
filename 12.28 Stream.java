import java.util.stream.Stream;

class Main {
    public static void main(String args[]) throws Exception{
        Stream<Integer> intStream = Stream.iterate(1, n->n+2);
        intStream.limit(5).forEach(System.out::print);
        System.out.println();

        Stream<Integer> oneStream = Stream.generate(()->2);
        oneStream.limit(5).forEach(System.out::print);
        System.out.println();

        Stream<Integer> emptyStream = Stream.empty();   //<Integer>»©µµµÊ
        System.out.println(emptyStream.count());
    }
}
