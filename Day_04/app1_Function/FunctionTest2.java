package Day_04.app1_Function;

import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

public class FunctionTest2 {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };

        BiFunction<String, String, Integer> biFunction1 = (s1,s2) -> s1.length() + s2.length();

        System.out.println("1.BiFunction 익명클래스 : " + biFunction.apply("Hello", "World"));
        System.out.println("2.BiFunction 익명클래스 람다 : " + biFunction1.apply("Hello", "World"));

        DoubleFunction<String> doubleFunction = new DoubleFunction<String>() {
            @Override
            public String apply(double value) {
                return String.valueOf(value);
            }
        };

        DoubleFunction<String> doubleFunction1 = (val) -> String.valueOf(val);
        System.out.println("3.DoubleFunction 익명클래스 : " + doubleFunction.apply(21.4));
        System.out.println("4.DoubleFunction 익명클래스 람다 : " + doubleFunction1.apply(31.4));

    }
}
