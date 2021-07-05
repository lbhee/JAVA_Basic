import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
    static int totalfiles = 0;
    static int totaldirs = 0;
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("사용법 : java [실행할파일명] [경로명]");
            System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
            System.exit(0);
        }
        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 경로");
            System.exit(0);
        }
        // 정상적인 경로, 폴더
        printFileList(f);
        System.out.println("누적 총 파일수 : " +  totalfiles);
        System.out.println("누적 총 폴더수 :" + totaldirs);
    }
             // printFileList(C:\\Temp2\\2021)
             // printFileList(C:\\Temp2\\2022)
    static void printFileList(File dir) {
        System.out.println("[Full path] : " + dir.getAbsolutePath());
        List<Integer> subdir = new ArrayList<Integer>();
        File[] files = dir.listFiles();
        // [0] >> a.txt
        // [1] >> 1.jpg
        // [2] >> 2021폴더
        // [3] >> 2022폴더
        
        for(int i = 0; i < files.length; i++) {
            String filename = files[i].getName(); // 폴더명 or 파일명
                if(files[i].isDirectory()) {
                    filename = "<DIR> [ " + filename + " ]";
                    subdir.add(i); // POINT!!
                    // list[0] >> 2
                    // list[1] >> 3
                }else {
                    filename = filename + " / " + files[i].length() + "Byte";
                }
            System.out.println("    " + filename);    
        }
        int dirnum = subdir.size(); // 폴더개수
        int filenum = files.length - dirnum; // 파일개수
        // 함수가 종료되어도 누적해서가지고 있고 싶다.
        totaldirs += dirnum; // 총누적(하위폴더까지)
        totalfiles += filenum; // 총누적(파일)
        
        System.out.println("[Current dirNum] : " + dirnum);
        System.out.println("[Current fileNUm] : " + filenum);
        
        // 재귀호출 POINT!!!
        // 폴더안에 폴더인 하위폴더 정보도 보고 싶다.
        for(int j = 0; j < subdir.size(); j++) {
            int index = subdir.get(j);
            // [0] >> 2
            // [1] >> 3
            printFileList(files[index]);
            // printFileList(C:\\Temp2\\2021)
            // printFileList(C:\\Temp2\\2022)
        }
    }
}
