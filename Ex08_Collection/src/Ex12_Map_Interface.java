import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map 인터페이스
 * Map (key, value) 쌍의 구조를 갖는 배열
 * ex) 지역번호(02,서울) (031,경기)
 * key -> 중복X
 * value -> 중복O
 * generic 지원(key, value 타입을 강제할 수 있다)
 * 
 * Map 인터페이스 구현
 * 1. 구버전 : HashTable 동기화보장 lock
 * 2. 신버전 : HashMap 동기화강제X 성능고려
 * 
 */

public class Ex12_Map_Interface {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Tiger", "1004");
        map.put("scott", "1004");
        map.put("superman", "1004");
        // 아이디, 비밀번호 생성
        
        System.out.println(map.containsKey("tiger")); // 대소문자구분 -> false
        System.out.println(map.containsKey("Tiger")); // true
        // 중복아이디 검사
        
        System.out.println(map.containsValue("1004"));
        System.out.println(map.containsValue("1007"));
        
        // Map의 POINT
        // key를 제공하면 value값을 알 수 있다.
        System.out.println(map.get("superman"));
        // 비밀번호 찾기
        System.out.println(map.get("hong")); // key에 해당하는 value가 없다면 null
        
        map.put("Tiger", "1007"); // key는 중복(X) , value값을 overwrite (1004 -> 1007)
        System.out.println(map.get("Tiger"));
        // 비밀번호 변경
        
        System.out.println(map.size());
        
        Object value = map.remove("superman"); // key값을 삭제할 때 value값은 따로저장할 수도 있다. 
        System.out.println(value);
        
        System.out.println(map.toString()); // 재정의되어있다.
        
        // 응용
        Set set = map.keySet(); // key집합의 규칙 -> 순서X , 중복X -> Set으로 리턴
        Iterator it = set.iterator(); // 순차적인 출력
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        Collection col = map.values(); // value집합의 규칙 -> 중복O -> Collection으로 리턴
        System.out.println(col.toString());
        
        // Map과 List를 혼합해서 사용
        // 카톡(단체톡방번호,참여자)
        // HashMap<String,List> room = new HashMap<String,List>();
        // room.add("1", new ArrayList());
        
    }

}
