import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);        // src�� i��° ���ڸ� ch�� ����
            System.out.println("src.charAt("+i+"):"+ ch);
        }
        char[] chBrr = src.toCharArray();
        char[] chArr = src.toCharArray();   // String�� src�� char�迭(char[])�� ��ȯ
        System.out.println(chArr);          // char�迭(char[])�� ���
        String str= new String(chArr);      // char�迭(char[])�� String���� ��ȯ�Ͽ� str�� ����
        System.out.println(str);            // String�� str�� ���

        Arrays.toString(chBrr);             //array�� string���� ��ȯ
        System.out.println(chBrr);
    }
}
