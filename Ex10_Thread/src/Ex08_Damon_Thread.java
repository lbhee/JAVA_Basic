/*
 * 데몬 : 보조 Thread
 * 
 * 주 Thread가 생명을 다하면 보조 Tread도 끝
 * 
 * 한글 글쓰기 >> 3초마다 저장할 수 있는 옵션
 * 글쓰기 작업이 종료되면 3초마다 저장하는 보조옵션도 종료되게.
 * 
 */
public class Ex08_Damon_Thread implements Runnable{
    static boolean autosave = false;
    public static void main(String[] args) {
        
        Thread demonthread = new Thread(new Ex08_Damon_Thread());
        
        // demonthread 보조로 만드려면 
        // main 함수 Thread의 보조가 되는 것이다.
        // 나는 당신과 생명을 같이하겠습니다.
        // 나는(demonthread) , 당신(main : 주 스레드)        
        demonthread.setDaemon(true);
        demonthread.start();
        
        // 주작업(한글쓰기)
        for(int i = 0; i <= 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            } 
            System.out.println("Main 한글 쓰기 작업" + i);
            // 자동저장시점
            if(i==5) {
                System.out.println("i : " + i);
                autosave = true;
            }
        }
    }
    
    public void autoSave() {
        System.out.println("한글 작업이 3초 간격으로 자동 저장");
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            if(autosave) { // static boolean autosave = false;
                // 작업(저장작업)
                autoSave(); // 호출
                
            }
        }
        
    }

}
