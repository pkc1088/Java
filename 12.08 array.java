public class HelloJava2 {
    public static void main(String[] args) {
        int []score = new int[]{3,1,2,3,4};
        int score2[] = {12,12,13,14,15};
        int len = score.length;
        score[1]=1;
        score2[1]=11;
        System.out.println(score[0]);
        System.out.println(score2[1]);
        System.out.println(len);
    }
}
