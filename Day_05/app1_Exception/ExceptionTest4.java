package Day_05.app1_Exception;

class Account{
    int balance = 100;

    public void withdraw(int amt) throws Exception{
        if(balance >= amt){
            balance -= amt;
        }else{
            // 문제발생 : 시스템은 모른다. (예외 발생안됨)
            throw new Exception("잔액부족");
        }
    }

    public void deposit(int amt){
        balance += amt;
    }
}
public class ExceptionTest4 {
    public static void main(String[] args) {

        System.out.println("start");

        Account acct = new Account();

        try {
            acct.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("잔액 : " + acct.balance);

        System.out.println("end 정상종료");
    }
}
