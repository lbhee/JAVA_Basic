import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

    public static void main(String[] args) {
        Fclass fclass = new Fclass();
        
        // 1. 받지도 않고, 돌려주지도 않는 함수(가장 전형적인)
        fclass.m(); // 함수호출
        
        // 2. 받고, 돌려주지는 않는 함수.
        fclass.m2(100);
        
        // 3. 받지않고, 돌려주는 함수
        int result = fclass.m3(); // 값을 돌려받을 result변수를 선언
        System.out.println(result);
        
        // 4. 받고, 돌려주는 함수
        result = fclass.m4(200);
        System.out.println(result);
        
        // 확장유형
        // 1. 파라미터 여러개
        result = fclass.sum(10, 20, 30);
        System.out.println(result);
        
        // 2. 공통함수
        // fclass.subSum은 private접근자를 가진 fclass 내부의 공통함수이므로 호출X
        
        // 공통함수를 내부에서 호출해서 사용한 함수를 호출
        fclass.callSubSum();
        
        // 3. 공통함수
        boolean bo = fclass.opSum(-20);
        System.out.println(bo);
        
        // Quiz
        int big = fclass.max(300, 100);
        System.out.println(big);
        
        // 4.
        Tv tv = fclass.tCall(); // Tv타입을 가지는 주소값을 받는다.
        System.out.println("tv : " + tv);
        
        //
        Tv tv2 = new Tv();
        fclass.tCall2(tv2); // 주소값 전달받음
        System.out.println("tv2 : " + tv2);
    }

}
