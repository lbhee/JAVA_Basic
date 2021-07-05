/*
 * 오늘의 포인트!!!
 * <상속관계에서 override>
 * 상속관계에서 자식이 부모의 함수를 [재정의]하는 것.
 * [상속관계]에서 [자식 클래스]가 [부모 클래스]의 함수내용을 바꾸는 것. {재정의}
 * >> 재정의? 틀의 변화는 없고(함수의 이름, 타입, 파라미터) 내용만 변화
 * 
 */

class Point2{
    int x = 4;
    int y = 5;
    
    String getPosition() {
        return this.x + " / " + this.y;
    }
}

class Point3D extends Point2 {
    int z = 6;
    
    // String getPosition3() {
    //     return null;
    // }
    
    // 이렇게 써도되지만 어차피 정보를 보는것은 하나만 있으면 되니까
    // 위에 상속한 부모코드를 재정의해서 사용하자!
    
    // 오타를 내도 상관없이 그냥 함수를 하나더 만든것이 됨.
    // 하지만 반드시 재정의 함수였으면 좋겠다면?
    // Annotation을 달아준다! @Override
    // Annotation은 Java code만으로 전달할 수 없는 부가적인 정보를 [컴파일러]나 [개발툴]로 전달할 수 있다.
    // @Override(지금 이 함수가 정말 재정의가 맞게 되었는지 확인해봐)
    @Override
    String getPosition() {
        return this.x + " / " + this.y + " / " + this.z;
    }
}

public class Ex04_Inherit_Override {
    public static void main(String[] args) {
        Point3D point = new Point3D();
        point.getPosition();
        String result = point.getPosition();
        System.out.println(result);
    }

}
