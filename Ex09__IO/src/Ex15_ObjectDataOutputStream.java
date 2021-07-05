import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

// 남자친구입장
// 만든 탱크를 직렬화해서 보내기 -> 직렬화 
public class Ex15_ObjectDataOutputStream {

    public static void main(String[] args) {
        String filename = "Userdata.txt"; // 객체를 직렬화해서 주는 것 write
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(filename, true); // append
            bos = new BufferedOutputStream(fos);
            // 직렬화 하고 싶으면
            out = new ObjectOutputStream(bos);
            
            // 직렬화 대상(객체)
            UserInfo u1 = new UserInfo("홍길동", "super", 500); // 완제품
            UserInfo u2 = new UserInfo("sccot", "tiger", 50); // 완제품
            
            // 벽에 구멍을 만들고 보내기
            // 직렬화 "Userdata.txt"
            out.writeObject(u1); // 분해해서 Userdata.txt에 write
            out.writeObject(u2); // 분해해서 Userdata.txt에 write
            // 객체를 따로따로 보내서 받을때도 따로받아야함. HashMap처럼 객체를 한번에 보내면 한번에 받을 수 있음.
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                out.close();
                bos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }

}
