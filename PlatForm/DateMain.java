import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.Locale;

public class DateMain {
    public static void main(String[] args) {
        Date curD = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
        String str1 = sdf.format(curD);
        System.out.println(str1);

        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
        String str2 = sdf.format(curD);
        System.out.println(str2);

        sdf = new SimpleDateFormat("W", Locale.KOREA);
        String str3 = sdf.format(curD);
        sdf = new SimpleDateFormat("E", Locale.KOREA);
        String dday = sdf.format(curD);
        System.out.println("오늘은 이 달의 "+str3+"번째 "+dday+"요일 입니다.");
    }
}
