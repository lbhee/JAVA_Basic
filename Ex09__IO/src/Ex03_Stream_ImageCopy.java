import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
    public static void main(String[] args) {
        String orfile = "C:\\Temp2\\1.jpg";
        String tarfile = "copy.jpg";
        // default경로 : 프로젝트 폴더
        // file:///C:/Users/LEEBOHEE/eclipse-workspace/Ex09__IO/copy.jpg
        
        FileInputStream fs = null;
        FileOutputStream fo = null; // 이렇게 밖으로 빼서 iv변수로 만들어줘야 finally블럭에서도 쓸 수 있음.
        
        try {
            fs = new FileInputStream(orfile);
            fo = new FileOutputStream(tarfile, false);
            
            int data = 0;
            while((data = fs.read()) != -1) {
                fo.write(data); // cogy.jpg의 byte값을 write
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fs.close();
                fo.close();
            } catch (Exception e2) {
                
            }
        }
    }

}
