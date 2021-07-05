package kr.or.bit;

import java.util.Calendar;

public class Transaction {
    private String transactionDate; // 거래날짜
    private String transactionTime; // 거래시간
    private String kind; // 입출금(거래종류)
    private long amount; // 거래금액
    private long balance; // 잔고
    
    public Transaction(String kind, long amount, long balance) {
        Calendar cal = Calendar.getInstance();
        // 년,월,일
        transactionDate = cal.get(Calendar.YEAR)+"-"
                        +(cal.get(Calendar.MONTH)+1)+"-"
                         +cal.get(Calendar.DATE);
        // 시,분,초
        transactionTime = cal.get(Calendar.HOUR)+":"
                         +cal.get(Calendar.MINUTE)+":"
                         +cal.get(Calendar.SECOND);

        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
                + kind + ", amount=" + amount + ", balance=" + balance + "]";
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    
}
