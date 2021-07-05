import javax.swing.JOptionPane;

// 2개 함수가 개별로 별도 실행
// 1. 시간을 제어하는 Thread(stack)
// 2. 단어 입력을 처리하는 Thread(stack) >> main함수

class WordTime extends Thread {
    @Override
    public void run() {
        for(int i = 0; i > 0; i--) {
            try {
                System.out.println("남은시간 : " + i);
                sleep(1000); // cpu를 점유하고 sleep을 만나면 1초간 휴식한다. (일정한 간격으로 실행)
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
    public class Ex04_Multi_Thread_word_Game {
        public static void main(String[] args) {
            // 2개
            // class WordTime extends Thread
            // static void main

            WordTime timer = new WordTime();
            timer.start();

            String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
            System.out.println("입력값 : " + inputdata);
            System.out.println("main end");
        }
    }
