import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_Reader_Writer_Buffer2 {

    public static void main(String[] args){
        // Lotto 회차기록가능
        
        FileWriter fw = null;
        try {
            fw = new FileWriter("Lotto.txt", true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        
        try {
            bw.write("로또");
            bw.newLine();
            bw.write("1,3,6,8,9");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}
