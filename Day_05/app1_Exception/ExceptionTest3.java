package Day_05.app1_Exception;

// 어디서 예외가 일어나는지 모름
class Test{
    public void a() throws ArithmeticException, NullPointerException{
        b();
    }
    public void b() throws ArithmeticException, NullPointerException{
        int num = 0;
        int result = 10/num;
        System.out.println("결과값: " + result);

        // 실행 문장 ==> NullPointerException
    }

    /**
     * 코딩할때는 어떤 오류가 나올지 모르는데 어떻게 한개를 골라서 throws 넣어줘야 하나요?
     * ==>
     */
}
public class ExceptionTest3 {
    public static void main(String[] args) {
        System.out.println("start");

        try{
            Test t = new Test();
            t.a();

        }catch (ArithmeticException | NullPointerException runtimeException){
            System.out.println("예외처리 : " + runtimeException.getMessage());
        }

        System.out.println("end : 정상종료");
    }
}
