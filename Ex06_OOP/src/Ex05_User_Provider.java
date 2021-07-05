/*
 * User 사용자 : Provider 제공자
 * 
 * class A{}
 * class B{}
 * 
 * 관계) A는 B를 사용합니다.
 * 
 * 사용방법
 * 1. 상속 A extends B
 * 2. 포함 A라는 클래스는 B를 member field로 가질 수 있다.
 *    class A { B b; }
 *  - 부분집합
 *  - 전체집합
 *  
 * --------------------------------------------------------------
 * (차와 엔진의 관계) - 컴포지션
 * 
 * class B{}
 * class A{
 *  int i;
 *  B b; // A는 B를 사용합니다.(포함)
 *  A() {
 *       b = new B()
 *       }
 * }
 * >> B라는 클래스는 독자적인 생성(x) >> A라는 객체가 만들어져서 B도 생성
 * >> A a = new A() 했을 때 , A객체도 생성되고 B객체도 생성된다. 
 *    (라이프사이클이 같다 == 전체집합)
 * 
 * --------------------------------------------------------------
 * (학생과 학교의 관계) - 어그리제이션
 * 
 * class B{}
 * class A{
 *      int i;
 *      B b; // A는 B를 사용합니다.(포함)
 *      A() {
 *      
 *      }
 *      A(B b) {
 *      this.b = b;
 *      }
 *}    
 * >> viod main()
 *  A a = new A(); 
 *  B b = new B();
 *  A a2 = new A(b);  // 부분집합관계.
 * 
 * >> A클래스와 B클래스가 같은 운명체가 아니다. 각자 생성해준다.
 * 
 * --------------------------------------------------------------
 * 
 * class B{}
 * class A{
 *      int i;
 *      A() {
 *      }   
 *      void m(B b) { // A는 B에 의존한다.(함수내부) , B타입의 멤버필드가 없다.
 *          b 객체를 가지고 작업
 *      }
 * }    
 * >> void main()
 *    B b = new B();
 *    A a = new A();
 *    어떤 상황에는 B객체가 필요하면, 함수의 파라미터로 받는다.
 *    a.m(b);   
 *      
 */

class B {
    
}
class A {
    void method(B b) {
    
    }
}

// ********중요**********(현대적인 프로그래밍 기법은 인터페이스활용)

interface Icallable{
    void m();
}

class D implements Icallable {

    @Override
    public void m() {
        System.out.println("D Icallable 인터페이스 m()의 재정의");
        
    }
    
}

class F implements Icallable {
    @Override
    public void m() {
        System.out.println("F Icallable 인터페이스 m()의 재정의");        
    }    
}

// interface POINT!!!!!!! > 유연하게 > 확장성 > 느슨한 관계

class User {
    /*
    void method(D d) {
        d.m();
    }
    void method(F f) {
        f.m();
    }
    */ //따로따로 만들지말고! 인터페이스를 통해서!
    void method(Icallable ic) {
        ic.m();
    }
}

public class Ex05_User_Provider {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.method(b); // B타입의 객체주소만 올 수 있다. // B객체를 생성하지 않으면 method 사용못함
        
        
        D d = new D();
        F f = new F();
        User user = new User();
        user.method(d);
        user.method(f); // method가 타이어 틀, 타이어 틀에 다른종류의 타이어(d,f)를 끼려면 타이어틀을 인터페이스로 구현하자!(같은 규격)
        
    }

}
