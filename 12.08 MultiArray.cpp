import java.util.Arrays;

public class HelloJava {
    public static void main(String[] args) {
        int[][] score={ {1, 2, 3, 4},
                        {5, 6, 7},
                        {8, 9}};
        System.out.println(Arrays.deepToString(score));
        System.out.println(Arrays.toString(score[0]));      //그냥 score는 에러
        System.out.println(score[0][3]);                    //[0][4] 는 에러
        System.out.println(score[2][1]);                   
    }
}

        char [][] score2={{"Hey"},
                         {"what the"},
                         {"fuck you"}}; 
    	//이렇게는 불가 
