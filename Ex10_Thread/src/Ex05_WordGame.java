import javax.swing.JOptionPane;

// 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하고 싶다.
// hint) 공유자원

class WordInputProcess extends Thread {
    @Override
    public void run() {
        String dan = "2";
        String inputdata = JOptionPane.showInputDialog(dan +"단 값을 입력");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck = true; // 값을 변경
        }
        System.out.println("입력한 값은 : " + inputdata);
    }
}

class WordTimeOut extends Thread {
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            if(Ex05_WordGame.inputcheck) return; // run함수 빠져나가는 것은 stack 종료되는 것.
            System.out.println("남은 시간" + i);
            try {
                Thread.sleep(1000); // 대기실에서 1초간 뒤었다가 다시 일하기 (1초간격)
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ex05_WordGame {
    // 공유자원
    static boolean inputcheck = false;
    
    public static void main(String[] args) {
        WordInputProcess word = new WordInputProcess();
        WordTimeOut time = new WordTimeOut();
        
        word.start();
        time.start();
        
        try {
            // join : 다른 스레드의 종료를 기다림(휴게실에서)
            // join 요청한 스레드가 종료되면 그때 동작 ...
            
            word.join(); // main에게 word가 끝날때까지 기다려달라고 요청.
            time.join(); // main에게 time이 끝날때까지 기다려달라고 요청.
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        System.out.println("Manin END");
    }
}
