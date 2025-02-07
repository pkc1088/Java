class MAIN {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        c.method3();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
        Parent p = new Child();
        p.method1();
        Parent p2 = new Parent();
        p2.method1();
    }
}

class Parent {
    public void method1() {
        System.out.println("method1() in Parent");  //p2�� ������ Parent�ϱ� �̰� ���
    }
}

class Child extends Parent implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child"); // �������̵� (�θ� �޼ҵ带 �������̵���)
    }
    public void method2() {
        System.out.println("method2() in Child"); // �������̵� (default �޼ҵ� ����)
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    default void method3() {
        System.out.println("method3() in MyInterface");
    }

    static  void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static  void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
