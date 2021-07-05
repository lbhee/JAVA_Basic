package kr.or.bit;
//Tip) java를 하면 c#을 할 수 있다. >> Main()

// --------------------------------------

// class == 설계도 == Type(사용자 정의 타입)
// 사원이라는 설계도
// 사원을 표현 (사번, 이름, 직종 ......)

public class Emp {
    
    // 정보를 담을 수 있는 변수
    // 사원은 사번을 가지고 있다. (사번은 숫자)
    // 변수 > 정보 (고유, 상태, 부품) 담을 수 있는 공간의 이름 >> instance variable >> member field 
    // 변수의 종류(scope : 유효범위) : 선언되는 위치
    //  1. local variable (지역변수 : 함수 안)
    //     class Person {public void run() {int speed;}}    
    //  1-1. block variable (함수안에 if, while, for블럭 안에 들어가는 변수)
    //  2. instance variable ( -> class Person{ public int age; }
    //  3. static variable : 공유자원(객체간) 
    
    // 클레스의 종류
    //  1. class Test{ } >> main함수가 없어서 독자적인 실행이 불가능 >> 다른 클래스를 도와주는 클래스(타입) >> lib(라이브러리)
    //  2. class Test{public static void main(String[] args{}} >> 독자적인 실행이 가능한 클래스
    //  2-1. 함수의 이름(main) >> 약속 >> 시작점(진입점)
    
    //  함수란 (최소의 기능[행위] 단위) 
    
    // 캡슐화 : 직접할당을 막고 간접할당을 통해서 자원을 보호(데이터를 제어)하는 것.
    // 멤버필드 앞에 private를 붙여서 만든다.
    // 클래스 내부에서는 private와 public이 차이가 없지만,
    // 다른 클래스에서 볼 수 있냐 없냐의 차이가 있다.
    
    private int empno;
    private String ename;
    private String job;
    
    public int number;
    
    
    // 간접할당 (누군가를 통해서 전달, 누군가를 통해서 받겠다.) 
    private int num;           
    public void setNum(int n) { //setter 기능함수(write 전용함수)
        if(n > 0) {
            num = n;
        }else {
            num = 0;
        }        
    }    
    public int getNum() { // getter 기능함수(read 전용함수)
        return num;
    }
    // num변수를 불러올 클래스의 setNum값에 -100을 넣으면 
    // n이 -100이 되므로 -100은 0보다 크지 않기때문에  num = 0 나온다.
    // 0을 getNum이 받아서 result 변수에 할당하고 출력한다.
    
    
    // 간접할당은 자동완성도 가능하다. 
    // 오른쪽마우스 -> source -> getter and setter
    public String getEname() {
        return ename + "님"; //이름마다 "님"을 함께 출력하기 위해!
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    // ---------------------------------------------------------------------------
    
    // 출력위치 
    public void print() {
        int number = 0;
        System.out.println(number);
     // int i = 0; -> local variable
        for(int i = 0; i < 10; i++) {
            // block variable
        }
        // System.out.println(i); 
        // i는 block variable이기 때문에 에러
        // local variable로 선언하거나 .. 등등
    }
    
}