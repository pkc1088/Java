import java.util.ArrayList;
import java.util.*;

class Main {

    @FunctionalInterface
    interface Myfunction {
        void myMethod(int i);
    }

    static void aMethod(Myfunction f) {
        f.myMethod(5);
    }

    static Myfunction getfunc() {
        Myfunction f = (i) -> {System.out.println("hey");};
        return f;
    }

    public static void main(String args[]) {
        Myfunction f = (i) -> {System.out.println("called myMethod");
                               System.out.println(i);};
        aMethod(f);
        aMethod(getfunc());
    }
}

