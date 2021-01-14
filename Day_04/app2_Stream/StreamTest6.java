package Day_04.app2_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        IntStream stream = Arrays.stream(nums);
        System.out.println("1. 갯수 : " + Arrays.stream(nums).count());
        System.out.println("2. 합계 : " + Arrays.stream(nums).sum());
        System.out.println("3. 평균 : " + Arrays.stream(nums).average().getAsDouble());
        System.out.println("4. 최대값 : " + Arrays.stream(nums).max().getAsInt());
        System.out.println("5. 최소값 : " + Arrays.stream(nums).min().getAsInt());


    }
}
