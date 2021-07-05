import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<k,v> 제너릭 지원
 * HashMap<String, String>
 * HashMap<Interger, String>
 * HashMap<String, Emp> -> value가 여러개의 데이터를 가진다.
 * >> put("kim", new Emp()); 
 * 
 */

class Student {
    int kor;
    int math;
    int eng;
    String name;
    
    public Student(int kor, int math, int eng, String name) {
        super();
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
    }     
}

public class Ex14_HashMap {

    public static void main(String[] args) {
        // 학생마다 고유한 ID를 부여
        HashMap<String, Student> sts = new HashMap<String, Student>();
        sts.put("hong", new Student(100, 99, 88, "홍길동"));
        sts.put("kim", new Student(50, 40, 60, "김유신"));
        
        // key를 주면 value을 리턴(value의 타입 = Student)
        Student std = sts.get("hong");
        System.out.println(std);
        
        // Tip1.
        // Map key, value 관리 (두가지를 한번에 볼 수 있는 함수)
        Set set = sts.entrySet(); // key + "=" + value 를 하나의 문자열로 만들어서 관리. 순서X 중복X -> Set
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Tip2.
        // 분리된 key와 value를 획득할 방법
        // class Entry {Object key, Object value}
        // Map { Entry[] elements } >> Map.Entry 인터페이스
        // Map.Entry 타입으로 받으면 key와 value를 분리해서 얻을 수 있다.
        for(Map.Entry m : sts.entrySet()) {
            System.out.println(m.getKey() + "/" + m.getValue());
        }
        
        // toString된것 다운케스팅
        for(Map.Entry m : sts.entrySet()) {
            System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
        }

    }

}
