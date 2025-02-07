import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1.peekFirst());
        LinkedList<Integer> l2 = new LinkedList<Integer>(l1);
        l2.addFirst(100); l2.addLast(200);
        System.out.println("200 is at index : "+l2.lastIndexOf(200));
        List<Integer> l3 = l2.subList(1, 5);
        g(l3);      //�ȸ�����
        LinkedList xx = new LinkedList(l3); //List�� l3�� �޾Ƽ� ���ο�
        System.out.println(l3);             //LinkedList��������
        System.out.println(l3.getClass());
        System.out.println(l2.getClass());
        System.out.println(xx.getClass());
    }
    public static <T> void g(List<T> l) {
        System.out.println("change List into LinkedList");
    }
}
