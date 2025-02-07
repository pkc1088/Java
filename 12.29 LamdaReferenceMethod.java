import java.util.function.*;
import java.util.*;

class MyClass {
    int i;
    MyClass(int i) {
        System.out.println(i+" Called MyClass Constructor");
        this.i = i;
    }
    int getI() {
        return i;
    }
}
class Main {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass(1);
        System.out.println("mc1 : "+mc1.i+"  (Basic constructor)");

        Function<Integer, MyClass> f = (k) -> new MyClass(k);
        MyClass mc2 = f.apply(12);
        System.out.println("mc2 : "+mc2.i+"  (Lamda method)");

        Function<Integer, MyClass> f2 = MyClass::new;
        MyClass mc3 = f2.apply(24);
        System.out.println("mc3 : "+mc3.getI()+"  (Reference method)");

        Function<String, Integer> f3 = Integer::parseInt;
        System.out.println("\n"+f3.apply("15")/5);
    }
}
