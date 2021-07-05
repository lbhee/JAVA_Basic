/*
 * 생성자 함수(constructor)
 * 
 * 1. 함수(특수한 목적을 가진)
 * 2. 특수한 목적이란? (member field의 초기화)
 * 
 * 같은목적>> {초기자 함수} , static{초기자 함수}              
 * 
 * 3. 일반함수(public void m(), public String m(String s), ..)와 다른점?
 *    - 함수의 이름이 고정되어 있다.(class와 동일)
 *    - 실행시점 : 객체가 생성(new)되었을 때 heap에 공간이 할당되고 
 *               member field가 자리를 잡는다. 그 후에 생성자 함수가 자동호출 된다.
 *    - 실행시점에 아무것도 없기 때문에 return타입이 없다. >> 생성자 함수는 무조건 void이다. 
 *      >> void 생략! >> public 클래스이름
 * 4. 목적 : 생성되는 객체마다 [강제적으로] member field 값을 초기화 할 수 있다.
 * 
 * 
 * 
 * <요구사항>
 *  자동차는 무조건 색상하나를 가져야 한다.      
 * class Car{
 *      String color; // 여기에 ="red"라고 하면 각각 다른 색상을 가질 수 없다.
 * }
 * 
 *  Car car = new Car(); // 이것만 입력해도 자동차가 생성되어서 무조건 색상을 가지지 않는다.
 *  
 *  따라서
 *  
 *  class Car{
 *      public Car(String color){
 *      
 *      }
 * }
 * 
 * Car car = new Car("red"); // 생성자함수를 호출!
 * 
 * 5. 생성자함수도 method overloading 가능!
 * 
 * 6. [예외] 만약 overloading 생성자 함수를 하나라도 구현했다면 
 *    default 생성자함수는 반드시 구현을 통해서만 사용가능하다.(자동생성x)
 *          
 */

// 당신이 만약 자동차를 만든다면 !반드시! 자동차에 이름을 부여하세요.

class Car{
    String carname = "포니";
    // 보이지 않지만 default로 생성자함수가 생략되어 있는 것
    // 컴파일러가 알아서 생성하기 때문에
    // public Car() {}
    // 그래서 new Car()라고 괄호를 쓴 것이다!
    
    public Car() {
        System.out.println("나 생성자야.. 강제구현");
    }
}

// 이렇게 사용!
class Car2{
    String carname;
    public Car2() { // default constructor
        carname = "포니"; // 초기화
    }
}

// 이렇게 사용!
class Car3{
    String carname;
    public Car3() {
        carname = "포니";
    }
    public Car3(String name) { // overloading constructor
        carname = name;
    }
}

class Car4{
    String carname;
    // default 생성자를 구현하지 않았다.
    // default를 구현하지 않은 설계자의 의도는?
    // 무조건 자동차이름을 넣기를 원한 것.(강제적 구현)
    // [예외적으로 overloading] 생성자를 구현했다면 default는 자동으로 생성되지 않는다!
    public Car4(String name) {
        carname = name;
    }
}

public class Ex16_Constructor {
    public static void main(String[] args) {
        Car car = new Car(); // 이 ()는 생성자를 호출하는 괄호였다!
        
        Car3 car3 = new Car3(); // default constructor 자동호출
        System.out.println(car3.carname);
        
        Car3 car4 = new Car3("지네시스"); // overloading constructor
        System.out.println(car4.carname);
       
        Car4 car5 = new Car4("포드");
        System.out.println(car5.carname);
        
        Car4 car6 = new Car4("벤트");
        System.out.println(car6.carname);
    }

}
