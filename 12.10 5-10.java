import java.util.Scanner;

public class HelloJava2 {
    public static void main(String[] args) {
        char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                          '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                          '}', ';', ':', ',', '.', '/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "Abc123";
        String result = "";

        for(int i=0; i < src.length(); i++){
            char ch = src.charAt(i);
            if(ch >='a' && ch <= 'z')
                ch = abcCode[ch-'a'];
            else if(ch >='A' && ch <= 'Z')
                ch = abcCode[ch-'A'];
            else if(ch >= '0' && ch <='9')
                ch = numCode[ch-'0'];
            result+=ch;
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    }
}
