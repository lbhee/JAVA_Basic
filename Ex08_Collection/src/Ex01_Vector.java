import java.util.Vector;

/*
 * Collection FramWork
 * [다수의 데이터]를 다루는 [표준화된 인터페이스]를 구현하고 있는 [클래스의 집합]
 * 
 * Collection 인터페이스  -> List 인터페이스가 상속 -> ArrayList(구현 : 수많은 약속을)******
 *                      -> Set 인터페이스 상속 -> HashSet , TreeSet (구현)
 *                      -> Map 인터페이스 (key, value) -> HashMap(구현)******
 * 
 * 1. List (줄을 서시오. 번호표. 순서O 중복O) >> 내부적으로 데이터(자료, 객체) >> 배열관리
 *    예) [홍길동] [홍길동] [홍길동] 
 *    
 *    <구현하고 있는 클래스>
 *    1.1 Vector(구버전) -> 동기화보장(멀티스레드환경에서) -> Lock장치(무조건) -> 성능이 조금 떨어지지만 안정성 보장.
 *    1.2 ArrayList(신버전) -> 동기화보장X -> Lock장치X(필요에 따라서 쓸 수 있음) -> 안전성보다 성능을 우선시.
 *    
 *    *기존의 여러개의 같은 타입의 데이터를 관리하기 위해서 Array사용(정적/고정배열)
 *     : 방의 개수가 한번 정해지면 방의 크기는 변경불가
 *       int[] arr = new int[5];
 *       arr[0] = 100;
 *       .. 10개의 방이 필요하면? 다시만든다.. 늘리거나 줄이는 작업불가!!
 *       int[] arr2 = new int[10] 
 *       다시 방을 만들고 arr 자원을 arr2 이관
 *       
 *       Array
 *       1. 배열의 크기가 고정. (Car[] cars = {new Car(), new Car{}}; // 방2개
 *       2. 접근방법 (index) 방번호접근 : cars[0] .... n방까지 : .length-1;
 *       3. 초기설정 불가.
 *       
 *       <-> Collection
 *       List -> Vector , ArrayList
 *       1. 배열의 크기를 동적으로 확장 : 축소 >> 사실은 [배열의 재할당]을 이용한 기능
 *       2. 순서를 유지(내부적으로 index배열), 중복값 허용
 *       3. 데이터 저장공간 : Array
 *       
 * 2. Set (원 안에 들어가시오. 순서X 중복X)
 * 3. Map (키와 값으로 이루어진 쌍의 배열 -> 우편번호, 지역번호 등)
 * 
 */
public class Ex01_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default 용량 : " + v.capacity()); // 10개 배열
        System.out.println("size : " + v.size());
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        
        System.out.println("데이터의 크기 = size : " + v.size()); // length와 같음
        System.out.println(v.toString()); // Vector가 재정의 했다.
        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i)); //array[i] 대신 get(i) 함수사용
        }
        
        // 개선된 for문 (vector의 타입은 object이다. 모든 타입이 다 들어올 수 있음)
        for(Object obj : v) {
            System.out.println(obj);
        }
        
        // 제너릭 >> 타입을 강제하는 방법(추후에 별도학습)
        Vector<String> v2 = new Vector<String>();
        v2.add("hello");
        v2.add("world");
        v2.add("king");
        for(String str : v2) {
            System.out.println(str);
        }
        
        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A"); // 11개 -> 20개로 자동으로 늘어난다.(2배씩)
        System.out.println(v3.capacity());
        System.out.println(v3.size());
        
    }

}
