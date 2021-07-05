import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * Stream 중간매개체 (데이터의 통로) -> default 모양은? Byte
 * JAVA API
 * [추상클래스]
 * InputStream, OutputSteam
 * 
 * 입출력[대상] 두개의 추상클래스를 상속받아서 재정의 해서 써라.
 * 1. Memory : ByteArray ... , ByteArray ...
 * 2. File  : File ... , File ...(실직적으로 이것만 씀)
 * 
 */
public class Ex01_Stream {
    public static void main(String[] args) {
        // byte(-128 ~ 127) 정수를 저장하는 데이터타입
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null; // 현재 메모리를 가지고 있지 않는다.
        
        // 데이터를 read하거나 write하는 대상 memory
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc); // inSrc배열(메모리) read
        output = new ByteArrayOutputStream(); // write
        
        System.out.println("outSrc before : " + Arrays.toString(outSrc));
        
        // 공식같은 로직
        int data = 0;
        while ((data = input.read()) != -1) { // 배열에 더이상 read할 데이터가 없을 때 -1
            System.out.println("data : " + data);
            
            // read한 데이터를 다른 메모리에 write하기
            output.write(data);
            // write의 대상이 data가 아니고 자신(ByteArrayOutputStream)의 통로 data를 가지는 것. 
        }
        System.out.println(output.toByteArray()); // 가지고 있는 곳의 주소
        outSrc = output.toByteArray();
        System.out.println("outSrc after : " + Arrays.toString(outSrc));
    }
}
