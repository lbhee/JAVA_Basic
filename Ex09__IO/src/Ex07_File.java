import java.io.File;

/*
 * 파일과 폴더를 다루는 클래스
 * JAVA에서는 파일과 폴더를 하나의 클래스로 다룬다. -> File
 * >> a.txt생성, 삭제, 정보 read
 * >> Temp폴더 생성, 삭제, 정보read
 * 
 * c# -> File클래스, Directory클래스
 * 
 * 절대경로 : 드라이브 중심 C:\\ , D:\\ -> C:\\Temp\\a.txt
 * 상대경로 : 현재파일 중심 C:\\Test >> ../Temp/a.txt
 * 
 * 
 */
public class Ex07_File {
    public static void main(String[] args) {
        String path = "C:\\Temp2\\file.txt";
        File f = new File(path);
        // File클래스를 사용하면 file에 대한 다양한 정보를 얻을 수 있다.
        System.out.println("파일명 : " + f.getName()); // 파일이름만 출력
        System.out.println("전체경로 : " + f.getPath()); // 파일경로 출력
        System.out.println("절대경로 : " + f.getAbsolutePath()); // 파일명만 줘도 절대경로 출력
        System.out.println("폴더니? " + f.isDirectory()); // false (파일입니다)
        System.out.println("파일이니? " + f.isFile());
        System.out.println("파일크기 " + f.length() + "byte"); // 파일안의 데이터길이
        System.out.println("부모경로 : " + f.getParent()); // 부모경로
        System.out.println("파일,폴더가 실제로 존재하니? : " + f.exists());
        
        // f.createNewFile(); 파일생성
        // f.delete(); 파일삭제
        // f.canRead(); 파일읽을 수 있니?

    }

}
