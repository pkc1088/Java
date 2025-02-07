import java.awt.color.ProfileDataException;

class MAIN {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;
    void buy (Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 "+p.toString()+"을/를 살 수 없습니다");    //p라고 해도됨
            return;
        }
        else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
        if(i>=cart.length) {
            Product[] temp = new Product[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                temp[j] = cart[j];
            }
        //  System.arraycopy(cart, 0, temp, 0, cart.length);
            cart = temp;
        }
        cart[i++] = p;
    }

    void summary() {
    /*  System.out.print("구입 물건 : ");
        for (int j = 0; j < cart.length; j++) {
            if(cart[j] instanceof Tv) {
                Tv t = new Tv();
                System.out.print(t.toString()+",");
            }
            else if(cart[j] instanceof Computer) {
                Computer t = new Computer();
                System.out.print(t.toString()+",");
            }
            else {
                Audio t = new Audio();
                System.out.print(t.toString()+",");
            }
        }
        System.out.println();*/
        String itemList = "";
        int sum = 0;
        for (int j = 0; j < cart.length; j++) {
            if(cart[j] == null)
                break;
            itemList += cart[j].toString() + ",";   //toString()뺴도 됨
            sum += cart[j].price;
        }
        System.out.println("구입 물건 : "+itemList);
        System.out.println("사용금액 : "+sum);
        System.out.printf("남은금액 : "+money);
    }
}

class Product {
    int price;
    Product (int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {super(100);}
    public String toString() {return "Tv";}
}
class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "Computer";}
}
class Audio extends Product {
    Audio() {super(50);}
    public String toString() {return "Audio";}
}
