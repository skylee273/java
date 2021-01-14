package Day_04.app1_Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {

        // 1.and()
        // 문제 : 지정된 변수값이 2의 배수이고 3의 배수이냐?

        int num = 6;
        IntPredicate intPredicate = value -> value % 2 == 0;
        IntPredicate intPredicate1 = value -> value % 3 == 0;

        IntPredicate result = intPredicate.and(intPredicate1);

        System.out.println("1.정수 6이 2의배수이고 3의배수이냐? : " + result.test(num));
        System.out.println("1.정수 10이 2의배수이고 3의배수이냐? : " + result.test(10));

        // 2.or()
        // 문제 : 지정된 문자열 길이가 5이거나 첫글자가 A이냐?
        Predicate<String> predicate = value -> value.length() == 4;
        Predicate<String> predicate1 = value -> value.contains("A");
        Predicate<String> predicate2 = predicate.or(predicate1);

        System.out.println("2.Hello 길이가 5이거나 H를 포함하는가? : " + predicate2.test("Hello"));

        // 3.negate() : ! 연산자 대응
        // 문제 : 지정된 문자열 길이가 5가 아니냐?
        Predicate<String> predicate3 = val -> val.length() == 5; // true
        Predicate<String> predicate4 = predicate3.negate(); // false;

        System.out.println("3.지정된 문자열 길이가 5가 아니냐? : " + predicate4.test("Hello"));



    }
}
