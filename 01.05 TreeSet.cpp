import com.sun.source.tree.Tree;

import java.util.*;

class Main {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        for (int i = 0; i < 10; i++) {
            int x = (int)(Math.random()*100);
            ts.add(x);
        }
        SortedSet ss = ts.tailSet(3);
        System.out.println(ss);
        System.out.println(ts.headSet(50));
        
    }
}
