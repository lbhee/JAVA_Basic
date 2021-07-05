// static 변수 -> 모든 객체가 [같은 값]을 가지게 할거야
// instance 변수 -> 모든 객체가 [다른 값]을 가지게 할거야

class InitTest{
    static int cv = 10; // 값 초기화만 가능~
    static int cv2;    
    int iv = 11;
    
    // static블럭(static 초기자 설정 블럭)
    // member field에서 초기화를 하는 것과 다른점?
    static { 
        cv = 10; // static멤버필드의 초기값을 할당하는데,
        cv2 = cv+222; // 변형된(조작된) 값도 가능하다는 것!     
    }
    
    // instance variable 초기화 블럭
    // new를 통해서 객체가 생성되고 메모리에 int iv변수가 메모리에 올라가고 나서 바로 호출되는 함수
    {
        System.out.println("초기자 블럭");
        if(iv > 10) iv = 100; // 제어문,조건문 사용가능!
        //단일 if문은 중괄호 생략가능!
    }
    
    
}
public class Ex08_Static_Init {
    public static void main(String[] args) {
        System.out.println(InitTest.cv); // 객체를 만들지 않았으니까 클래스이름으로 접근!
        System.out.println(InitTest.cv2);
        
        // 일반자원
        InitTest inittest = new InitTest();
        System.out.println(inittest.iv);
     }

}
