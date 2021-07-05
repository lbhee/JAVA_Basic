/*
 * OOP
 * 1. 상속
 * 2. 캡슐화
 * 3. 다형성
 * 
 * <상속>
 * java : child extends Base
 * c#   : child : Base
 * 
 * 1. 특징
 *   - 다중 상속은 불가 (단, Interface만 가능)
 *   - 단일 상속은 가능(계층적 상속 -> 여러개의 클래스를 상속받을 수 있음)
 * 2. 의미
 *   - 재사용성 (설계에 초기 비용이 많이 들어감)
 * 3. 상속관계
 *   - GrandFather  >>  Father  >>  Child (상속관계)
 *     Child child = new Child()로 객체를 생성하면 
 *     할아버지, 아버지, 나 순서로 heap메모리에 올라간다. * 
 */

class GrandFather { // extends Object 생략되어 있는것!
    public GrandFather() {
        System.out.println("GrandFather");
    } // 메모리에 올라가는 순서를 보기위해 default constructor만들어보자.
    public int gmoney = 5000;
    private int pmoney = 1000;
    // private는 객체, 상속관계에서 접근 불가!
    
    // public void call() {
    //     System.out.println(pmoney);
    // }  
    // 같은 클래스에서는 접근자가 상관없으므로 pmoeny 사용가능!
}

class Father extends GrandFather {
    public Father() {
        System.out.println("Father");
    }
    public int fmoney = 3000;
}

class Child extends Father {
    public Child() {
        System.out.println("Child");
    }
    public int cmoney = 1000;
}

// 사용자가 만드는 모든 클래스는
// 눈에 보이진 않지만 
// class Car extends Object가 생략되어 있다.
class Car {
    
}
// 사용자가 만드는 모든 클래스는 default로 Object(최상위) 클래스를 상속한다.
// object 가장 추상화, 가장 일반화 ..
// object가 가지는 자원 : 모든 클래스가 공통으로 사용하는 것들(주소확인, 공통함수..)

// 상속관계에서는 제일 최상위인 Base 클래스가 Object를 상속한다!
// class GrandFather extends Object {} 가 생략된 것이다.
// 컴파일러가 알아서 처리해주니까.

public class Ex01_Inherit {
    public static void main(String[] args) {
        
        Child child = new Child();
        System.out.println(child.gmoney);
        System.out.println(child.fmoney);
        System.out.println(child.cmoney);
        // child.pmoney 접근불가
        // child.call(); pmoney 우회적 사용가능
        Car car = new Car();
        // car. object안에 있는 기능 사용가능
    
    }

}
