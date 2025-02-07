import java.util.Scanner;

class MAIN {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner("100,200,300\n400,500,600\n700,800,900");
        int cnt = 0;
        int totalSum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while(sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = "+ sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
