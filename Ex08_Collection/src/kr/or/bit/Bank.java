package kr.or.bit;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts; // 계좌(목록)
    
    public Bank(){
        this.accounts = new ArrayList<Account>();
    }
    
    // 계좌생성
    public void addAccount(String accountNo, String name) {     
        accounts.add(new Account(accountNo, name));
    }
    
    // 계좌찾기(계좌번호로)
    public Account getAccount(String accountNo) {
        Account value = null;
        for(Account a : accounts) {
            if(a.getAccountNo().equals(accountNo)) {
                value = a;
            }
        }
        System.out.println(value);
        return value;
    }
    
    // 계좌찾기(이름으로)
    public ArrayList<Account> findAccounts(String name) {
        ArrayList<Account> value = new ArrayList<>();
        for(Account a : accounts) {
            if(a.getName().equals(name)) {
                value.add(a);
            }
        }   
        System.out.println(value);
        return value;
    }
    
    // 계좌목록
    public ArrayList<Account> getAccounts() {
        for(Account a : accounts) {
            System.out.println(a.toString());
        }
        return accounts;
    }
    
    // 총계좌수반환
    public void getTotalAccount() {
        System.out.println("총 계좌 수 : " + accounts.size());         
    }
}
