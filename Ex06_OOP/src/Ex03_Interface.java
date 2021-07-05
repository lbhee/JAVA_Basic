/*
 * 추상클래스 : 인터페이스
 * 
 * 인터페이스 : 표준, 약속, 규약, 규칙을 만드는 행위
 * 
 * [추상클래스와 인터페이스 공통점]
 * >> 스스로 객체 생성이 불가능(new 연산자를 통한 객체 생성 불가능)
 * 
 * [추상클래스와 인터페이스 차이점]
 * >> 추상클래스는 완성함수(일반함수) + 미완성함수
 * >> 인터페이스는 모든것이 미완성(추상자원)
 * 
 * 1. 사용
 * 추상클래스 extends
 * 인터페이스 implements (반드시 구현)
 * class Car extends abclass {}
 * class Car implements la{} -> la가 가지고 있는 모든 추상자원을 구현해라(재정의)
 * 
 * 2. 특징
 * 인터페이스는 다중상속이 가능하다!(다중구현) -> 약속(작은단위로 여러개) - 여러개 작은약속을 필요에 따라 가져가서 큰약속으로
 * class Test extends Object implements Ia, Ib, Ic
 * 약속을 크게 만들면 사용성이 떨어진다. 특수한 것에 한정되어 버리기 때문에.
 * 
 * 추상클래스는 단일 상속이 원칙이다.(계층적 상속)
 * 
 * 추상클래스는 완성 + 미완성
 * 
 * 인터페이스는 상수를 제외한 나머지는 미완성(추상)자원
 * 
 * 인터페이스는 소프트웨어 설계의 최상위 단계 (경험이 많이 필요..)
 * 
 * [초급개발자..]
 * 1. 인터페이스를 다형성으로 보자. (인터페이스는 부모타입이다)
 * 2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능이다. (같은 인터페이스를 구현함으로서 같은 부모를 가진다)
 * 3. JAVA API가 이미 사용할 수 있는 수많은 인터페이스를 만들어 놓았다. (가져다 쓰는 것만해도 된다)
 * 4. 인터페이스(관욕적 표현) : ~able -> ~할 수 있는 (수리할 수 있는, 날 수 있는) -> Cloneable (앞글자대문자+able)
 * 5. 객체간 연결고리(객체간 소통) >> 다형성 >> 같은 부모
 * 
 */


/*
interface Iable {
    String print();
    // 출력할 때 print 함수 사용해라. return타입은 문자열이다.
}

class Test implements Iable {
    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }    
}
*/

// 설계표준 >> 구현강제 >> 재정의
/*
 * 1. 실제 구현부를 가지고 있지 않다. : 실행블럭이 없는 함수 : void run();
 * 게임설계이동 move(int x, int y)를 인터페이스 >> 탱크 , 마린 >> move 강제구현
 * >> JAVA API : Collection (동적배열 == 자료구조) >> Vector, *ArrayList*, HashSet, *HashMap*
 * >> Vector, *ArrayList*, HashSet, *HashMap* 이런 것들은 수많은 인터페이스를 구현하고 있다.
 * 
 * 
 * 2. 생성방법
 * public static final int VERSION = 1; >> int VERSION = 1; 이라고만 쓰면 컴파일러가 알아서 해줌. 
 * 
 * public abstract void run(); >> 여기도 (public abstract)생략가능 >> void run();만 써줌.
 * 
 * interface Iable {
 *     int VERSION = 1;
 *     void run();
 *     String move(int x, int y);
 * }
 * 
 * interface Iable {}
 * interface Bable {int NUM = 0}
 * interface Cable {void run(); void move();}
 * 
 * class Test extends Object implement Iable, Balbe, Calbe
 */

interface Humanable {
    int AGE = 100;
    String GENDER = "남"; // 앞에 public static final이 생략된거니까 무조건 초기화.
    
    String print();
    void message(String str);
}

interface Iable {
    int AGE = 10;
    void info();
    String val(String s);
}

class Test extends Object implements Humanable, Iable {

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }

}
public class Ex03_Interface {
    public static void main(String[] args) {
        Test t = new Test();
        Humanable h = t; // 부모는 자식객체의 주소를 가질 수 있다.
        System.out.println(h.AGE);
        
        Iable ia = t;
        System.out.println(ia.AGE);
    }

}
