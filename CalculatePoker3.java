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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Player> player = new ArrayList<>();

        System.out.println("* 무제한일시 플레이시간 = 1, 타임비 = 기본금액 *");
        System.out.println("인원수 / 총금액 / 타임비 / 음료값합 / 쩜당 / 판수");
        st = new StringTokenizer(br.readLine(), " ");
        Field field = new Field(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                                Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

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

        for (int i = 0; i < field.player_num; i++) {
            player.get(i).payment = (int) (player.get(i).playtime * field.cost_per_hour)
                                         + player.get(i).etc_expense + (field.beverage / field.player_num)
                                         - player.get(i).profit;
        }

        System.out.println("\n=========정산=========");
        String str = "";
        for (int i = 1; i < field.player_num; i++) {
            int result = (player.get(i).payment / 100) * 100;
            str = player.get(i).name + "은 결제자에게 ";
            str = (result >= 0) ? str + result + "원 지불" : str + (-1) * result + "원 받음";
            System.out.println(str);
        }
    }
}
/*
5 60500 2400 16500 20 3
pyeon 4.166 0
51 429 93
Ahn 4.166 0
-240 -240 314
Kang 4.166 0
267 -78 -64
Lee 4.166 0
-78 -240 -103
SunW 1.666 0
0 129 -240
 */

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

/*
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("모드 ( 1 : 개입자 부재, 2 : 시간제 & 개입자 존재 )");
        System.out.println("모드, 플레이어 수, 판 수, 총 금액, 쩜당, 기타 인원 입력");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Double> players = null;
        int mode = Integer.parseInt(st.nextToken());
        int player_num = Integer.parseInt(st.nextToken());
        int hand_num = Integer.parseInt(st.nextToken());
        double total_pay = Double.parseDouble(st.nextToken());
        int ratio = Integer.parseInt(st.nextToken());
        int etc_num = Integer.parseInt(st.nextToken());
        double beverage, money_per_hour, total_play_time;
        boolean passed = false;

        if(mode == 1)
            players = new ArrayList<Double>(Collections.nCopies(player_num, (-1) * total_pay / player_num));

        if(mode == 2) {
            System.out.println("\n음료평균값, 시간 당 금액, 총 플레이한 시간");
            st = new StringTokenizer(br.readLine(), " ");
            beverage = Double.parseDouble(st.nextToken());
            money_per_hour = Double.parseDouble(st.nextToken());
            total_play_time = Double.parseDouble(st.nextToken());
            players = new ArrayList<Double>(Collections.nCopies(player_num, (-1) * (money_per_hour * total_play_time + beverage)));

            System.out.println("\n중간 개입자 인원수");
            int join_num = Integer.parseInt(br.readLine());

            System.out.println("\n중간 개입자와 플레이한 시간 입력");
            for (int i = 0; i < join_num; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int joiner_num = Integer.parseInt(st.nextToken());
                double joiner_played_time = Double.parseDouble(st.nextToken());
                players.set(joiner_num, players.get(joiner_num) + (total_play_time - joiner_played_time) * money_per_hour);
            }
        }

        while(etc_num-- > 0) {
            if(!passed) System.out.println("\n기타 비용 사용한 특정 플레이어와 금액 입력");
            passed = true;

            st = new StringTokenizer(br.readLine(), " ");
            int etc_player_num = Integer.parseInt(st.nextToken());
            int etc_money = Integer.parseInt(st.nextToken());
            total_pay -= etc_money;
            players.set(etc_player_num, players.get(etc_player_num) - etc_money);
        }

        System.out.println("\n핸드별 득실 입력");
        for (int i = 0; i < player_num; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < hand_num; j++) sum += Integer.parseInt(st.nextToken());
            System.out.println("= " + sum);
            players.set(i, players.get(i) + sum * ratio);
        }

        System.out.println("\n기타비용 제외한 결제자 player0의 결제금액 : " + total_pay);
        for (int i = 0; i < player_num; i++) {
            System.out.println("player"+i+"의 총득실 : " + players.get(i));
        }

        System.out.println("\n==========정산==========");
        for (int i = 1; i < player_num; i++) {
            if(players.get(i) > 0) {
                System.out.println("player"+i+"는 결제자로부터 "+ ((int) Math.round(players.get(i)) / 100) * 100 +" 받음");
            } else {
                System.out.println("player"+i+"는 결제자에게 "+(-1) * ((int) Math.round(players.get(i)) / 100) * 100 +" 지불");
            }
        }

    }
}
 */

/*
2 5 3 60500 20 0
3300 2400 4.166
1
4 1.666
51 429 93
-240 -240 314
267 -78 -64
-78 -240 -103
0 129 -240
*/
