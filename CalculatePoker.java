import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("플레이어 수, 판 수, 총 금액, 쩜당, 기타 입력");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int player_num = Integer.parseInt(st.nextToken());
        int hand_num = Integer.parseInt(st.nextToken());
        int total_pay = Integer.parseInt(st.nextToken());
        int ratio = Integer.parseInt(st.nextToken());
        int etc_num = Integer.parseInt(st.nextToken());
        boolean passed = false;

        ArrayList<Integer> players = new ArrayList<Integer>(Collections.nCopies(player_num, 0));

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
            players.set(i, players.get(i) + sum * ratio - total_pay / player_num);
        }

        System.out.println("\n기타비용 제외한 결제자 player0의 결제금액 : " + total_pay);
        for (int i = 0; i < player_num; i++) {
            System.out.println("player"+i+"의 총득실 : " + players.get(i));
        }

        System.out.println("\n==========영수증==========");
        for (int i = 1; i < player_num; i++) {
            if(players.get(i) > 0) {
                System.out.println("player"+i+"는 결제자로부터 "+players.get(i)+" 받음");
            } else {
                System.out.println("player"+i+"는 결제자에게 "+(-1) * players.get(i)+" 지불");
            }
        }

    }
}   
