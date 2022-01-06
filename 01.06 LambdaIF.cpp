import java.util.*;
interface  MyFunction {
    public abstract int max(int a, int b);
}
interface  MyFunction2 {
    public abstract int min(int a, int b);
}
class Main {
    static int[] arr = new int[5];
    public static void main(String[] args) {
        MyFunction2 f2 = new MyFunction2() {
            @Override
            public int min(int a, int b) {
                return a>b?b:a;
            }
        };
        System.out.println(f.max(5,3));
        System.out.println(f2.min(5, 3));


    }
    static MyFunction f = new MyFunction() {
        @Override
        public int max(int a, int b) {
            return a>b?a:b;
        }
    };
}
