package Day_04.app1_Supplier;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class SupplierTest2 {

    public static void main(String[] args) {

        BooleanSupplier s = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return false;
            }
        };

        System.out.println(s.getAsBoolean());

        BooleanSupplier s2 = () -> true;
        System.out.println(s2.getAsBoolean());

        int num = 7;

        s2 = () -> num % 2 == 0 ? true : false;
        System.out.println(s2.getAsBoolean());

        IntSupplier i = () -> Integer.MAX_VALUE;
        System.out.println(i.getAsInt());


    }
}
