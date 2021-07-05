import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputSteam {

    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream("score.txt");
            dis = new DataInputStream(fis);
            while(true) {
                score = dis.readInt(); // writeInt()로 썼기 때문에.
                System.out.println("score int 데이터 : " + score);
                sum += score;
            }
        } catch (Exception e) {
            // dis.readInt() 문제..
            System.out.println(e.getMessage());
            System.out.println("sum 결과 : " + sum);
        } finally {
            try {
                dis.close();
                fis.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }

}
