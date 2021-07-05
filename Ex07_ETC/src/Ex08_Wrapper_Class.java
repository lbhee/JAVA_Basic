import java.util.ArrayList;

/*
 * 자바가 가지고 있는 8가지 기본타입(값 타입) : JAVA API 제공
 * 
 * 8가지 기본 타입에 대해서 설계도를 생성 >> 8가지 기본타입도 객체형태로 사용가능 >> wrapper class
 * 
 * 갑 타입대신에 객체형태의 타입을 쓰는 곳 -> generic (참조형태의 parameter만 사용가능, 값타입은 못쓴다.)
 * 1. 매개변수로 객체타입이 요구될 때
 * 2. 기본형 값이 아닌 객체 형태로 저장되길 원할 때
 * 3. 객체간 값 비교를 할 때
 * 4. 타입 변환시 비교할 때
 * 
 */
public class Ex08_Wrapper_Class {
    public static void main(String[] args) {
        int i = 100;
        
        Integer n = new Integer(100); //  is deprecated -> 추후버전에서는 사라짐..
        System.out.println(n); // 사실은 n은 주소값이 출력되어야 하지만, toString() 재정의되어있어서 값이 나옴.
        System.out.println(n.MAX_VALUE);
        System.out.println(n.MIN_VALUE);
        
        // POINT !
        // Integer -> 함수의 parameter로 사용
        // 제너릭은 파라미터로 값타입을 바로쓸 수 없게 되어있다. wrapper class로 사용 
        // char -> Character
        // int -> Integer
        // 나머지는 앞글자만 대문자로        
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(100);
        // li.add("A"); 에러! integer로 지정해주었기 때문에 int값만 사용가능.
        for(int value : li) {
            System.out.println(value);
        }
        
    }

}
