package Day_05.app1_Exception;

public class ExceptionTest {

    /**
     * 1. 예외(exception)
     * - 프로그램 실행중에 발생되는 의도하지 않은 문제
     * - 예외가 발생되면 가장 큰 문제는 프로그램이 '비정상 종료' 된다.
     * - 결국 예외발생코드의 이후의 실행문은 실행되지 못하게 된다.
     *
     * 2. 예외처리 ( exception handling )
     * - 예외 발생코드의 이후의 실행문을 계속 실행하도록 처리 ('정상종료' 의미)
     * - 잘못된 이해 : 예외가 발생된 코드를 수정해서 다시 실행하는 것 이다.  (불가능 -> 순차문이기 때문에 )
     *
     * 3. 예외처리 방법
     *  - 예외처리 담당하는 클래스 제공하고 계층 구조
     *                          Throwable
     *                              |
     *               Error                    Exception
     *                                           |
     *                      RuntimeException          IOException( 비 Runtime 계열)
     *                            |                             |
     *                  ArithmeticException             FileNotFoundException
     *                  NullPointException              ....
     *                  ClassCastException
     *  - Runtime 계열은 예외처리(try ~ catch 또는 throws) 방법으로 예외처리를 하지 않는다.
     *  - Runtime 예외가 발생되면 안되는 코드이다.  -> 조건체크를 해야한다. (compile unchecked 예외)
     *  - 비 Runtime 계열은 반드시 예외처리를 ( try ~ catch 또는 throws ) 해야된다.
     *    안하면 컴파일 에러발생되고 어떤 예외처리 클래스인지 알려준다.
     *
     *  - 예외 클래스 활용한 예외처리 2가지 방법
     *      - A : 예외가 발생된 곳에서 예외처리
     *          try{
     *              예외발생 코드1 -> 예외클래스 1 형태의
     *              예외발생 코드2 -> 예외클래스 2 형태의 예외발생
     *          }catch(예외클래스 변수(e)){
     *              예외처리 코드 ===> 예외 발생된 이유를 친절하게 쉽게 이해할 수 있도록 메시지를 출력 해주는게 가장 베스트
     *          }catch(){
     *
     *          }catch(Exception e){
     *              다중 catch 쓸때는 마지막 Exception 어떤 예외가 발생할지 모르기 때문에 이미 가정한 시나리오 예외는 Catch 안에서 클래스로 표현
     *          }finally{
     *              반드시 수행되는 문장 : 파일이나 DB 연결을 종료 ( 자원 반납 )
     *          }
     *
     *  - B : 예외가 발생된 곳에서 예외처리하지 않고 위임하는 방법
     *          - throws 예외클래스 - 시험문제
     *
     *  * 사용자가 필요시 강제적으로 예외발생 --> 비정상종료
     *      -> throws 예외 클래스 => 메서드 이용해서 예외처리 위임
     *      -> throw new 예외 클래스 (msg);
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("start");

        int num = 2;
        int result = 10/num;
        System.out.println("결과값: " + result);

        System.out.println("end. 정상종료");
    }

}
