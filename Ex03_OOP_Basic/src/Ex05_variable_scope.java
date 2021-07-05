/*
 * 변수가 클래스 내부에 위치하면 : instance variable (member field) -> default값이 있다.
 * 변수가 함수(method)안에 위치하면 : local variable -> 반드시 초기화를 해야한다.
 * 메인함수 main(String[] args) 안에 모든 변수는 사용기 초기화해야한다.
 * 
 * static variable -> 공유자원(객체간) : 객체생성 이전에 memory에 올라가는 자원
 * (class area 또는 method area)
 * 
 * javac Ex05_variable_scope.java (컴파일)
 * java Ex05-verialbe_soppe (실행)
 * 
 * Ex05_variable_scope 정보 >> method(class) area
 * 그때 클래스 static 자원이 있다면 그 자원을 memory road
 * 
 * 
 */

class Variable{
    int iv; // member field, instance variable
    
    void method() {
        int lv = 0; // local variable 반드시 초기화
        
        // for(int i = 0; .... block variable for안에서만 유효함)
    }
    
    static int cv;
    // 1. class variable(클래스 변수) 또는 static variable(객체간 공유자원)이라고 부른다.
    // 2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
    // heap영역에 생성된 [객체]들의 [공유자원]
    // 3. 특징 : 접근방법
    // 3.1 class 이름.static 변수명 -> Variable.cv (객체가 생성되기 전에도 접근이 가능해야하므로 클래스 이름으로!)
    // 3.2 Variable v = new Variable(); -> v.cv
    //     Variable v2 = new Variable(); -> v2.cv
    //     v.cv == v2.cv 같은 주소의 메모리이다.
    // 4. 생성시점 : Hello.java > javac Hello.java > Hello.class > java.exe Hello 엔터 실행..
    // > class loader System에 의해서
    //   클래스를 정보(metadata: 설명)를 class area(method area)에 올린다.
    //   --이 클래스 언제 만들었고, 어떤 자원을 import하고, 변수가 몇개있는지..기술..
    //   --이 클래스 안에 static variable 또는 static method 있으면
    //   --이 녀석을 memory(class area)에 올려 놓는다.
    
    // 클래스가 로딩될 대 생성되고 프로그램이 종료될 때 소멸한다.
}
public class Ex05_variable_scope {
   
    public static void main(String[] args) {
        // System.out.println(Variable.cv);
        
        Variable v = new Variable();
        Variable v2 = new Variable();
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv);
    }

}
