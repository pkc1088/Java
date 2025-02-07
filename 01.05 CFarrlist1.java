import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        ArrayList arrList1 = new ArrayList(30);
        for (int i = 0; i < 30; i++) {
            arrList1.add(i);
        }
        ArrayList arrList2 = (ArrayList) arrList1.clone();
        ArrayList arrList3 = new ArrayList(arrList1.size()*2);
        for (int i = 100; i < 160; i++) {
            arrList3.add(i);
        }
        System.out.println("arrList3(10) :"+arrList3.get(10));
        arrList3.addAll(0, arrList1);
        System.out.println("arrList3(10) :"+arrList3.get(10));

        if(arrList1.contains(24))
            System.out.println("contains 24");
        if(arrList2.equals(arrList1))
            System.out.println("same");
        arrList2.clear();
        if(arrList2.equals(arrList1))
            System.out.println("same");
        else
            System.out.println("different");
        int x = (int) arrList1.get(24);
            System.out.println("x: "+x);
        
        ArrayList arrList4 = new ArrayList(30);
        for (int i = 0; i < 20; i++) {
            arrList4.add(i);
        }
        Collections.sort(arrList4);
        ArrayList arrList5 = (ArrayList) arrList4.clone();
        arrList4.add(40);   arrList5.add(400);
        System.out.println(arrList4.get(20)+" "+arrList5.get(20));
        arrList4.remove(20);
        System.out.println(arrList4);
    }
}
