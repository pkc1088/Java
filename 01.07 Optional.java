import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.empty();
        System.out.println(optVal.orElse("IsEmpty"));

        int result = Optional.of("112").filter(x->x.length()>2)
                             .map(Integer::parseInt).orElse(-1);
        System.out.println(result);

        String str = "IsString";
        Optional.ofNullable(str).ifPresent(System.out::println);

    }
}
