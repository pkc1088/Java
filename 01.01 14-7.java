import java.util.*;
import java.util.function.Supplier;

class Sub {
    public static void main(String[] args) {
        Supplier<Integer> s = ()->(int)(Math.random()*45+1);
        ArrayList<Integer> list = new ArrayList();
        makeRandomList(s, list);
        Collections.sort(list);
        System.out.println(list.toString());

        System.out.println();
        new Random().ints(1,46).distinct().limit(6).sorted()
                    .forEach(System.out::println);
    }
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 6; i++) {
            list.add(s.get());
        }
    }
}
