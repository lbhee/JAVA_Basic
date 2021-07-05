/*
 * OOP(객체지향프로그래밍) >> 설계도 만들기
 * 1. 상속(재사용성)
 * 2. 캡슐화(은닉화) : private(간접할당) -> getter, setter
 * 3. 다형성(하나의 타입으로 여러개의 객체주소를 갖는 것)
 * 
 * >> method overloading
 *    : 하나의 이름으로 여러가지 기능을 하는 함수
 *    System.out.println() >> println() 이름은 1개 기능은 여러개
 *  
 *  class out{
 *      public void println() {}
 *      public void println(int i) {}
 *      public void println(String s) {}
 *      
 *  - 성능향상 상관은 없다.
 *  - 설계자가 개발자의 편리성을 위해서 제공한 것.
 *  
 *  문법) 함수의 이름은 같고 parameter[개수]와 [타입]을 다르게 만들면 overloading 인정한다.
 *   1. 함수의 이름은 같아야 한다.
 *   2. parameter의 개수 또는 타입은 달라야 한다.
 *   3. return type은 오버로딩의 판단기준이 아니다.
 *   4. parameter의 순서가 다름을 인정한다.
 *   
 */
class Human2{
    String name;
    int age;
}

class OverTest{
    int add(int i) {
        return 100 + i;
    }
    
    // 오버로딩 -> 개수가 다름을 인정
    int add(int i, int j) {
        return i + j;
    }
    
    // 충돌! -> 정수 한개를 받는건 이미 있음.
    // String add(int j) {
    //     return "";
    // }
    
    // 오버로딩 기법 인정 -> 타입이 다름을 인정
    String add(String s) {
        return "hello" + s;
    }
    
    // 오버로딩 -> 타입과 개수가 다름을 인정
    String add(String s, int i) {
        return null;
    }
    
    // 오버로딩 -> 순서가 다름을 인정
    String add(int i, String s) {
        return null;
    }
    
    // 오버로딩 -> 타입이 다름을 인정
    void add(Human2 human) {
        human.name = "홍길동";
        human.age = 100;
        System.out.println(human.name + "," + human.age);
    }
}    
    // 충돌! -> Human2타입을 한개 받는건 이미 있음.
    // Human2 add(Human2 h) {} 
    
    

public class Ex14_Method_Overloading {
    public static void main(String[] args) {
        OverTest ot = new OverTest();
        ot.add(100);
        ot.add(100, 200);
        
        ot.add(new Human2());
        
        String result = ot.add("방가방가");
        System.out.println(result);
        
    }

}
