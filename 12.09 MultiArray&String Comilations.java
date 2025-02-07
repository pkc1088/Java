import java.util.Arrays;

public class HelloJava {
    public static void main(String[] args) {

        char[] Cscore = {'z', 'x', 'c', 'v', 'b'};
        System.out.println(Arrays.toString(Cscore));
        System.out.println(Cscore[0]);


        int[][] score={ {1, 2, 3, 4},                       //score[0]
                        {5, 6, 7},                          //score[1]
                        {8, 9}};							//score[2]
        System.out.println(Arrays.deepToString(score));     //char로 바꿔도 모두 동일
        System.out.println(Arrays.toString(score[0]));      //그냥 score는 에러
        System.out.println(score[0][3]);                    //[0][4] 는 에러


        String src = "ABCDE";
        System.out.println(src);


        String[] Swords = {"what", "the", "fuck"};
        System.out.println(Arrays.deepToString(Swords));
        System.out.println(Arrays.toString(Swords));         //string은 array가 아니니 Swords[0]하면 에러
        System.out.println(Swords[0]);                       //Swords[0][0] 불가


        String[][] words = {{"chair","의자"},			// words[0] = words[0][0], words[0][1]
                            {"computer","컴퓨터"},	    // words[1] = words[1][0], words[1][1]
                            {"integer","정수"}};         // words[2] = words[2][0], words[2][1]
        System.out.println(Arrays.deepToString(words)); // Arrays.toString은 안됨
        System.out.println(Arrays.deepToString(words[0]));
        System.out.println(Arrays.toString(words[0]));
        System.out.println(words[0][0]);                //words[0]은 에러
    }
}
