class Outer {
    int value = 10;
    class Inner {
        int value = 20;
        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    }
}

class SUB {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();

        inner.method1();
    }
}
