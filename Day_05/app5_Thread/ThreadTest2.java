package Day_05.app5_Thread;


class Go extends Thread{
    public void run(){
        while (true){
            System.out.println("Go");
        }
    }
}
class Come extends Thread{
    public void run(){
        while (true)
            System.out.println("Come");
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {

        Go g = new Go();
        Come c = new Come();

        g.start();  // 내부적으로 시스템이 자동으로 run() 호출
        c.start();

    }
}
