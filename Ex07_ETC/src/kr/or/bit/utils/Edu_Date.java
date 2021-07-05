package kr.or.bit.utils;

import java.util.Calendar;

// 날짜의 형식을 제공하는 설계도
// 많이 사용할 것 같으면 편하게 사용하도록 >> new(x) >> static 함수로 만들자 >> 하나의 이름으로 overloading
 

public class Edu_Date {
    
    public static String DateString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" +
              (date.get(Calendar.MONTH)+1) + "월" + 
               date.get(Calendar.DATE) + "일";        
    }
    
    public static String DateString(Calendar date, String opr) {
        return date.get(Calendar.YEAR) + opr +
              (date.get(Calendar.MONTH)+1) + opr +
               date.get(Calendar.DATE);        
    }
    
    // 요구사항 1~9월까지 2자리로 맞춰주세요. 01월 , 02월 ...
    // 11, 12월은 그대로 출력.
    // 2021년 02월 17일
    
    public static String monthFormat_DateString(Calendar date) {
        String month = "";
        if((date.get(Calendar.MONTH) +1 < 10)) {
            month = "0" + (date.get(Calendar.MONTH)+1);
        }else {
            month = String.valueOf((date.get(Calendar.MONTH)+1)); // String.valueOf(정수) -> 문자열변환
        }
        
        return date.get(Calendar.YEAR) + "년" +
               month + "월" +
               date.get(Calendar.DATE);  
               }
}
