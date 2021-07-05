import kr.or.bit.Apt;
import kr.or.bit.BodyInfo;
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;
// 다른 클래스를 가져오려면 위 처럼 참조를 해야한다.
// ctrl+shift+o 자동완성

public class Ex01_Ref_Type {
    public static void main(String[] args) {
        
        // ---------------------------------------------------------------------------
        
        int num = 100; // 값타입 변수
        System.out.println(num);
        
        // ---------------------------------------------------------------------------
        
        Emp emp = new Emp(); // 참조변수(주소값 변수)
        // 메인함수 안에 독자적으로 실행불가능한 Emp클래스를 가져온다.
        // 만들어준 emp변수는 메인함수안에서 선언했기때문에 local 변수이다.        
        System.out.println(emp);
        // kr.or.bit.Emp@5305068a 주소값(변형)
        // kr.or.bit.Emp + @ + 주소
        
        // emp.empno , emp.ename , emp.job-> 여기서 볼 수 없다. private로 되있기 때문에.
        
        // emp.number -> 볼 수 있다. public으로 되어있기 때문에.
        // 따라서 emp.number는 직접 값을 할당할 수 있다.
        emp.number = -100;
        System.out.println(emp.number);
        
        
        // emp.num -> 볼 수 없다. private로 되있기 때문에.
        // 따라서 setter와 getter 사용하여 간접적으로 할당해주어야 한다.    
        emp.setNum(-100); 
        int result = emp.getNum();
        System.out.println(result);
                      
        
        // emp.ename 간접할당
        // "님"이라는 글자가 항상 붙여 나오도록
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name : " + name);
        
        
        
       // ---------------------------------------------------------------------------
        
        
        
        
       // 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해서
       // member field를 초기화 하지 않았으므로 여기서 값을 준다!
       Apt sapt = new Apt();
       sapt.door = 20;
       System.out.println(sapt.door);
       System.out.println("주소 : " + sapt);
       
       Apt lapt = new Apt();
       lapt.door = 10;
       System.out.println(lapt.door);
       System.out.println("주소 : " + lapt);
       
       Apt mapt = new Apt();
       System.out.println(mapt.door);
       System.out.println("주소 : " + mapt);
       // 아파트 3개다 주소가 다르다. 각자 new로 다른 객체를 생성해주었기 때문에.
       
       
       // 값할당
       int i = 10;
       int j;
       j = i;
       j = 100; // i값이 100이 되진않는다.
         
       
       // 주소값 할당
       Apt apt = new Apt();
       Apt kapt = apt; //kapt와 apt는 같은 주소에 살게 된다.(=값이 같다)
       apt.door = 9999;
       System.out.println(kapt.door);
       System.out.println("apt주소 : " + apt);
       System.out.println("kapt 주소 : " + kapt);
       
       
       int[] arr = new int[5];               
       int[] arr2 = arr;
       // 같은 주소를 참조합니다.
              
       
       // 값타입 (8가지)
       // 참조타입 (class, Array)
       
       // 선언과 할당을 분리할 수 있다.
       Apt ap; // 선언 (stack영역에 공간만 확보 : default 4byte)
       ap = new Apt(); // 할당(=ap라는 변수가 new를 통해 heap영역에 메모리를 갖는다 =객체의 주소값을 갖는다)
       System.out.println("ap 주소값 : " + ap);
       
       ap = null; // 원래는 ap에 주소값이 들어있지만 null을 넣었으므로 heap영역과 연결된 주소가 끊킨다.
       System.out.println("ap 주소값 : " + ap);
              
       // 초기화 : 함수안에 있는 변수는 지역변수이므로 사용하려면 초기화해야함.
       Apt ap2; // main함수 안에 있는 ap2변수 scope은 local이다. 
       ap2 = null;
       System.out.println(ap2);
       
       // 마찬가지로 이곳은 main함수 안이므로 변수를 초기화 해주어야 한다.
       Car car;
       car = null; //초기화 값을 null로 해준것이다. 0으로도 가능할까? X 주소값이나 null값이어야 한다!
       System.out.println(car);
       
       Apt ap3 = new Apt();
       System.out.println(ap3.car); // Apt클래스에 car변수가 가지고 있는 값을 출력하라.
       
       Apt ap4 = new Apt();
       
       Apt ap5 = ap4;
       
       // 주소값비교
       // ==
       System.out.println(ap3 == ap4); // 비교(변수가 가지고 있는 값)
       System.out.println(ap4 == ap5); // true(둘은 같은 주소를 가지고 있다)
       
       
       
       // -------------------------------------------------------
       
       
       
       // Tv 한대를 생산하세요
       // 제조회사 : 비트
       // 채널 5번 설정
       // 정보를 출력하세요.
       Tv bittv = new Tv();
       bittv.brand = "비트";
       bittv.channel_Up();
       bittv.channel_Up();
       bittv.channel_Up();
       bittv.channel_Up();
       bittv.channel_Up();
       
       bittv.tv_Info();
       
       
       
       // ---------------------------------------------------------
       
       
       
       // 사원 1명을 생성
       // 사번:7788, 이름:김유신, 부서:IT, 급여:1000, 신체정보:키(190), 몸무게(40)
       
       Person person = new Person();
       person.empno = 7788;
       person.ename = "김유신";
       person.job = "IT";
       person.sal = 1000;
       
       // 방법1
       person.bodyinfo = new BodyInfo();
       person.bodyinfo.height = 190;
       person.bodyinfo.weight = 40;
       System.out.println(person.bodyinfo.height);
       System.out.println(person.bodyinfo.weight);
       
       // 방법2
       // BodyInfo info = new BodyInfo();
       // info.height = 190;
       // info.weight = 40;
       
       // person.bodyinfo = info; // 주소값할당이 없으면 Person과 BodyInfo는 관련이 없으니까.
       // System.out.println(person.bodyinfo.height);
       // System.out.println(person.bodyinfo.weight);
    }
    
    
}

