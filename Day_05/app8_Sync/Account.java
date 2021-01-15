package Day_05.app8_Sync;

/**
 * 국민은행
 *
 * 계좌
 *  - PC 인터넷 뱅킹 (스레드)
 *  - 모바일 뱅킹 (스레드)
 *  - ATM (스레드)
 *  -
 *
 *
 */


public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public synchronized int deposit(int amt){
        return balance += amt;
    }
    public synchronized int withdraw(int amt){
        String name = Thread.currentThread().getName();
        if(balance >= amt) {
            balance -= amt;
            System.out.println(name + "출금 잔액=>" + balance);
        }
        else{
            System.out.println("잔액 부족으로 출금 불가=>" + balance);
        }
        return balance;
    }
}
