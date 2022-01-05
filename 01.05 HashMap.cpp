import com.sun.source.tree.Tree;

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap hm = new HashMap(10);
        hm.put("a", "65");  hm.put("b", "66");
        hm.put("c", "67");  hm.put("d", "68");
        System.out.println(hm.get("a"));
        System.out.println(hm.hashCode());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        if(hm.containsKey("c"))
            System.out.println("hm has c as key");
        if(hm.containsValue("67"))
            System.out.println("hm has 67 as value");

        Set set = hm.entrySet();
        System.out.println(set);
        
        HashMap hm2 = (HashMap) hm.clone();
        System.out.println(hm2.hashCode());
        hm2.replace("c", "6677");
        System.out.println(hm.get("c")+" "+hm2.get("c"));
        hm.put("c", "100");
        System.out.println(hm.get("c"));
       
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }



    }
}
