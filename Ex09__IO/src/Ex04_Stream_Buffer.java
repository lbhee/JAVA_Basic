import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * File 처리에서 가장 느린작업 -> Disk 작업
 * 원칙 : 1Byte씩 read, write한다. ex)10Byte면 10번
 * 한번에 모아서 처리하고 싶다면? read와 write를 buffer(캐시메모리)에 모아서 처리한다.
 * >> 1. I/O의 횟수를 줄여서 성능이 좋아진다.
 *    2. Line 단위(엔터단위)로 묶어서 사용한다.
 *  
 * 보조스트림 : BufferedInputSteam (주 클래스에 의존해서 쓰인다. 독자적인 생존 불가능)
 * 개발자가 의무적으로 사용한다.
 * 
 */
public class Ex04_Stream_Buffer {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        try {
            fos = new FileOutputStream("data.txt"); //data.txt가 없으면 프로젝트(디폴트경로)에 생성한다.
            bos = new BufferedOutputStream(fos); // 주 스트림을 버퍼에 태운다.
            
            for(int i = 0; i < 10; i++) {
                bos.write('A');
            }
            // bos.flush();
            
            // JAVA Buffer 크기 : 8kbyte (8192byte)
            // 1. Buffer가 가득 채워져야 스스로 출발한다(비운다) -> flush
            // 2. 채워지지 않으면 출발안하기 때문에(write안됨) 강제로 비우는 명령어가 필요 -> bos.flush();
            // 3. 자원해제를 하면 자동으로 flush호출 -> bos.close();
            
        }catch(Exception e) {
            
        }finally {
            try {
                bos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            } 
           
        }
    }

}
