import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack st = new Stack();
        Queue q = new LinkedList();
        Deque dq = new LinkedList();
        st.push(0); st.push(1); st.push(2);
        q.offer(0); q.offer(1); q.offer(2);
        dq.offerFirst(0); dq.offerFirst(1); dq.offerFirst(2);
        System.out.println("stack : "+st.pop()+" Queue : "+q.poll());
        System.out.println("dequeue : "+dq.pollLast()+" "+dq.pollFirst());

        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        Object obj = null;
        while((obj = pq.poll())!=null)
            System.out.print(obj+" ");
        
    }
}
