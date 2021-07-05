import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

    public static void main(String[] args) {
        // 지역번호, 출석부, 우편번호, 회원가입 등등
        
        // 회원가입
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "kim1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "kim1004");
        
        // 로그인 시스템
        // id(O), pwd(O) -> 로그인 성공
        // id(O), pwd(x) -> 비밀번호 다시입력
        // id(x) -> 다시입력
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("id . pwq 입력해주세요.");
            System.out.println("ID");
            String id = scanner.nextLine().trim().toLowerCase();
            
            System.out.println("PWD");
            String pwd = scanner.nextLine().trim();
            
            if(!loginmap.containsKey(id)) {
                // id(X)
                
                System.out.println("아이디가 맞지 않습니다. 재입력");
            }else {
                // id(O)
                if(loginmap.get(id).equals(pwd)) {
                    System.out.println("로그인 성공");
                    break;
                }else {
                    System.out.println("비밀번호 다시 확인");
                }
            }
        }
               

    }

}
