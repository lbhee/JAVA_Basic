// 변수 <-> 상수
// 상수 : 한번 값이 초기화(최초값의 할당)되면 변경 불가
// 상수자원 : 고유값(주민번호) , 수학(PI=3.141592) , 컴퓨터(버전번호, 시스템관리번호)
// 상수는 관용적으로 대문자로 쓴다.

// java : final int NUM = 10;
// c#   : const integer NUM = 10;

// final 키워드
// final class Car{} >> 마지막 클래스. 확장하지마. 상속금지! (final Math)
// public final void print() {} >> 마지막 함수. 상속관계에서 재정의하지마! (@Override 금지)
// public static final void print() {} >> 객체간 공유자원(한번 정해지면 바꾸지 말아야할 공유자원)

class Vcard {
    final String KIND = "heart";
    final int NUM = 10;
    void method() {
        System.out.println(Math.PI);
    }
}

class Vcard2{
    final String KIND;
    final int NUM;  
    
    Vcard2() { // 상수를 쓰려면 초기화가 무조건 되도록 해주어야 한다.
        this.KIND = "heart";
        this.NUM = 10;
    }
    
   Vcard2(String kind, int num) { // 초기화가 무조건 될 수 밖에 없게 작성해야한다.
       this.KIND = kind;
       this.NUM = num;               
   }

    @Override
    public String toString() {
        return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
    }

}

public class Ex07_Final {
    public static void main(String[] args) {
        Vcard vcard = new Vcard();
        System.out.println(vcard.KIND);
        vcard.method();
        
        Vcard2 vcard2 = new Vcard2();
        System.out.println(vcard2);
        
        Vcard2 vcard3 = new Vcard2("spade",10);
        System.out.println(vcard3);
        
    }

}
