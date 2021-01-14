package Day_04.app3_String;

public class StringTest {
    public static void main(String[] args) {


       // 문자열 생성 방법 ( 시험 3문제 )
       // 1. 값만 이용 ==> 동일한 문자열은 재사용
       String s = "hello";
       String s2 = "hello";

       System.out.println("주소값 비교:" + (s == s2));
       System.out.println("실제값 비교:" + s.equals(s2));
       // 2. new 이용 ===> 매번 Heap 메모리에 생성
       String  x = new String("Hello");
       String x2 = new String("Hello");
       System.out.println("주소값 비교 : " + (x == x2));
       System.out.println("실제값 비교 : " + x.equals(x2));

       // 문자열이 같냐고
    }
}
