import java.io.IOException;

/*
 * 게임 CD PC 설치
 * >> 1. 설치파일 C:\Temp 복사
 * >> 2. 복사한 파일 -> 게임설치
 * >> 3. 정상설치 C:Temp 복사한 파일 삭제
 * >> 4. 비정상문제 발생(강제종료) >> 복사한 파일 삭제
 * >> 복사한 파일 무조건 삭제(강제종료되지 않고 파일삭제하게 강제하는 것.)
 */
public class Ex03_Finally {
    static void startInstall() {
        System.out.println("INSTALL");
    }
    static void copyFiles() {
        System.out.println("COPY FILES");        
    }
    static void fileDelete() {
        System.out.println("FILE DELETE");        
    }

    public static void main(String[] args) {
        // 3개이 함수가 정상처리
        // 예외를 사용자가 필요에 따라서 강제할 수 있다.
        // 실제로는 예외가 아닌데 개발자가 어떠한 상황에 대해서
        // 강제로 예외로 지칭할 수 있다.
        // 1이면 정상, 2이면 강제로 예외를 발생해서 catch
        // throw new IOException()
        
        try {
            copyFiles();
            startInstall();
            throw new IOException("install 도중 문제가 발생"); // 개발자가 임의로 발생시킨 예외
        }catch(Exception e) {
            System.out.println("예외 메세지 출력 : " + e.getMessage()); // 개발자가 생성한 예외메세지
            // fileDelete(); 이렇게 하면 예외가 발생하지 않았을 경우 파일을 안지운다..
        }finally {
            fileDelete(); // 예외가 발생하던, 발생하지 않던 무조건 실행!
            // 함수강제종료(return)를 만나면 함수 종료인데 예외적으로 
            // finally블록은 return에 의해서 종료되기 전에 호출이 된다.
        }
        // fileDelete(); 따라서 이것을 무조건 실행해 주려고 하면 finally블록에 써야한다.
        System.out.println("main end");
        
    }

}
