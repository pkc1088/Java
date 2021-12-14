class Case {
    int num=2;

    Case () { }

    void change(int x) {
        x+=100;
    }
}

class MAIN
{
    static int x1 = 10;
    static void change2(int x1) {
        x1+=100;
    }
    public static void main(String args[]) {
        Case c1 = new Case();
        Case c2 = c1;

        System.out.println("c1.num : "+c1.num);
        System.out.println("c2.num : "+c2.num);

        c1.num++; c2.num++;

        change2(x1);
        System.out.println("x1 : "+x1);
        System.out.println("c1.num : "+c1.num);
        System.out.println("c2.num : "+c2.num);
    }
}
