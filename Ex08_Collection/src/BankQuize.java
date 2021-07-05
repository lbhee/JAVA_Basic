import kr.or.bit.Account;
import kr.or.bit.Bank;

public class BankQuize {

    public static void main(String[] args) {
       Bank bank = new Bank();
       // 계좌생성하기
       bank.addAccount("10071", "백");       
       bank.addAccount("890113", "택");
       bank.addAccount("0113", "택");
       bank.addAccount("987654321", "두팔");
       
       bank.getTotalAccount(); // 총계좌수 반환
       
       System.out.println("<총계좌목록>");
       bank.getAccounts();
       
       System.out.println("<계좌번호로 계좌찾기>");
       bank.getAccount("10071");
       
       System.out.println("<소유자명으로 계좌찾기>");
       bank.findAccounts("택");
       
       System.out.println("<입출금>");              
       Account userAccount = bank.getAccount("987654321");
       userAccount.deposit(10000); // 입금
       userAccount.getTransactions();       
       userAccount.withdraw(500); // 출금
       userAccount.getTransactions();       
    }
}
