package Day_04.app2_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        //1.배열
        String [] names = {"홍길동", "이순신", "유관순"};

        // 가. for문 - 외부 반복자
        for (String s : names){
            System.out.println("1. " + s);
        }

        // 나. 내부반복자 ( 성능이 좋다.)
        Stream<String> stream = Arrays.stream(names);
        stream.forEach(s -> System.out.println("1. " + s));

        //2.컬렉션
        List<String> list = Arrays.asList("세종대왕", "정조", "베트맨");

        Stream<String> stream1 = list.stream();
        stream1.forEach(s -> System.out.println("2. " + s));


    }
}
