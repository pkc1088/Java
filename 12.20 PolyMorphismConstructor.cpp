class Tv {
    Tv(){
        System.out.println("called Tv");
    }
}

class SmartTv extends Tv{
    SmartTv(){
        System.out.println("called SmartTv");
    }
}

class LGSmartTv extends SmartTv {
    LGSmartTv(){
        System.out.println("called LGSmartTv");
    }
}

class SUB {
    public static void main(String[] args) {
        Tv t = new Tv();
        SmartTv s1 = new SmartTv();
        LGSmartTv lg = new LGSmartTv();

        t = s1;
        s1 = (SmartTv) t;
    }
}
