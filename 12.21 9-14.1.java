import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

class SUB {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890"
        };

        String[] phoneNumArr2 = new String[4];
        for (int i = 0; i < phoneNumArr.length; i++) {
            phoneNumArr2[i] = phoneNumArr[i].replace("-", "");
            System.out.println(phoneNumArr[i]+"  "+phoneNumArr2[i]);
        }

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String input = s.nextLine().trim();
            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            String ans = "";
            for (int i = 0; i < phoneNumArr.length; i++) {
                if(phoneNumArr2[i].contains(input)) {
                    ans = ans.concat(phoneNumArr[i]+"/");
                }
            }

            String[] strArr = ans.split("/");
            StringJoiner sj = new StringJoiner(",", "[", "]");
            for (String str : strArr)
                sj.add((str));
            System.out.println(sj.toString());
        }
    }
}
