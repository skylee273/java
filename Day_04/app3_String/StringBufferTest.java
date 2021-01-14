package Day_04.app3_String;

public class StringBufferTest {
    public static void main(String[] args) {

        // 참조변수를 print 하면 관련된 값이 먼지 -> 시험
        StringBuffer sb = new StringBuffer();

        //1.추가
        sb.append("Hello");
        sb.append(1);
        sb.append(true);
        sb.append(new char[] { 'A','B'});

        //2.삽입
        sb.insert(0,"Z");

        //3.삭제
        sb.delete(0,4); // 0 ~ 3까지

        //
        System.out.println(sb.charAt(0));
        System.out.println(sb.indexOf("B"));
        System.out.println(sb.substring(4));
        System.out.println(sb.reverse());

        System.out.println(sb);

        //String 저장
        String msg = sb.toString();
        System.out.println(msg);

    }
}
