class Case {
    int num=2;

    Case () { }

    int change(int x) {
        x+=100;
        return x;
    }
}

class MAIN
{
    static void change(String str)   {
        str += "456";
        System.out.println(str);
    }
    static void change(int num)   {
        num += 10;
        System.out.println(num);
    }
    public static void main(String args[]) {
        String str = "ABC123";
        int num = 10;
        System.out.println(str); System.out.println(num);
        change(str); change(num);
        System.out.println(str); System.out.println(num);

        Case c1 = new Case();
        System.out.println("c1.num : "+c1.num);
        c1.change(c1.num);
        System.out.println("c1.num : "+c1.num);
    }
}
