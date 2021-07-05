package designPattern;
// 1.

// 추상클래스 생성 후 메서드를 만들고, 게터를 생성함.
abstract class Component {
    protected abstract String getCompName ();
    public Component () {
      System.out.println(this.getCompName() + " 생성");
    }
  }
  

// 팩토리메서드에서는 버튼, 스위치, 드랍다운요소만 있었다면,
// 추상팩토리에서는 라이트, 다크버전의 각각요소들을 모두 만들어 준다.
  class LightButton extends Component {
    @Override
    protected String getCompName() { return "라이트 버튼"; }
  }
  class DarkButton extends Component {
    @Override
    protected String getCompName() { return "다크 버튼"; }
  }
 
  class LightSwitch extends Component {
    @Override
    protected String getCompName() { return "라이트 스위치"; }
  }
  class DarkSwitch extends Component {
    @Override
    protected String getCompName() { return "다크 스위치"; }
  }
  
  class LightDropdown extends Component {
    @Override
    protected String getCompName() { return "라이트 드랍다운"; }
  }
  class DarkDropdown extends Component {
    @Override
    protected String getCompName() { return "다크 드랍다운"; }
  }
