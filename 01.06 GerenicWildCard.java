import java.util.*;

class Main {
    public static void main(String[] args) {
        FruitBox<Apple> applebox = new FruitBox<>();
        applebox.arrlist.add(new Apple());
        applebox.addHere(new Apple());
        FruitBox<Grape> grapebox = new FruitBox<>();
        grapebox.arrlist.add(new Grape());
        grapebox.addHere(new Grape());
        FruitBox<Fruit> fruitbox = new FruitBox<>();
        fruitbox.arrlist.add(new Apple());
        fruitbox.addHere(new Grape());
        fruitbox.addHere(new Fruit());
        //FruitBox<Toy> ToyBox = new FruitBox<>(); 불가(T extends Fruit)

        System.out.println("AppleBox : "+applebox);
        System.out.println("GrapeBox : "+grapebox.arrlist);
        System.out.println("FruitBox : "+fruitbox.arrlist);

        System.out.println(Juicer.makeJuice(applebox)); //static이니까 가능
        System.out.println(Juicer.<Fruit>makeJuice(fruitbox));
        System.out.println(Juicer.makeJuice(fruitbox));
    }
}

interface Eatable {
}

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Grape extends Fruit {
    public String toString() {return "Grape";}
}

class Apple extends Fruit {
    public String toString() {return "Apple";}
}

class Toy {
    public String toString() {return "Toy";}
}

class Juice {
    String name;

    Juice(String name) {this.name = name + "Juice";}

    public String toString() {return name;}
}

class Juicer {
    static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
        String tmp = "";
        for(Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

class FruitBox<T extends Fruit & Eatable> {
    ArrayList<T> arrlist = new ArrayList<>(100);

    void addHere(T item) {arrlist.add(item);}
    ArrayList<T> getList() {return arrlist;}
    public String toString() {return arrlist.toString();}
}
