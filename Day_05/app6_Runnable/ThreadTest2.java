package Day_05.app6_Runnable;

public class ThreadTest2 {
    public static void main(String[] args) {

        //2.익명클래스
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while(true) System.out.println("go");
            }
        };

        //3.람다표현식
        Runnable runnable1 = () -> { while(true) System.out.println("Come"); };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }
}
