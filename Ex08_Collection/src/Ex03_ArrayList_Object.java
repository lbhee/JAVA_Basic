import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {
    public static void main(String[] args) {
        // 사원 1명을 만드세요. (객체생성)
        Emp emp = new Emp(100, "김유신", "군인");
        System.out.println(emp.toString());
        
        // 사원 2명을 만드세요. (객체배열)
        Emp[] emplist = {new Emp(100, "김씨", "일반") , new Emp(200, "박씨", "학생")};
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }
        
        // 1명이 입사를 더 했습니다. 추가해주세요.
        // [기존방법]
        // Emp[] emplist = new Emp[3];
        // 방3개짜리를 다시 만들어서 기존데이터를 이동..
        // ArrayList는 이런 문제를 자동으로 해준다.
        
        // -----------------------------------------------------------------------------------------
        
        // Collection
        ArrayList elist = new ArrayList(); // Object 타입
        elist.add(new Emp(1, "강씨", "IT"));
        elist.add(new Emp(2, "김씨", "IT"));
        // 1명 더 입사했습니다. 추가해주세요.
        elist.add(new Emp(3, "이씨", "IT"));
        System.out.println(elist.size());
        
        for(int i = 0; i < elist.size(); i++) {
            System.out.println(elist.get(i));            
            Object obj = elist.get(i);
            System.out.println(obj); // 재정의한 toString()을 호출해서 값이 나오는 것.
            Emp e = (Emp)obj; // 다운케스팅.
            System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob()); 
            // Emp e = elist.get(i); 
            // 이렇게는 못쓴다. ArrayList가 가지고 있는 배열의 타입이 Object[]이기 때문에.
            // 다운케이팅을 해야한다.
            // toString만 쓸거면 다운케이스팅 필요없다.(toString재정의 하면 되니까)
            // 하지만 목적에 따라서 iv들을 쓸거면 downcastring이 필요하다.            
        }        
        for(Object e : elist) {
            Emp e2 = (Emp)e;
        }
        
        // 개발자가 제일 싫어하는 것이 casting(형변환) , 예외도 많음
        // Object 안쓰게 해줘. JAVA를 만든사람들에게 요청!
        // generic 타입 (객체에 대한 생성타입을 강제)
        // 현업에서는 90% 제너릭을 쓴다.
        ArrayList<Emp> list2 = new ArrayList<Emp>(); // Emp타입으로 객체배열이 만들어진다.(타입강제)
        list2.add(new Emp(1, "A", "IT"));
        for(Emp e : list2) {
            System.out.println(e.getEmpno()); // 다운케스팅 없이 iv사용가능.
        }
    }

}
