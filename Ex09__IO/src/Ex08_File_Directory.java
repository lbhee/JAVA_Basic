import java.io.File;

public class Ex08_File_Directory {
    public static void main(String[] args) { // cmd 명령 프롬프트 활용
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        if(args.length != 1) {
            System.out.println("사용법 : java 파일명 [디렉토리명]");
            System.exit(0); // 프로그램강제종료            
        }
        File f = new File("args[0]");
        if(!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리가 아니라면
            System.out.println("유효하지 않은 경로");
            System.exit(0);
        }
        
        // 실제 존재하는 경로의 폴더라면
        File[] files = f.listFiles(); // C:\\Temp2 >> 안에 파일도 있고, 폴더도 있다.(a.txt, 참새폴더)
                                      // 둘다 파일로 보기 때문에 배열로 받는 것이다.
                                      // files[0] -> a.txt  , files[1] -> 참새폴더
        for(int i = 0; i < files.length; i++) {
            String name = files[i].getName(); //파일,폴더의 이름
            System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
        }
    }
}
