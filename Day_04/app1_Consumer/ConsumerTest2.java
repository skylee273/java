package Day_04.app1_Consumer;

import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;

public class ConsumerTest2 {
    public static void main(String[] args) {

        BiConsumer<String,Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String t, Integer u) {
                System.out.println(t + "\t" + u);
            }
        };
        biConsumer.accept("biConsumer", 200);
        DoubleConsumer d = new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println(value);
            }
        };
        d.accept(3.14);

        ObjDoubleConsumer<String> obj= new ObjDoubleConsumer<String>() {
            @Override
            public void accept(String s, double value) {

            }
        };

        obj.accept("Hello", 3.14);

        BiConsumer<String, Integer> b2 = (t,u) -> System.out.println(t + "\t" + u);
        b2.accept("hello", 100);

        DoubleConsumer d2 = t -> System.out.println(t);
        d2.accept(3.14);

        ObjDoubleConsumer<String> obj2 = (t,u) -> System.out.println(t + "\t" + u);
        obj2.accept("hello", 3.14);

    }
}
