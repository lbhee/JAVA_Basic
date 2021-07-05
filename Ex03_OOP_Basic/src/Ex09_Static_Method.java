/*
 * 1. static member field (객체간 공유자원)
 * 
 * 2. static method
 *    why? >> 왜 메인함수와 Math.random()은 
 *    Math m = new Math(); m.random() 이렇게 하지 않았을까?
 *    >> 자주 많이 쓰니까 , 편하게 사용하게 , new로 객체생성없이도 쓰도록 , static !
 *    
 * 
 * 
 */

// import java.lang.*; 생략되어 있음(default)


class StaticClass{
    int iv;
    
    static int cv;
    
    void m() {
        cv = 1000;
    }    
        // 일반함수에서 cv값을 사용할 수 있다?없다?
        // 순서상 m이라는 함수가 만들어지기 전에
        // static 자원은 일반자원보다 항상 메모리에 먼저 올라간다
        // cv는 이미 메모리에 올라갔으니 일반함수에서 사용가능!
        
                
    
    static void sm() {
        cv = 2222;
    }
        // static함수에서 일반자원인 iv를 사용할 수 있다?없다?
        // 순서상 static인 sm함수가 먼저 만들어지기 때문에
        // iv는 아직 생성전인 자원이다.
        // iv = 100;은 에러가 난다.
        // error가 없게 하려면 static은 static끼리 놀아라!
     
}
public class Ex09_Static_Method {
    public static void main(String[] args) {
        
        // 함수호출 전
        System.out.println(StaticClass.cv);
        
        // 함수호출 후
        StaticClass.sm();
        System.out.println(StaticClass.cv);
        
        
        // 일반자원(객체생성 후) 모든 자원 다 사용가능!
        StaticClass sc = new StaticClass();
        sc.m();
        sc.sm();
        System.out.println(sc.iv);
        System.out.println(sc.cv);
    }

}
