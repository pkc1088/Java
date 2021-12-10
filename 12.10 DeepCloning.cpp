class Data { int x; }

class MAIN {
    public static void main(String[] args)
    {
        Data d = new Data();
        d.x = 10;
        Data d2 = copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x="+d2.x);

        Data d3 = d2;
        d3.x++;
        System.out.println("d3.x="+d3.x);

        int a=2;
        int b=cloning(a);
        System.out.println(a+" "+b);
        System.out.println(a+" "+b);
    }
    static int cloning(int a){
        int b=a;
        a++;
        return b;
    }
    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = 100;
        return tmp;
    }
}
