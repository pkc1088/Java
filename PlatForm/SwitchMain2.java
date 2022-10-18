import java.util.ArrayList;
import java.util.Scanner;

public class SwitchMain2 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";

        for (;;) {
            str = sc.next();
            if(str.equals("quit")) {
                System.out.println("Bye");
                break;
            }

            if(str.equals("add")) {
                int val = sc.nextInt();
                switch(val) {
                    case 1:
                        arrlist.add("January"); break;
                    case 2:
                        arrlist.add("February"); break;
                    case 3:
                        arrlist.add("March"); break;
                    case 4:
                        arrlist.add("April"); break;
                    case 5:
                        arrlist.add("May"); break;
                    case 6:
                        arrlist.add("June"); break;
                    case 7:
                        arrlist.add("July"); break;
                    case 8:
                        arrlist.add("August"); break;
                    case 9:
                        arrlist.add("September"); break;
                    case 10:
                        arrlist.add("October"); break;
                    case 11:
                        arrlist.add("November"); break;
                    case 12:
                        arrlist.add("December"); break;
                    default:
                        break;
            }

            }

            else if(str.equals("print")) {
                System.out.println(arrlist);
            }

            else
                System.out.println("Invalid Command");
        }


    }
}
