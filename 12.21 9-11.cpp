import java.util.Scanner;

class MAIN {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        try {
            if (start < 2 || end > 9) {
                throw new Exception("2와 9사이만 된다");
            }
            gogodan(start, end);

        } catch(Exception e) {
            System.out.println("에러 : " + e.getMessage());
        }

    }
    public static void gogodan(int start, int end) {
        for (; start < end+1; start++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(start+"*"+j+"="+(start*j));
            }
            System.out.println();
        }
    }
}
