import java.util.Date;

class Main {
   public static void main(String[] args) throws Exception {
      Date d = new Date();
      System.out.printf("%tY %tm %td\n", d, d, d);
      System.out.printf("%1$tH %1$tM %1$tS", d);
   }
}
