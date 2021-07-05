/*
 * 오류
 * 1. 에러(error) : 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결불가
 * 2. 예외(exception) : 개발자의 코드실수에 의해 발생 >> 방어적인 코드(예외처리)
 * >> 예외가 발생하면 프로그램은 강제종료된다. 
 * 
 * 예외처리는 문제를 해결하는 것이 아니라 문제를 파악하는 것이다!
 * 예외가 발생하더라도 슬쩍 넘어가서 프로그램을 끝까지 실행할 수 있게 하는 것.
 * try {
 *   >> 문제가 발생할 수 있는 코드(문제가 발생하면 catch로 보내라!)
 * } catch(Exception e) {
 *   >> 문제가 생기면 catch 문제를 파악
 *   >> 처리유도
 *   >> 1. 관리자에게 메일로 알려준다.
 *   >> 2. 로그파일에 기록을 남긴다.
 *   >> 3. 강제종료는 막는다.(해결책은 아님)
 *   >> 4. 개발자의 코드 수정이 필요하다.
 * } finally {
 *   >> 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드!
 * }
 * 
 * 예외가 발생하면 개발자는 예외발생건에 대해서 파악해야함(어떤자원에서, 어떤행위때문에)
 * 예외에 관련된 클래스
 * 그리고 다양한 정보를 그 객체에 넣어줍니다.
 */
public class Ex01_Exception {
    public static void main(String[] args) {
        System.out.println("main start");
        
        try {
            // 문제가 될 코드
            System.out.println(0/0); // java는 0으로 나눌 수 없어서 여기서 에러(강제종료)
                                     // java.lang.ArithmeticException
                                     // new ArithmeticException();
        }catch(Exception e) { // Exception클래스는 ArithmeticException의 부모타입이다.
                              // (RuntimeException안의 모든 예외를 다 받을 수 있게 다형성 사용)
            // 문제에 대한 파악ㄴ
            // e.printStackTrace(); 왜 에러가 발생했는지 표시해주는 코드.
            System.out.println("발생 원인 : " + e.getMessage());
        }        
        
        System.out.println("main end");
    }

}
