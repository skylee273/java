package Day_04.app1_Supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 2. Supplier
 *  - 파라미터 없고 리턴값 있다.
 *
 *  - 종류
 *      - BooleanSupplier : boolean 타입으로 반환
 *      - DoubleSupplier : double 타입 반환
 *      - IntSupplier : Int 타입  반환
 *      - LongSupplier : Long 타입 반환
 */
public class SupplierTest {
    public static void main(String[] args) {

        Supplier<String> s = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };
        System.out.println("1.Supplier 익명클래스 : " + s.get());

        Supplier<String> s2 = () -> "Hello";
        System.out.println("1.Supplier 익명클래스 람다 : " + s2.get());

        Supplier<Date> d2 = new Supplier<Date>() {
            @Override
            public Date get() {
                return new Date();
            }
        };
        System.out.println("2. Supplier 익명클래스 : " + d2.get());

        Supplier<Date> d3 = Date::new;
        System.out.println("2. Supplier 익명클래스 람다 :" + d3.get());
    }


}
