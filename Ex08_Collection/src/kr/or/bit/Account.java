package kr.or.bit;

import java.util.ArrayList;

public class Account {
    private String accountNo; // 계좌번호
    private String name; // 소유자명
    private long balance; // 잔고
    private ArrayList<Transaction> transactions; // 거래내역
    
    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        balance = 0;
        transactions = new ArrayList<Transaction>();
    }
    
    // 입금
    public void deposit(long amount) {
        balance += amount;
        occurTransaction(amount, "입금");
    }
    
    // 출금
    public void withdraw(long amount) {
        balance -= amount;
        occurTransaction(amount, "출금");
    }
    
    // 거래발생
    private void occurTransaction(long amount, String kind) {       
        Transaction transaction = new Transaction(kind, amount, balance);
        transactions.add(transaction);
        System.out.println(amount + "원 " + kind);
        System.out.println("현재 잔액 : " + getBalance());
    }
    
    // 거래내역확인
    public ArrayList<Transaction> getTransactions() {
        for(Transaction t : transactions) {
            System.out.println(t);
        }        
        return transactions;
    }
    
    public String getAccountNo() {        
        return accountNo;
    }    
    
    public String getName() {
        return name;
    } 
    
    public long getBalance() {  
        return balance;
    }
    
    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
                + transactions + "]";
    }    
}
