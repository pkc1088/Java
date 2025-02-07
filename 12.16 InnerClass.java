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
        final static int CONST = 100;        // final static�� ����̹Ƿ� ����Ѵ�.
    }

    static class StaticInner {
        int iv2 = y;                         //x�� �Ұ�
        static int cv = func2();             // staticŬ������ static����� ������ �� �ִ�.
    }

    void myMethod() {
        int myx = 10;                    //final ��
        class LocalInner {
            int iv3 = myx;                //x,y �� �� ����
            final static int CONST = 300; // final static�� ����̹Ƿ� ���
        }
        System.out.println("Called myMethod()");
        LocalInner LI1 = new LocalInner();
        System.out.println(myx);
        System.out.println(LI1.iv3);
    }

    public static void main(String args[]) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);

        MAIN m1 = new MAIN();   //�ܺο��� ���� Ŭ������ ��������� �����ϴ� ���
        InstanceInner isi1 = m1.new InstanceInner();
        System.out.println(isi1.iv1);

        MAIN m2 = new MAIN();   //�ܺο��� ���� static Ŭ������ ��������� �����ϴ� ���
        StaticInner sti1 = new StaticInner();
        System.out.println(sti1.iv2);

        MAIN m3 = new MAIN();
        m3.myMethod();
    }
}
