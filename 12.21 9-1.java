class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard () {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals (Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard sc2 = (SutdaCard) obj;
            if (sc2.num == this.num && sc2.isKwang == this.isKwang)
                return true;
            else
                return false;
            //    return num == ((SutdaCard) obj).num && isKwang == ((SutdaCard) obj).isKwang;
        }
        else
            return false;
    }
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class SUB {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1.equals(c2) : "+c1.equals(c2));
    }
}
