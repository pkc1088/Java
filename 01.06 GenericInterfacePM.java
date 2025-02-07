import java.util.*;

class Main {
    public static void main(String[] args) {
        FruitBox<Apple> AppleBox = new FruitBox<>();
        AppleBox.arrlist.add(new Apple());
        AppleBox.addHere(new Apple());
        FruitBox<Grape> GrapeBox = new FruitBox<>();
        GrapeBox.arrlist.add(new Grape());
        GrapeBox.addHere(new Grape());
        FruitBox<Fruit> FruitBox = new FruitBox<>();
        FruitBox.arrlist.add(new Apple());
        FruitBox.addHere(new Grape());
        FruitBox.addHere(new Fruit());
        //Box<Toy> ToyBox = new Box<>(); ºÒ°¡(T extends Fruit)


        System.out.println("AppleBox : "+AppleBox);
        System.out.println("GrapeBox : "+GrapeBox.arrlist);
        System.out.println("FruitBox : "+FruitBox.arrlist);
    }
}
interface Eatable {
    
}

class Fruit implements Eatable {
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

class Toy {
    public String toString() {
        return "Toy";
    }
}

class FruitBox<T extends Fruit & Eatable> {
    ArrayList<T> arrlist = new ArrayList<>(100);

    void addHere(T item) {
        arrlist.add(item);
    }

    public String toString() {
        return arrlist.toString();
    }
}
