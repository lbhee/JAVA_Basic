import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * read, write하는 대상이 File >> 메모.txt
 * >> FileInputStream
 * >> FileOutputStream
 *  
 */
public class Ex02_Point_FileStream {
    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp2\\a.txt";
        
        try {
                fs = new FileInputStream(path); // (읽으려는 대상)
                fos = new FileOutputStream("C:\\Temp2\\new.txt", true); // (쓰려는 대상, 없으면 생성)
                // FileOutputStream
                // 1. write하는 파일이 존재하지 않으면 파일을 생성한다.
                // new FileOutputStream("C:\\Temp2\\new.txt", false)
                // 디폴트 값이 false여서 아무것도 안써주면 overwrite되고,
                // true라고 써주면 기존파일에 append된다.
                
                
                int data = 0;
                while((data = fs.read()) != -1) { // read 1비트씩 읽어서 정수로 반환해줌.
                   System.out.println(data); // char를 정수로 변환해서 읽은것.
                   System.out.println((char)data); // char로 변환하기.
                   fos.write(data); // new.txt파일에 read한 데이터값을 write하겠다.
                                    // FileOutputStream은 write하려는 파일이 없으면 파일도 생성한다.
                }
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally { // 정상, 비정상, return 코드 모두 수행하는 곳(강제적실행)            
            // 자원해제
            // 명시적인 자원 해제(객체) -> 가비지 컬렉터 관리
            // 가비지 컬렉터가 관리하지 못하는 자원 : 네트워크 자원 등
            // 혼자일때는 문제없지만 멀티스레드로 가면 문제가 생기는
            // I/O , NetWork 자원들은 개발자가 직접(명시적으로) 자원 해제시켜주어야함.
            // ex) 엑셀작업하고 있을 때 다른사람이 열면 -> 이미실행되고있는 .. 읽기전용.. 이런작업들             
            // 생성자 <-> 소멸자 호출
            try {
                fs.close();
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
         
        }
    }

}
