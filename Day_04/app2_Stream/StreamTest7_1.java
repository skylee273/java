package Day_04.app2_Stream;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

class Calculator{
    public int method(int x, int y) { return x + y; }
    public void method(int x) {
        System.out.println();
    }
}
public class StreamTest7_1 {
    public static void main(String[] args) {

        //1. 인스턴스 메서드 ===> 참조변수::메서드명
        Calculator cal = new Calculator();
        BinaryOperator<Integer> operator = cal::method;
        System.out.println(operator.apply(100,200));


        Calculator cal2 = new Calculator();

        IntConsumer ic = cal2::method;
        ic.accept(100);

        IntConsumer ic2 = System.out::println;
        ic2.accept(200);
    }
}
