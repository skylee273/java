package Day_04.app2_Stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //list.add(10);
        // 다음코드는 데이터가 없는데 average() 에러 발생
     /*
        Stream<Integer> stream = list.stream();
        // IntStream 이나 Stream<Integer>이나 같은가요?
        IntStream intStream = stream.mapToInt(Integer::intValue);
        OptionalDouble optionalDouble = intStream.average();
        System.out.println(optionalDouble.getAsDouble());*/

        // 방법1
        OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue).average();
        if(optionalDouble.isPresent()){
            System.out.println("1.평균값 존재 :" + optionalDouble.getAsDouble());
        }else{
            System.out.println(0.0);
        }
        // 방법2 (******************************)
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

    }
}


