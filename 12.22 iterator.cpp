import java.util.*;

class SUB {
    public static void main(String[] args) {
        Collection list = new LinkedList();     //collection�� ������ new ���� �����ϱ� ����
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    } 
}
