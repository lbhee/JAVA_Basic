import kr.or.bit.common.Car;

/* 클래스 == 설계도 == 데이터타입(사용자정의)
 * 
 * 클래스 구성요소 : [필드 + 함수(기능)] + 생성자 함수
 * field -> 고유데이터, 상태데이터, 부품데이터(참조) 정보 저장 >> 변수
 * function(함수) -> 기능과 행위를 정의 >> 최소단위로(1개의 기능 구현)
 * 추가적으로 생성자함수(목적이 명확한) >> member field 초기화 목적
 * 
 * 클래스 , 필드, 함수, 생성자 -> 어느 곳에 위치하느냐? 영역(scope) >> 접근자, 한정자, 수정자를 앞에 붙인다. 
 * >> public, private, default, protected(상속에서 사용)
 * 
 * 1. public class Car{}  >> kr.or.bit.common 폴더 아래 위치
 * 2. class AirPlane{} >> default 생략 >> 컴파일러가 자동으로 default가 있는 것 처럼 관리
 *    >> default는 같은 패키지에서만 접근가능, 다른패키지에 있으면 서로 접근 불가 (현업X, 연습목적)
 * 3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다. 
 *    Ex01_main.java >> 여러개의 클래스 >> 단, Ex01_main 클래스만 public을 가질 때!(나머지는 다 dafualt)
 *      
 */


// 이렇게 연습!
class Test { // default 접근제한자
   int data; // default 접근제한자
}


class Test2 { // default class Test
    int data2; // 일반적으론 이렇게!
    
    public int data3; //변수 앞에 아무리 public을 써도 의미가 없음. 이미 클래스가 default인데 public을 붙여봤자.
    
    private int data4; // 연습하려고 private썼으면 getter, setter 함수도 써야지.
    void setData4(int d) {
        data4 = d;
    }
    int getData4() {
        return data4;
    }
}
//


public class Ex01_main {

    public static void main(String[] args) {
        
        Car car = new Car(); //public이기 때문에 가능
        
        // car.door = 100; 
        // car에서 door을 찾을 수 없다. door은 default이기 때문에.
        
        car.window = 100; // public이기 때문에 가능하다!
        
        
        // car.handle = 100; 
        // private이기 때문에 직접할당이 안됨. setter와 getter를 써야 사용가능하다!
                
        // AirPlane air = new AirPlane();
        // AirPlane은 접근제한자가 default이기때문에 사용X
        
        Test test = new Test(); //같은 패키지 안에 같은폴더안에 있으니 당연히 사용가능!
        test.data = 100;
        System.out.println(test.data);
        
        Test2 test2 = new Test2();
        test2.data2 = 1;
        test2.data3 = 2;
        test2.setData4(3);
        System.out.println(test2.getData4());
        
       
    }

}
