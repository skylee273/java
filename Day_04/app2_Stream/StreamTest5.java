package Day_04.app2_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동1","홍길동2","홍길동3","홍길동1","홍길동7","베트맨","정조");
        Stream<String> stream = list.stream();
        // List<String> sortedList = stream.sorted().distinct().filter(n->n.startsWith("홍")).collect(Collectors.toList());
        List<String> sortedList = stream.sorted(Comparator.reverseOrder()).distinct().filter(n->n.startsWith("홍")).limit(2).collect(Collectors.toList());
        System.out.println("1. sorted :" + sortedList);

        ////////////////////////////////////////
        List<String> list2 = Arrays.asList("홍길","홍길동2","홍","홍길동1","홍길동7","베트맨","세종대왕");
        stream = list2.stream();
        List<Integer> lengthList = stream.map(s -> s.length()).collect(Collectors.toList());
        System.out.println("2. map : " + lengthList);


    }
}
