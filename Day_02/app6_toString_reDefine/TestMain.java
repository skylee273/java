package Day_02.app6_toString_reDefine;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        /**
         * API : 시스템 제공한 클래스 의미 ==> 패키지로 제공
         * API 문서 : https://docs.oracle.com/javase/8/docs/api/index.html
         *
         */

        Date d = new Date();
        System.out.println(d); // d.toString() 동일

        List<String> list = Arrays.asList("aa", "bb");
        System.out.println(list);

        // 결론 : Object의 toString() 메서드는 거의 모든 API가 재정의 했다.따라서 @16진수가 아닌 실제값이 출력된다.

    }
}
