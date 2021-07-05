import java.util.Scanner;

public class Ex07_Quiz_Jumin {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      while(true) {
         System.out.println("주민등록번호를 입력해주세요.(-를 포함해서 입력)");
         String InputJumin = scanner.nextLine();
         
         if(check(InputJumin) == true && genderCheck(InputJumin) == true) {
         genderPrint(InputJumin);
         break;
         }
      }
   }

   static boolean check(String InputJumin) {
      return InputJumin.length() == 14 && InputJumin.substring(6, 7).equals("-") ? true : false;      
   }

   static boolean genderCheck(String InputJumin) {
      int genderNum = Integer.parseInt(InputJumin.substring(7, 8));
      return genderNum > 0 && genderNum < 5 ? true : false;
   }

   static void genderPrint(String InputJumin) {
      char gender = InputJumin.charAt(7);

      if(gender == '1' || gender == '3') {
         System.out.println("성별 : 남자");
      }else {
         System.out.println("성별 : 여자");
      }
   }
}