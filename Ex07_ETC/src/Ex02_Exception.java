
public class Ex02_Exception {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main Start");
        
        try {
                for(int i = 0; i < 10; i++ ) {
                result = num / (int)(Math.random()*10); // 0~9까지의 정수값
                System.out.println("result : " + result + " i : " + i);
                }                
        }catch(ArithmeticException e) { //어떤 예외가 발생할지 확실히 알면 Exception보다 하위예외(구체화)를 쓸 수 있으면 좋다.
            System.out.println("문제가 발생-로그기록-관리자에게 메일발송");
            System.out.println("원인 : " + e.getMessage());            
        }catch(NullPointerException e) {
            
        }catch(Exception e) {// 하위 예외 먼저 선언해야한다!
            // ArithmeticException아니고 NullPointerException도 아닌 예외는 여기서 해결한다.
            // 사실 Exception만 써도되지만 가독성을 위해서(유지보수) 하위예외를 쓰는 것이다.
        }
        
        System.out.println("main end");
    }
}
