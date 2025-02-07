import java.util.*;

class Main {
    public static void main(String[] args) {
        Box<Apple> AppleBox = new Box<>();
        AppleBox.arrlist.add(new Apple());
        AppleBox.addHere(new Apple());
        Box<Grape> GrapeBox = new Box<>();
        GrapeBox.arrlist.add(new Grape());
        GrapeBox.addHere(new Grape());
        Box<Fruit> FruitBox = new Box<>();
        FruitBox.arrlist.add(new Apple());
        FruitBox.addHere(new Grape());
        FruitBox.addHere(new Fruit());

        System.out.println(AppleBox);
        System.out.println(GrapeBox.arrlist);
        System.out.println(FruitBox.arrlist);
    }
}
class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Box<T> {
    ArrayList<T> arrlist = new ArrayList<>(100);

    void addHere(T item) {
        arrlist.add(item);
    }

    public String toString() {
        return arrlist.toString();
    }
}

