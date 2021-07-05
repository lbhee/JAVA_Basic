import kr.or.bit.Singleton;

public class Ex14_Singleton_main {

   public static void main(String[] args) {
      Singleton s = Singleton.getInstance();
      System.out.println(s);
      
      Singleton s2 = Singleton.getInstance();
      System.out.println(s2);

   }

}
