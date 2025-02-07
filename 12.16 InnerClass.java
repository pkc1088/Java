class MAIN {
    int x = 2;
    static int y = 3;
    public int func1() {
        return 1000;
    }
    static public int func2() {
        return 2000;
    }

    class InstanceInner {
        int iv1 = x;
        int iv2 = y;
        int iv3 = func1();
        final static int CONST = 100;        // final static은 상수이므로 허용한다.
    }

    static class StaticInner {
        int iv2 = y;                         //x는 불가
        static int cv = func2();             // static클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {
        int myx = 10;                    //final 임
        class LocalInner {
            int iv3 = myx;                //x,y 둘 다 가능
            final static int CONST = 300; // final static은 상수이므로 허용
        }
        System.out.println("Called myMethod()");
        LocalInner LI1 = new LocalInner();
        System.out.println(myx);
        System.out.println(LI1.iv3);
    }

    public static void main(String args[]) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);

        MAIN m1 = new MAIN();   //외부에서 내부 클래스의 멤버변수에 접근하는 방법
        InstanceInner isi1 = m1.new InstanceInner();
        System.out.println(isi1.iv1);

        MAIN m2 = new MAIN();   //외부에서 내부 static 클래스의 멤버변수에 접근하는 방법
        StaticInner sti1 = new StaticInner();
        System.out.println(sti1.iv2);

        MAIN m3 = new MAIN();
        m3.myMethod();
    }
}
