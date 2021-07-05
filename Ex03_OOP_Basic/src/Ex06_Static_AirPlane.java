import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

    public static void main(String[] args) {
        AirPlane airplane = new AirPlane(707, "대한이항공");        
        
        AirPlane airplane2 = new AirPlane(708, "대한이항공");
        
        airplane2.airPlaneTotalCount();
        
        AirPlane airplane3 = new AirPlane(709, "대한이항공");
        
        airplane3.airPlaneTotalCount();
        airplane2.airPlaneTotalCount();
        airplane.airPlaneTotalCount();
        // 공유자원이기 때문에 어디서불러도 같은 값.
    }

}
