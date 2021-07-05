import java.util.Properties;

/*
 * <Properties>
 * Map 인터페이스를 구현한 클래스
 * 특수한 목적 : <String,String> (key, value) 강제한다.
 * 모든 자원들을 key, value 형태로 관리한다.
 * 예)
 * DB연결정보 (di = kglim , pwd = 1004)
 * App 전체에 사용되는 자원 관리
 * 환경변수
 * 프로그램버전
 * 공통파일의 경로
 * 공통변수
 * 
 */
public class Ex16_Properties {
    public static void main(String[] args) {
        // key, value를 무조건 받는 함수.
        Properties prop = new Properties();
        prop.setProperty("admin", "bit@bit.co.kr");
        prop.setProperty("version", "1.x.x.x");
        prop.setProperty("path", "C:\\Temp\\images");
        // 각각의 개발 페이지(유지보수가 쉬움)
        System.out.println(prop.getProperty("admin"));
        System.out.println(prop.getProperty("version"));
        

    }

}
