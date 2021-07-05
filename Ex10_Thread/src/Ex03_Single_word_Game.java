import javax.swing.JOptionPane;

/*
 * 단어 맞추기 게임
 * 구구단 게임
 * 
 * 문제가 나오고 일정시간이 지나면 프로그램이 종료되게.
 * 
 */
public class Ex03_Single_word_Game {
    public static void main(String[] args) {
        String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
        // System.out.println(inputdata);
        timer(); // 이상태에서는 타이머가 동작되지 않는다. 스레드가 1개여서 값을 입력이 끝난 뒤에 동작한다.
        
    }
    static void timer() {
        for(int i = 0; i > 0; i--) {
            try {
                System.out.println("남은시간 : " + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
