package Day_03.app2_generics5;

import java.util.Arrays;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        // 문자열 저장 리스트
        List<String> list = Arrays.asList("홍길동", "이순신");

        // 정수 저장 리스트
        List<Integer> list2 = Arrays.asList(10,30,40);

        printData(list);
        printData(list2);
    }

    public static void printData(List<?> obj){
        System.out.println(obj);
    }
}
