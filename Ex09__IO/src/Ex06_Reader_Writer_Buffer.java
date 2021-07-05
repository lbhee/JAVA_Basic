import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_Reader_Writer_Buffer {

    public static void main(String[] args) {
       
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); // 2byte를 하나씩
            br = new BufferedReader(fr); // 한번에 태워서
            
            // 버퍼는 Line단위의 처리가 가능
            String line = "";
            for(int i = 0; (line = br.readLine()) != null; i++) {
                // System.out.println(line); // 엔터로 구분해준다.(일반파일형식) 이렇게 안하면 한글자씩나왔음.
                if(line.indexOf(";") != -1) {
                    System.out.println(line); // ;이 들어있는 줄만 출력.
                }
            }
                    
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
    } 
}
