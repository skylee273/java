package Day_03.app1_lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaTest6 {
    public static void main(String[] args) {

        //1.기존방식
        String [] names = {"John", "Zen", "Ada", "Bob"};
        Arrays.sort(names);
        System.out.println("1.오름차순 정렬:" + Arrays.toString(names));

        //내림차순 정렬 ==> java.util.Comparator 인터페이스 활용

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순 정렬
            }
        };

        Arrays.sort(names, comparator);
        System.out.println("2.내림차순 정렬:" + Arrays.toString(names));

        // 아래 방식과 같이 사용하는게 일반적
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순 정렬
            }
        });
        System.out.println("2.내림차순 정렬:" + Arrays.toString(names));

        Arrays.sort(names, (String o1, String o2) -> o2.compareTo(o1));
        System.out.println("3.내림차순(람다) 정렬:" + Arrays.toString(names));

        Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));
        System.out.println("3.내림차순(람다) 정렬:" + Arrays.toString(names));


    }
}
