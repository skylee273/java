package Day_05.app6_Runnable;

class Go implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("Go");
        }
    }
}
class Come implements Runnable{
    public void run(){
        while (true)
            System.out.println("Come");
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        Go go = new Go();
        Come come = new Come();

        // 진짜 스레드 생성
        Thread thread = new Thread(go);
        Thread thread1 = new Thread(come);

        thread.start();
        thread1.start();
    }
}
