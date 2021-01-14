package Day_04.app2_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동1","홍길동1","홍길동1","홍길동1","홍길동1","베트맨","정조");


        //1.전체출력
        Stream<String> stream = list.stream();
        stream.forEach(s-> System.out.println("1.전체출력 : " + s));
        System.out.println("////////////////////////////////////");
        //2.중복제거
        stream = list.stream(); // 다시 가져와야 하는 이유 ( 내부 반복자를 이용해 끄집어 내는데 그다음에 반복하면 더이상 반복하면 반복할게 없다.)
        stream.distinct().forEach(s-> System.out.println("2.중복제거 출력 : " + s));

        //3.중복제거 후 리스트로 반환
        stream = list.stream();
        List<String> distinctList = stream.distinct().collect(Collectors.toList()); // List로 반환해줌
        System.out.println("3.중복제거 후 List 반환:"+distinctList);

        //4.필터링 '베' 로 시작하는 값 반환?
        List<String> list2 = Arrays.asList("홍길동","베트맨","정조","베트맨");
        Stream<String> stream1 = list2.stream();

        List<String> filterList = stream1.filter(n->n.startsWith("베")).distinct().collect(Collectors.toList());
        System.out.println("4.'이' 로 시작하는 값 반환:"+filterList);

        // 중복제거 + 필터링
        List<String> list3 = Arrays.asList("홍길동","베트맨","정조","베트맨");
        stream = list3.stream();
        List<String> filter = stream.filter(n->n.startsWith("베")).distinct().collect(Collectors.toList());
        System.out.println("4.중복제거하고 '이' 로 시작하는 값 반환:"+filter);
    }
}
