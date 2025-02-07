import java.util.*;
class SUB {
    public static void main(String[] args) {
        Object[] objArr = {1, new Integer(2), "3"};
        System.out.println(objArr[0]+" "+objArr[1]+" "+objArr[2]);
        String str = "what are you doing";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        List list1 = new LinkedList();
        list1.add(2);   list1.add(5);   list1.add(1);
        Collections.sort(list1);
        System.out.print(list1+" ");
    }
}
