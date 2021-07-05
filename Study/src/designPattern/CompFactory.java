package designPattern;

// 컴포넌트객체를 가진 팩토리 클래스를 인터페이스로 지정
interface CompFactory {
    public Component getComp (Usage usage);
  }
 
  // 팩토리 클래스를 상속한 라이트 테마 공장 클래스를 만들어서 라이트테마 요소들만 넣는다.
  class LightCompFactory implements CompFactory {
 
    @Override
    public Component getComp (Usage usage) {
      if (usage == Usage.PRESS) {
        return new LightButton();
      } else if (usage == Usage.TOGGLE) {
        return new LightSwitch();
      } else {
        return new LightDropdown();
      }
    }
  }
  
  // 다크 테마 공장
  class DarkCompFactory implements CompFactory {
  
    @Override
    public Component getComp (Usage usage) {
      if (usage == Usage.PRESS) {
        return new DarkButton();
      } else if (usage == Usage.TOGGLE) {
        return new DarkSwitch();
      } else {
        return new DarkDropdown();
      }
    }
  }