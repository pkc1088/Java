import java.util.Arrays;

public class HelloJava2 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);        // src의 i번째 문자를 ch에 저장
            System.out.println("src.charAt("+i+"):"+ ch);
        }
        char[] chBrr = src.toCharArray();
        char[] chArr = src.toCharArray();   // String인 src를 char배열(char[])로 변환
        System.out.println(chArr);          // char배열(char[])을 출력
        String str= new String(chArr);      // char배열(char[])을 String으로 변환하여 str에 저장
        System.out.println(str);            // String인 str을 출력

        Arrays.toString(chBrr);             //array를 string으로 변환
        System.out.println(chBrr);
    }
}
