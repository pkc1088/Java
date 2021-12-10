import java.util.Scanner;

public class HelloJava2 {
    public static void main(String[] args) {
        char[][] star = {{'*','*',' ',' ',' '},
                         {'*','*',' ',' ',' '},
                         {'*','*','*','*','*'},
                         {'*','*','*','*','*'}};
        char[][] result = new char[star[0].length][star.length];
                                        //5            4
        for(int i=0; i < star.length; i++) {
            for(int j=0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i < star.length; i++) {            //4
            for(int j=0; j < star[i].length; j++) {     //5
                result[j][star.length-1-i] = star[i][j];
            }
        }

        for(int i=0; i < result.length; i++) {
            for(int j=0;j < result[i].length; j++) {
            System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
