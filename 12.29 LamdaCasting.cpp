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
        Myfunction f = (Myfunction) (i) -> {System.out.println("called myMethod by f");
                                            System.out.println(i);};
        aMethod(f);
        aMethod(getfunc());

        Object obj = (Object) (Myfunction) (i) -> {System.out.println("called myMethod by f2");
                                             System.out.println(i);};
        Object obj2 = new Object();
        System.out.println(obj.equals(obj2));
    }
}
