package kr.or.bit;
/*
 * 클래스 구성요소 (필드+함수)
 * 
 * 함수의 기능(행위) 만드는 방법
 * 함수(funtion, method)
 * method : 행위 또는 기능을 정의하는 것 (최소단위-하나의 함수는 하나의 기능만 구현한다.)
 * ex) 먹는다O, 잔다0, 걷는다O, 걸으면서 먹는다X
 * 함수는 호출에 의해서만 동작(누군가 그의 이름을 불러주어야 한다. '콜백함수'제외)
 * 
 * JAVA에서 함수를 만드는 문법
 * 1. void, parameter(x)    >> void print() {실행코드} : 받지않고 돌려주지도 않을거야
 * 2. void, parameter(o)    >> void print(String str) {실행코드}  : 받고 돌려주지 않을거야 
 * 3. return type, parameter(x)    >> int print() {return 100;} : 받지않고 돌려줄거야
 * 4. return type, parameter(o)    >> int print(int data) {return data+10;} : 받고 돌려줄거야
 * 
 * void : 돌려주는 것이 없다 >> return value가 없다.
 * return type : 8가지 기본타입, Array, class, Collection, Interface 사용가능 
 * parameter type : 8가지 기본타입, Array, class, Collection, Interface 사용가능
 * 
 * parameter의 개수는 제한이 없다.
 * void print(int a, int b, int c, int d) {} : 게임기가 동작하려면 정수값 4개를 넣어라   
 * >> print(10,20,30)을 넣으면 정상실행이 안된다. 4개를 넣어야함! print(10,20,30,40)
 *  
 * ex) boolean print(boolean b) {return true};
 * print(false);
 *  
 * 함수의 이름 : 관용적 표현
 * void a(){} a라고 함수의 이름을 쓰면 ...별로
 * 의미있는 단어의 조합으로 써야 좋다.
 * getChnnelNumber() 처럼
 * getEmpListByEmpno() 처럼 
 */

public class Fclass {
    public int data;
    
    // <기본유형 4가지>    
    // 1. 받지도 않고, 돌려주지도 않는 함수(가장 전형적인)
    public void m() {
        System.out.println("일반함수 : void, parameter(x)");
    }
    // 2. 받고, 돌려주지는 않는 함수
    public void m2(int i) {
        System.out.println("일반함수 : void, parameter(o)");
        System.out.println("parameter valu : " + i);
    }
    
    // 3. 받지않고, 돌려주는 함수
    public int m3() {
        return 100; //return type 존재하면 반드시 return키워드 사용
    }
    
    // 4. 받고, 돌려주는 함수
    public int m4(int data) {
        return 100 + data;
    }
    
    
    
    
    // <확장유형>
    // 1. 파라미터 여러개
    public int sum(int i, int j, int k) {
        return i + j + k;
    }
    
    
    // 함수 접근자 거의 public을 쓰는데
    // private를 쓰는 설계자의 의도는 무엇일까?
    // >> 외부에서는 사용하지 말고 내부에서만 사용해라!
    // >> 다른함수를 도와주는 역할을 해라.
    // >> 내부에서 사용되는 "공통함수"이다. 
    
    // 2. 공통함수
    private int subSum(int i) {
        return i + 100;
    }
    // 공통함수인 subSum을 호출해서 사용하는 함수를 만듦
    public void callSubSum() {
        int result = subSum(100);
        System.out.println("call result : " + result);
    }
    
    // 3. 공통함수
    private int operationMethod(int data) {
        return data * 200;        
    }
    
    public boolean opSum(int data) {
        // 연산은 다른 함수(operationMethod)에게 위임하고
        // 본인(opSum)은 논리만 판단하겠다.
        boolean bo;
        int result = operationMethod(data);
        if(result > 0) {
            bo = true;
        }else {
            bo = false;
        }
        return bo;
    }
    
    // Quiz
    // a와 b 둘중에 큰 값을 return 하는 함수를 만드세요
    // ex) max(300,100)이면 return값은 300  
    
    // 내가 푼 답
    public int max(int a, int b) {        
        int big;
        if(a > b) {
            big = a;
        }else {
            big = b;
        }
         return big;
    }
    
    
    // 강사님 답
    // return 을 최소 (반복적 사용 (x)
    // 30점
    /*
      public int max(int a , int b) { 
            if(a > b) {
                return a; 
             }else { 
                return b; 
             } 
      }
     */

    //60점
    /*
    public int max(int a, int b) {
        int result = 0;
        if (a > b) {
                result = a;
        } else {
                result = b;
        }
        return result;
    }
    */
    
    // 90점
    /* 
    int max = (a > b) ?  a  :  b ;
    return max;
     */
    
    // 100점
    /*
    public int max(int a, int b) {
        return (a > b) ?  a  :  b;
    }
     */
    
    
    // 함수의 return 또는 parameter의 타입으로는 >> Array, class(사용자정의타입)이 올 수 있다.
    // // Tv라는 타입을 갖는 [주소값:같은 타입을 갖는 주소]을 return하라.
    public Tv tCall() { 
        // return null; // 가능! 난 Tv타입의 객체가 없어라는 뜻
        
        // 방법1. 
        // 위 코드는 개발자가 객체에 어떤 값들을 세팅해서 보낼때 사용!
        Tv t = new Tv(); // t라는 변수는 Tv타입 객체의 주소가 들어있다.
        // t.brand = "LG"; // LG라는 브랜드네임을 세팅해서 보냄
        System.out.println("tv : " + t);
        return t;
        
        // 방법2.
        // 주소값만 보내고 값은 받은 사람이 알아서해라.
        // return new Tv(); // Tv라는 객체의 주소값을 바로 리턴
    }
    
    // Tv타입을 갖는 주소값을 patameter로 전달
    public void tCall2(Tv t) {
        System.out.println("t 주소 값 : " + t);
    }
}
