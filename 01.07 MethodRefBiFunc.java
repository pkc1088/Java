import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

class Fruit	{
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name   = name;
        this.weight = weight;
    }

    public String toString() { return name+"("+weight+")";}

}

class Grape extends Fruit {
    Grape(String name, int weight) {
        super(name, weight);
    }
}

/*  1¹ø¿ë
class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2) {
        return t1.weight - t2.weight;
    }
}*/

class Main {
    public static void main(String[] args) {
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        grapeBox.add(new Grape("GreenGrape", 100));
        grapeBox.add(new Grape("GreenGrape", 300));

        BiFunction<String, Integer, Grape> bf = Grape::new;
        Grape grape1 = bf.apply("grape1", 10);
        grapeBox.add(grape1);
        System.out.println(grapeBox);
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() { return list; }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
