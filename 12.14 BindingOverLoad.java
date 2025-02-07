class MAIN{
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        Parent.method2();
        p.method();

        System.out.println("c.x = " + c.x);
        Child.method2();
        c.method();
    }
}

class Parent {
    int x = 100;

    static void method2() {
        System.out.println("Parent Method");
    }
    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    static void method2() {
        System.out.println("Child Method");
    }
    void method() {
        System.out.println("Child Method");
    }
}
