import java.io.FileReader;
import java.io.FileWriter;

/*
 * 한글처리를 위해 스트림을 바꾸자.
 * 문자기반의 데이터 처리. (String 데이터 >> char[] 관리)
 * 
 * 한글 1자, 영문자 1자 >> 2byte
 * Reader, Writer
 * 
 * 대상 : File.. File
 */
public class Ex05_Reader_Writer {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); // read
            fw = new FileWriter("copy_Stream.txt"); // 파일생성 그파일 write
            
            int data = 0;
            while((data = fr.read()) != -1) {
                // System.out.println((char)data); // 콘솔창에 출력
                
                // fw.write(data); // 프로젝트에 copy.Stream을 생성해서 똑같이 복사(일반파일)
                
                // 배포파일(압축파일)처럼 만들기(엔터'\n' '\r', 공백'  ', 스페이스'\t가' 없는 파일)
                if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
                    fw.write(data);
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            try {
                fw.close();
                fr.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }

}
