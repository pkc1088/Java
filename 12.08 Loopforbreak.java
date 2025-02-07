public class HelloJava2 {
    public static void main(String[] args) {
        Loop1: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2)
                    break Loop1;
                System.out.println(i);
                System.out.println(j);
            }
        }
        System.out.println();
    }
}
