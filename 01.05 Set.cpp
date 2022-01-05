import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

class Main {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Set set = new HashSet();

        for (int i = 0; i < strArr.length; i++) {
            set.add(strArr[i]);
        }
        System.out.println("set : "+set);
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("list : "+list);

        list.sort(CASE_INSENSITIVE_ORDER);  //stringÀÇ comparator
        System.out.println("CaseInsen : "+list);

        Iterator it = set.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        
        
    }
}
