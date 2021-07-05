import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// https://cafe.naver.com/bit2021/282

public class Ex10_Format_Date {
    public static void main(String[] args) {
        Date curdate = new Date();
        Calendar cal = Calendar.getInstance();
        
        System.out.println("date : " + curdate); //날짜 형식  >> format 
        System.out.println("cal : " + cal); //문자열 결합
        System.out.println("cal getTime()  함수 : " + cal.getTime()); // getTime >> format
        
        // 캘린더에서 데이트처럼 날짜형식을 반환받으려면 getTime을 사용한다.
        
        // *****중요(간단하게 내가 만든 형식으로 날짜 출력)*****
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
        System.out.println(dateformat.format(curdate)); // format함수는 파라메타로 Date형식만 받는다.
        System.out.println(dateformat.format(cal.getTime()));
        
        
        //문자열 >> 날짜 형식으로 변환 
        String StringDate = "202008261212";
        try {
                        Date stringdate =  dateformat.parse(StringDate);
                        System.out.println("stringdate : " + stringdate);
                        
                        long datelong =  stringdate.getTime();
                        System.out.println(datelong);
        } catch (ParseException e) {
                    e.printStackTrace();
        }
    
        // format클래스
        double money = 123456.5678;
        DecimalFormat df = new DecimalFormat("0.0"); // 빈자리를 0으로 채움
        System.out.println(df.format(money)); // 123456.6

        DecimalFormat df2 = new DecimalFormat("0");
        System.out.println(df2.format(money)); // 123457
 
        DecimalFormat df3 = new DecimalFormat("0.000"); // 반올림 처리 확인
        System.out.println(df3.format(money)); // 123456.568

        DecimalFormat df4 = new DecimalFormat("-#.#"); // 빈자리를 채우지 않음
        System.out.println(df4.format(money)); // -123456.6

        DecimalFormat df5 = new DecimalFormat("#%"); // 12345657%
        System.out.println(df5.format(money));

        
        Date today = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-----MM/dd");
        System.out.println(s.format(today));

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy년 MMM dd일 E요일");
        System.out.println(s2.format(today));

        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println(s3.format(today));

        //혼용
        Calendar c = Calendar.getInstance();
        Date d = c.getTime(); // Calendar 형식을 Date 형식에
        System.out.println(s3.format(d));
        
    }

}






