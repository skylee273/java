package Day_05.app1_Exception;

public class ExceptionTest2 {
    public static void main(String[] args) {

        System.out.println("start");

        try{
            int num = 0;
            int result = 10/num;
            System.out.println("결과값: " + result);
        }catch (RuntimeException ignored){ // 다형성 적용 가능 -> 권장안함 : ( 가독성이 떨어진다. )
            System.out.println("예외발생: " + ignored.getMessage());
            //ignored.printStackTrace(); // 개발자 디버깅용
        }finally {
            System.out.println("무조건 실행");
        }

        System.out.println("end. 정상종료");
    }
}
