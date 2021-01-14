package Day_04.app1_Consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *  함수적(형)인터페이스 API ===> 컬렉션 stream API에서 활용
 *
 *  1) Consumer 인터페이스
 *      - 파라미터 있고 리턴값은 없다.
 *  2) 종류
 *   BiConsumer => 파라미터를 2개 받아서
 *   IntConsumer ==> int 타입으로 처리
 *   DoubleConsumer => double 타입으로 파라미터를 받아서 처리
 *   LongConsumer
 *   ObjDoubleConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 double
 *   ObjIntConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 double
 *   ObjLongConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 double
 *
 */
class Person{
    int age;
}
public class ConsumerTest {
    public static void main(String[] args) {

        //1. 익명 클래스
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("1. Consumer : " + s);
            }
        };
        consumer.accept("Hello");

        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("2. Consumer : " + integer);
            }
        };
        consumer1.accept(100);

        Consumer<String> consumer2 = (obj) -> System.out.println("3. Consumer Lambda : " + obj);
        consumer2.accept("World");


    }
}
