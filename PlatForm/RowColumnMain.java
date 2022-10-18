import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int [][] matrix = new int[M][N];
        int k = 1;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = k++;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(j!=0)
                    System.out.print(", ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
