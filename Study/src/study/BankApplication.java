package study;

import java.util.Scanner;
public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------");
            System.out.println("선택 >");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                creatAccount();
            }else if(selectNo == 2) {
                accountList();
            }else if(selectNo == 3) {
                deposit();
            }else if(selectNo == 4) {
                withdraw();
            }else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void creatAccount() {
        scanner.nextLine();
        System.out.println("계좌번호");
        String ano = scanner.nextLine();
        System.out.println("계좌주");
        String owner = scanner.nextLine();
        System.out.println("초기입금액");
        int balance = scanner.nextInt();

        Account acount2 = new Account(ano, owner, balance);
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = acount2;
                break;
            }
        }    
    }

    private static void accountList() {
        System.out.println("계좌목록");
        for(Account i : accountArray) {
            if(i != null) {
                System.out.println(i);
            }        
        }
    }

    private static void deposit() {
        scanner.nextLine();
        System.out.println("계좌번호");
        String ano = scanner.nextLine();
        System.out.println("입금액");
        int deposit = scanner.nextInt();

        Account account = findAccount(ano);
        account.setBalance(account.getBalance()+deposit);
    }

    private static void withdraw() {
        scanner.nextLine();
        System.out.println("계좌번호");
        String ano = scanner.nextLine();
        System.out.println("출금액");
        int withdraw = scanner.nextInt();

        Account account = findAccount(ano);
        account.setBalance(account.getBalance()-withdraw);
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                String fano = accountArray[i].getAno();
                if(fano.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }


}