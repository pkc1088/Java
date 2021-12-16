class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 1; i <= 20 ; i++) {
            if(i==1 || i==3 || i==8)
                cards[i-1] = new SutdaCard(i, true);
            else if(i>10)
                cards[i-1] = new SutdaCard(i-10, false);
            else
                cards[i-1] = new SutdaCard(i, false);
        }
    }
    void shuffle() {
        SutdaCard temp = new SutdaCard();

        for (int j = 0; j < 20; j++) {
            int i = (int) (Math.random() * cards.length);
            temp = cards[j];
            cards[j] = cards[i];
            cards[i] = temp;
        }
    }
    SutdaCard pick(int x) {
        return cards[x];
    }
    SutdaCard pick() {
        return cards[(int) (Math.random() * cards.length)];
    }
}

class SutdaCard {
    int num;
    boolean   isKwang;
    SutdaCard() {
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}

class SUB {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
