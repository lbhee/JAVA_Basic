import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 폴더에서 한 단어를 찾고 그 단어가 있는 파일의 경로들을 찾아내기.

public class Ex12_PrintWriter_String_Finder {
    String basedir = "C:\\Temp2"; // 검색할 폴더
    String word = "HELLO"; // 검색할 단어
    String save = "result.txt"; //HELLO 단어가 들어있는 파일목록 저장

    void Find() throws IOException {

        File dir = new File(basedir);
        if(!dir.isDirectory()) { // 디렉토리가 아니면 종료
            System.out.println("is not directory");
            System.exit(0);
        }

        PrintWriter writer = new PrintWriter(new FileWriter(save));
        BufferedReader br = null;

        File[] files = dir.listFiles(); // 파일,폴더 목록
        for(int i = 0; i < files.length; i++) {

            // 파일이 아닌 경우에는 아래코드 스킵해라.
            if(!files[i].isFile()) {
                continue; 
            }

            // 파일이라면(a.txt or aaa.txt or hello.txt)
            br = new BufferedReader(new FileReader(files[i]));

            // 파일안에 한문장씩 read하면서 검색(HELLO)
            String line = "";
            while((line = br.readLine()) != null) {
                if(line.indexOf(word) != -1) { // 현재 read한 문장에 HELLO단어가 하나라도 들어있으면
                    writer.write("word = " + files[i].getAbsolutePath() + "\n"); 
                    // 그 단어가 있는 경로
                }
            }
            writer.flush();
        }
        br.close();
        writer.close();
    }        


    public static void main(String[] args) {
        Ex12_PrintWriter_String_Finder StringFinder = new Ex12_PrintWriter_String_Finder();
        try {
            StringFinder.Find();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
