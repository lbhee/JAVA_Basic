/*
 * String은 클래스이다. >> 클래스는 new를 통해서 사용가능 >> 일반적인 값 타입처럼 사용해도 문제가 없다.
 * String이 가지고 있는 수 많은 함수. (문자열을 조작[힙치고, 자르고, 붙이고]하는 것이 필요)
 * String이 가지는 다양한 함수 활용 >> static함수(String. ) , 일반함수(new를 통해서 쓰는)
 * 최소 15개 ~ 20개 함수 암기
 * 
 * 
 */
public class Ex05_String_Class {

    public static void main(String[] args) {
        String str = "";
        System.out.println(">" + str + "<");
        // 사용방법 : int, double과 같이 사용
        
        String[] strarr = {"aaa", "bbb", "ccc"};
        for(String s : strarr) {
            System.out.println(s);
        }
        
        ///////////////////////지금까지///////////////////////
        
        String str2 = "홍길동";
        System.out.println(str2.length()); // 왜 String에 배열길이가 적용될까?
        System.out.println(str2.toString()); // Object의 toString()을 재정의
        System.out.println(str2); // toString() 생략
        
        String str3 = new String("김유신");
        
        // 1. String name = "가나다라마";
        // String 클래스의 내부적으로 저장되는 자료구조 -> char[] >> [가][나][다][라][마]
        // class String extends Object {char[] value.... toString() ..length()}
        
        String str4 = "AAA";
        String str5 = "AAA";
        System.out.println(str4);
        System.out.println(str5.toString());
        System.out.println(str4 == str5);
        // ==연산자는 값을 비교하는 것. str4주소값, str5주소값
        // 같은주소
        // 주소가 아니라 가지고 있는 값을 비교(문자열)
        // String 비교 == 바보....왜?
        System.out.println(str4.equals(str5));
        
        String str6 = new String("BBB");
        String str7 = new String("BBB");
        System.out.println(str6 == str7);
        // String만들때 new 사용하면 강제적으로 메모리 할당
        System.out.println(str6.equals(str7));
           
               
        // 문자열비교는 equals 사용!!!!!!!!!!!!!!!
        
        // 넌센스~
        String s = "A";
        s += "B";
        s += "C";
        System.out.println(s);
        s = "A";
        // 질문(성능에 관한)
        // String에 1000개의 문자를 누적해라.
        // 메모리를 잡아먹기 때문에 성능상 안좋음!!
        
        // 따라서 누적데이터는 이것을 사용!
        // StringBuffer
        // StringBuilder
        
    }

}
