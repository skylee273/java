package Day_05.app8_Sync;

public class BankingClient {
    public static void main(String[] args) {
        Account account = new Account(5000);

        WithDrawThread t = new WithDrawThread("모바일 뱅킹", account, 1000);
        WithDrawThread t2 = new WithDrawThread("ATM", account, 1000);

        t.start();
        t2.start();
    }
}
