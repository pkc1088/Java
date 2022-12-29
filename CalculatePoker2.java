import java.io.*;
import java.util.*;

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
                Double joiner_played_time = Double.parseDouble(st.nextToken());
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
                System.out.println("player"+i+"는 결제자로부터 "+players.get(i)+" 받음");
            } else {
                System.out.println("player"+i+"는 결제자에게 "+(-1) * players.get(i)+" 지불");
            }
        }

    }
}
