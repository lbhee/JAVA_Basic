/*
 * 프로그램이 실행(더블클릭) >> 동작하고 있는 프로그램(프로세스) -> 최소하나의 스레드(stack)를 가지고 있다. 
 * >> JVM이 하나의 main thread(stack)를 생성.
 * 
 * 지금까지는 싱글프로세스였다. -> 싱글스레드(stack이 1개) >> main함수가 올라가서 실행됨
 * JVM이 call stack > main함수 동작
 * stack은 한번에 1개의 함수만 실행가능하다. (10개의 함수가 있더라고 실행이 아니라 순차적으로 1개씩 실행)
 * 
 */
public class Ex01_Single_Thread {
    // 실행순서 (하나의 stack을 사용 : 한번에 한개의 함수만 동작 : 싱글스레드)
    // main -> worker -> main -> worker2 -> main
    public static void main(String[] args) {
        System.out.println("나 main 함수 일꾼이야");
        worker();
        worker2();
        System.out.println("main 종료");        

    }
    static void worker() {
        System.out.println("나 1번 일꾼이야");
    }
    static void worker2() {
        System.out.println("나 1번 일꾼이야");
    }
     
}
