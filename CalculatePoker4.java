import java.io.*;
import java.util.*;

public class Main {

    public static class Field {
        int player_num;
        int total_cost;
        int cost_per_hour;
        int beverage;
        int ante;
        int hand_no;

        Field(int player_num, int total_cost, int cost_per_hour, int beverage, int ante, int hand_no) {
            this.player_num = player_num;
            this.total_cost = total_cost;
            this.cost_per_hour = cost_per_hour;
            this.beverage = beverage;
            this.ante = ante;
            this.hand_no = hand_no;
        }
    }

    public static class Player {
        String name;
        float playtime;
        int etc_expense;
        int profit;
        int payment;

        Player(String name, float playtime, int etc_expense) {
            this.name = name;
            this.playtime = playtime;
            this.etc_expense = etc_expense;
            this.profit = 0;
            this.payment = 0;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static String getComleteWord(String name, String firstValue, String secondValue) {
        char lastName = name.charAt(name.length() - 1);
        if (lastName < 0xAC00 || lastName > 0xD7A3) return name + "는"; // 한글의 제일 처음과 끝의 범위밖일 경우는 오류
        String seletedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;
        return name + seletedValue;
    }

    public static void InputData(Field field, ArrayList<Player> player) throws IOException {
        for (int i = 0; i < field.player_num; i++) {
            if (i == 0) System.out.println("\n(결제자) ");
            else System.out.println("\n(플레이어" + i + ") ");

            System.out.print("이름, 플레이 타임, 기타비용 : ");
            st = new StringTokenizer(br.readLine(), " ");
            player.add(new Player(st.nextToken(), Float.parseFloat(st.nextToken()), Integer.parseInt(st.nextToken())));

            System.out.print(player.get(i).name + "의 판 별 득실 입력 : ");
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < field.hand_no; j++) player.get(i).profit += Integer.parseInt(st.nextToken()) * field.ante;
            System.out.println("수익 : " + player.get(i).profit);
        }
    }

    public static void Calculate_Payment(Field field, ArrayList<Player> player) {
        for (int i = 0; i < field.player_num; i++) {
            player.get(i).payment = (int) (player.get(i).playtime * field.cost_per_hour)
                    + player.get(i).etc_expense + (field.beverage / field.player_num)
                    - player.get(i).profit;
        }
    }

    public static void Print_Result(Field field, ArrayList<Player> player) {
        System.out.println("\n=========정산=========");
        String str;
        for (int i = 1; i < field.player_num; i++) {
            int result = (player.get(i).payment / 100) * 100;
            str = Main.getComleteWord(player.get(i).name,"은","는") + " 결제자에게 ";
            str = (result >= 0) ? str + result + "원 지불" : str + (-1) * result + "원 받음";
            System.out.println(str);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("* 무제한일시 플레이시간 = 1, 타임비 = 기본금액 *");
        System.out.println("인원수 / 총금액 / 타임비 / 음료값합 / 쩜당 / 판수");

        st = new StringTokenizer(br.readLine(), " ");
        Field field = new Field(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                                Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        ArrayList<Player> player = new ArrayList<>();

        InputData(field, player);
        Calculate_Payment(field, player);
        Print_Result(field, player);
    }
}
/*
5 60500 2400 16500 20 3
pyeon 4.166 0
51 429 93
Ahn 4.166 0
-240 -240 314
Kang 4.166 0
267 10078 -64
Lee 4.166 0
-78 -24000 -103
SunW 1.666 0
0 14129 -240
*/
