class Data { int x; }

class MAIN {
    public static void main(String[] args)
    {
        MAIN m = new MAIN();
        Data d = new Data();
        d.x = 10;

        Data d2 = m.copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x="+d2.x);
    }

    Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
