package Day_04.app1_Operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Operator
 * - 파라미터 있고 리턴값 있는 경우
 *  - 내부적으로 Function 상속받음
 *
 * * 종류
 * BinaryOperator<T> : BiFunction<T,U,R> 상속
 * - 두개의 파라미터 전달하고 반환 ( 모두 데이터 타입 동일 )
 * UnaryOperator<T> : Function<T,R> 상속
 * - 하나의 파라미터 전달하고 반환 ( 모두 데이어 타입 동일 )
 * DoubleBinaryOperator
 * - 두개의 파라미터 double로 전달하고 double 반환 (모두 데이터 타입 동일)
 * DoubleUnaryOperator : 하나의 파라미터 전달하고 double 반환
 *
 * 시험 : static / lambda / String / 개념 ( 대부분 ) 5가지 함수적 인터페이스증 3개는 공통 2개는 다른거
 *
 */

public class OperatorTest {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s.charAt(0) + "\t" + s2.charAt(0);
            }
        };

        System.out.println("1.BinaryOBinaryOperatorperator 익명클래스 : " + binaryOperator.apply("Hello", "World"));

        BinaryOperator<String> binaryOperator1 = (s1,s2) -> s1.charAt(0) + "\t" + s2.charAt(0);

        System.out.println("2.binaryOperator 익명클래스 람다 : " + binaryOperator1.apply("Hell", "Zero"));

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        System.out.println("3.UnaryOperator 익명클래스 : " + unaryOperator.apply(20  ));

        UnaryOperator<Integer> unaryOperator1 = (num) -> num * 2;

        System.out.println("4.UnaryOperator 익명클래스 람다 : " + unaryOperator1.apply(40));



    }

}
