package Day_05.app7_Main;

public class MainTest {
    public static void main(String[] args) {
        // main 스레드가 항상 백그라운드로 실행중이다.
        System.out.println(Thread.currentThread().getName()); // main
        System.out.println(Thread.currentThread().getPriority()); // 5
        System.out.println(Thread.MAX_PRIORITY); // 변경가능
        System.out.println(Thread.NORM_PRIORITY); // 변경가능
        System.out.println(Thread.MIN_PRIORITY); // 변경가능
    }
}
