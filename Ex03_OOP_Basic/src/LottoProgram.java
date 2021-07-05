import kr.or.bit.Lotto;

//기능 >> method >> 함수 하나당 기능 하나
 // public >> 참조변수
 // private >> 내부 사용 (공통)
 //실번호 추출해 주세요
 //중복값 나오면 안되요
 //낮은 순으로 정렬해 주세요
 //화면에 출력해 주세요
 //메뉴 기능을 만들어 주세요

public class LottoProgram {
    public static void main(String[] args){
        Lotto lotto = new Lotto();
        lotto.selectLottoNumbers(); 
      }

}
