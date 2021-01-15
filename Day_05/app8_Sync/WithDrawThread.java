package Day_05.app8_Sync;

public class WithDrawThread extends Thread{
    Account account;
    int money;
    boolean flag = true; // 반복 중단 목적

    public WithDrawThread(String name, Account account, int money){
        super(name);
        this.account = account;
        this.money = money;
    }

    public void run(){
        for(int i = 0; i < 6 || flag; ++i){
            int balance= account.withdraw(money);
            if(balance <  money) flag = false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
