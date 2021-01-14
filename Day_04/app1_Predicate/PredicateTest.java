package Day_04.app1_Predicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Predicate
 *  - 파라미터 있고 boolean 리턴값 있는 경우
 *
 * 종류
 *  - BiPredicate -> 두개의 파라미터 전달하고 boolean 리턴
 *  - DoublePredicate --> 하나의 double 전달하고 boolean 리턴
 *  - IntPredicate --> 하나의 int 전달하고 boolean 리턴
 *  - LongPredicate --> 하나의 long 전달하고 boolean 리턴
 *
 *  *논리연산자 역할의 메서드
 *   1) and () : && 연산자 대응
 *   2) or () : || 연산자 대응
 *   3) negate() : ! 연산자 대응
 *
 *
 */
public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String>  predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()== 5;
            }
        };
        boolean result = predicate.test("Hello");
        System.out.println("1.Predicate 익명 클래스:" + result);

        Predicate<String> s2 = t -> t.length()==5;
        boolean result2 = s2.test("Hello");
        System.out.println("1.Predicate 람다표현식:" +result2);

        BiPredicate<String, Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return s.length() == integer;
            }
        };

        System.out.println("2.BiPredicate 익명 클래스:" + biPredicate.test("Hello", 5));

        BiPredicate<String, Integer> biPredicate1 = (str, num) -> str.length() == num;

        System.out.println("2.BiPredicate 익명 클래스 람다 : " + biPredicate1.test("hello", 5));

        IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value == 4;
            }
        };

        System.out.println("3.IntPredicate 익명 클래스 : " + intPredicate.test(33));

        IntPredicate intPredicate1 = (val) -> val == 4;
        System.out.println("4.IntPredicate 익명 클래스 람다 " + intPredicate1.test(4));

    }
}
