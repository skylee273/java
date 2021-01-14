package Day_04.app1_Function;

import java.util.function.Function;

/**
 * 4. Function
 *  - 파라미터 있고 리턴값 있는 경우
 *  - 특정 데이터타입으로 파라미터 전달해서 임의의 데이터 타입으로 반환하도록 맵핑하는 용도로 사용된다.
 *  - ( 예 int --> String )
 *
 *  * 종류
 *      - BiFunction<T,U,R> : T와 U 전달하고 R 타입으로 반환
 *      - DoubleFunction<R> : double로 전달하고 R타입으로 반환
 *      - IntFunction<R> : Int로 전달하고 R타입으로 반환
 *      - IntToDoubleFunction : int로 전달하고 double 타입으로 반환
 *      - IntToLongFunction : int로 전달하고 long 타입으로 반환
 *      - LongToIntFunction : long로 전달하고 int 타입으로 반환
 *
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer>  f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        System.out.println("1.Function 익명클래스 : " + f.apply("100"));

        Function<String,Integer> f1 = (s) -> s.length();
        System.out.println("1.Function 익명클래스 : " + f1.apply("200"));

        Function<String, Boolean> f2 = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                return s.length() == 5;
            }
        };

        System.out.println("2.Function 익명클래스 : " + f2.apply("Hello"));

        Function<String, Boolean> f4 = (s) -> s.length() == 5;

        System.out.println("2.Function 익명클래스 람다 : " + f4.apply("ABC"));
    }
}
