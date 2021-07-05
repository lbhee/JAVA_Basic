import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

// 여자친구 입장
// 분해된 탱크를 복원하는 작업(객체) -> 역직렬화

public class Ex16_ObjectDataInputStream {
    public static void main(String[] args) {
       String filename = "Userdata.txt";
       
       FileInputStream fis = null;
       BufferedInputStream bis = null;
       ObjectInputStream in = null;
       
       try {
           fis = new FileInputStream(filename);
           bis = new BufferedInputStream(fis);
           in = new ObjectInputStream(bis); // 분해된 부품을조립하는 행위(역직렬화)
           
           /*
           UserInfo r1 = (UserInfo)in.readObject();
           UserInfo r2 = (UserInfo)in.readObject();
           System.out.println(r1.toString());
           System.out.println(r2.toString());
           */
           
           // 몇개를 보내든 받아서 읽을 수 있게.
           Object users = null;
           while((users = in.readObject()) != null) {
               System.out.println(((UserInfo)users).toString());
           }           
    } catch (FileNotFoundException fnfe) {
        System.out.println("파일이 존재하지 않습니다.");
    } catch (EOFException eofe) {
        System.out.println("끝" + eofe.getMessage());
    } catch (IOException ioe) {
        System.out.println(ioe.getMessage());
    } catch (ClassNotFoundException cnfe) {
        System.out.println(cnfe.getMessage());
    } finally {
        try {
            in.close();
            bis.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    }

}
