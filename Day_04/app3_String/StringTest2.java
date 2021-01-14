package Day_04.app3_String;

import java.util.Arrays;
import java.util.Locale;

public class StringTest2 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("1. 문자열 길이 : " + s.length());
        System.out.println("2. 특정문자 얻기 : " + s.charAt(0));
        System.out.println("3. 부분열 : " + s.substring(1));
        System.out.println("4. 부분열 : " + s.substring(1,s.length() -1 ));
        System.out.println("5. 특정문자위치: " + s.indexOf('e'));
        System.out.println("6. 특정문자위치: " + s.indexOf('X')); // 일치하는 문자 없으면 -1 반환
        System.out.println("7. 문자열연결: " + s.concat("~~~~"));
        System.out.println("8. 대문자: " + s.toUpperCase(Locale.ROOT));
        System.out.println("9. 소문자: " + s.toLowerCase(Locale.ROOT));
        System.out.println("10. 문자열 비교:" + s.equals("hello"));
        System.out.println("11. 문자열 비교:" + s.equalsIgnoreCase("hello"));
        System.out.println("12. 특정문자 포함여부: " + s.contains("H"));
        System.out.println("13. 특정문자 포함여부: " + s.contains("h"));
        System.out.println("14. 문자열 치환: " + s.replace('H', 'Z'));

        String s2 = "     world     ";
        System.out.println("15. 공백제거: " + s2.trim()); // 양쪽 공백제거
        System.out.println("15. 공백제거: " + s2.trim().length()); // 5

        char [] chs = s.toCharArray();
        System.out.println("16. 문자배열: " + Arrays.toString(chs));

        // 구분자 분리
        String s3 = "aaa/bbb/ccc";
        String [] strArr = s3.split("/");
        System.out.println("17. 구분자 분리: " + Arrays.toString(strArr));

        String xyz = s.replace('H','X');

        System.out.println(s);
        System.out.println(xyz);

        // 원본
        System.out.println(s);

        /**
         * String 가장 큰 특징은 변경 불가
         * 따라서 다양한 메서드로 처리하면 새로운 문자열이 매번 생성된다.
         * StringBuffer/StringBuilder ==> 자신이 변경된다. ==> 메모리 관리 효율적
         */




    }
}
