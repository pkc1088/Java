import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Main {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "ccccd"};

        StringBuffer sb = new StringBuffer();
        for(String tmp : strArr)
            sb.append(tmp);

        long x = Stream.of(sb.toString()).collect(counting());
        System.out.println(x);


        Stream<String[]> ss = Stream.of(new String[]{"abc", "sdsd", "vevv"},
                                        new String[]{"asd", "bb", "ccc"});
        long cnt = ss.count();


        ss = Stream.of(new String[]{"abc", "sdsd", "vevv"},
                       new String[]{"asd", "bb", "ccc"});
        long cnt2 = ss.collect(counting());
        System.out.println(cnt+" "+cnt2);

    }
}
