package Day_03.app2_generics4;

/**
 *
 * 제네릭스(generics)
 * ==> <T>
 *
 * @param <T>
 */
@FunctionalInterface
interface Product2<T> {
    public abstract void setValue(T obj);
}
interface Product<T>{
    public abstract void setValue(T obj);
}
class Car<T> implements Product<T>{
    @Override
    public void setValue(T obj) {
        System.out.println("Car.setValue:" + obj);
    }
}

public class GenericsTest {

    public static void main(String[] args) {

        Car<Integer> car = new Car<Integer>();
        car.setValue(100);

        Product2 product2 = (obj) -> System.out.println("Lambda.setValue");
        product2.setValue(10);

    }

}
