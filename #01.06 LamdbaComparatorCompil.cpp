import java.util.*;

abstract class Fruit	{
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name   = name;
        this.weight = weight;
    }

    public String toString() { return name+"("+weight+")";}
	
	abstract public int getWeight();
}

class Grape extends Fruit {
    Grape(String name, int weight) {
        super(name, weight);
    }
    
	public int getWeight() {
        return this.weight;
    }
}

/*  1번용
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
        grapeBox.add(new Grape("GreenGrape", 200));

        System.out.println(grapeBox);
        System.out.println();
    /*  
		// 1 번
        // Collections.sort(appleBox.getList(), new FruitComp());


        // 2 번
        Collections.sort(grapeBox.getList(), (Fruit s1,Fruit s2)->
                        (((Integer)s1.weight).compareTo((Integer)s2.weight)));
    */


        // 3 번
        Collections.sort(grapeBox.getList(), Comparator.comparing(Fruit::getWeight));

		
	/*
        // 4번
		Collections.sort(grapeBox.getList(), new Comparator<Fruit>() {
            public int compare(Fruit t1, Fruit t2) {
                return t1.weight - t2.weight;
            }
        });

		// 5번
		BiFunction<Integer, Integer, Integer> bf = (x,y) -> (x-y)>0 ? 1 : ( (x-y)==0 ? 0 : -1 );
        Collections.sort(grapeBox.getList(), (Fruit s1,Fruit s2)->
                            bf.apply(s1.weight, s2.weight));
		
		
		// 6번
		Collections.sort(grapeBox.getList(), (Fruit s1,Fruit s2)->
                Integer.compare(s1.weight, s2.weight));
	*/		
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
