import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        ArrayList c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        ListIterator it = c.listIterator();
        while(it.hasNext()) {
            it.next();
        //  System.out.print(it.next()+" ");
        //  it.remove();
        }
        System.out.println();
        while(it.hasPrevious())
            System.out.print(it.previous()+" ");
        
        

    }
}
