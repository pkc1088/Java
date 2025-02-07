import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        HashSet set1 = new HashSet(list1);
        HashSet set2 = new HashSet(list2);
        HashSet temp;

        temp = new HashSet(set1);
        temp.retainAll(set2);
        kyo = new ArrayList(temp);


        temp = new HashSet(set1);
        temp.removeAll(set2);
        cha = new ArrayList(temp);


        temp = new HashSet(set2);           //3456
        temp.removeAll(kyo);                //56
        Collection c = new HashSet(temp);   //56
        Iterator it = c.iterator();         //56
        hap = new ArrayList(set1);          //1234
        while(it.hasNext()) {
            hap.add(it.next());             //123456
        }

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);     //답지 풀이 참고
    }
}
