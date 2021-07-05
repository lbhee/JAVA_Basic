import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {

    public static void main(String[] args) {
        // 출력형식의 정의
        // printf , String.format
        // 출력물에 대한 형식을 정의(레포팅) >> txt >> 이쁘게
        // 현업 : 레포팅 : 툴 >> 오즈, 크리스탈레포트
        // PrintWriter 그림을 그릴 수 있게 해주는 함수
        
        try {
            /*
            PrintWriter pw = new PrintWriter("C:\\Temp2\\homework.txt"); // 생성 및 쓰기
            pw.println("**************************************************************");
            pw.println("****************************HOMEWORK**************************");
            pw.println("**************************************************************");
            pw.printf("%3s : %5d  %5d  %5d  %5.1f","아무개" , 100 ,90 , 50,(float)((100+90+50)/3));
            pw.println();
            pw.close();
            */
            
            // 위 파일이 라인단위로 기록되고 있다.
            // read도 라인단위로 리드하는것이 좋음(버퍼에 태워서)
            FileReader fr = new FileReader("C:\\Temp2\\homework.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
            
            br.close();
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
