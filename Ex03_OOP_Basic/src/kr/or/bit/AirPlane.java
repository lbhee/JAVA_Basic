package kr.or.bit;
/*
 * 우리회사는 비행기를 주문, 제작, 판매하는 회사입니다.
 * 비해기를 생산하는 설계도를 작성하려합니다.
 * <요구사항>
 * 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야함
 * 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인하는 작업이 필요함(출력정보 확인)
 * 3. 공장장은 현재까지 만들어진 비행기의 총 대수(누적)를 확인 할 수 있음.
 * 
 * AirPlane air = new AirPlane();
 * AirPlane air2 = new AirPlane();
 * AirPlane air3 = new AirPlane();
 * 
 */

// 옛날 코드
/*
public class AirPlane {
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
   public void makeAirPlane(int num, String name)
   {
       airnum = num;
       airname = name;
       // 강제누적
       airtotalcount++;
       
       AirPlaneInfo();
   }
   
   private void AirPlaneInfo() {
       System.out.println("비행기이름 : " + airname + ", 번호 : " + airnum);
       
   }
   
   public void airPlaneTotalCount() {
       System.out.printf("비행기 누적대수 : [%d]\n", airtotalcount);
   }
}
*/

// ==============================================================================

// this와 constructor 적용한 코드(리팩토링)
public class AirPlane {    
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
    // public AirPlane() {} 디폴트생성자는 이름과 번호가 없어도 구현가능..
    
    // 오버로딩으로 번호, 이름쓰게 강제하기
    public AirPlane(int airnum, String airname) {
       this.airnum = airnum;
       this.airname = airname;
       // 누적
       airtotalcount++;
       
       AirPlaneInfo();
   }
   
   private void AirPlaneInfo() {
       System.out.println("비행기이름 : " + this.airname + ", 번호 : " + this.airnum);
       
   }
   
   public void airPlaneTotalCount() {
       System.out.printf("비행기 누적대수 : [%d]\n", airtotalcount);
   }
}
