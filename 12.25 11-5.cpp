import java.lang.reflect.Array;
import java.util.*;

class Sub implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Sub(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math; }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/   3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ ban +","+ no +","+ kor +","+ eng  +","+ math +","
                    +getTotal() +","+ getAverage();
    }

    public int compareTo(Object o) {
        if(o instanceof Sub) {
            Sub temp = (Sub) o;
            return name.compareTo(temp.name);
        } else {
            return -1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Sub("ȫ�浿",1,1,100,100,100));
        list.add(new Sub("���ü�",1,2,90,70,80));
        list.add(new Sub("���ڹ�",1,3,80,80,90));
        list.add(new Sub("���ڹ�",1,4,70,90,70));
        list.add(new Sub("���ڹ�",1,5,60,100,80));
        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
