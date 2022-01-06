import java.util.*;
import java.util.function.BiFunction;
import java.util.function.*;

interface TriFunction<T,U,V,R> {
    R apply (T t, U u, V v);
}

class Main {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s->s.length()==0;
        String s = "";

        if(isEmptyStr.test(s))
            System.out.println("Empty");

        Function<String, String> f = str->str+str;
        BiFunction<String, String, String> bf = (strx,stry)->strx+stry;
        TriFunction<String, String, String, String> tf = (strx, stry, strz)->strx+stry+strz;
        System.out.println(f.apply("hello"));
        System.out.println(bf.apply("hello","world"));
        System.out.println(tf.apply("hello", "beautiful", "world"));
    }
}
