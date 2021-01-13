package Day_03.app3_Collection.List;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        // List 계열 : 순서 있고 중복 가능, ArrayList 클래스 이용

        // 1. 생성
        ArrayList<String> list = new ArrayList<>();

        // 2. 데이터 저장 (추가)
        list.add("홍길동");
        list.add("이순신");
        list.add("유관순");
        list.add("홍길동");
        list.add("베트맨");

        // 3. 데이터 삽입
        list.add(0,"강감찬");

        //4. 데이터 수정
        list.set(0, "세종");

        //5. 데이터 삭제
        list.remove(0);
        list.remove("유관순");

        //6. 모든 데이터 삭제 list.clear();

        // 데이터 출력
        System.out.println("1. 데이터 출력방법 : toString():" + list);

        for (String string: list) {
            System.out.println("2. 데이터 출력방법 : forEach(): " + string);
        }

        System.out.println("3. 개별적인 위치값 출력 : " + list.get(0));
        System.out.println("3. 개별적인 위치값 출력 : " + list.get(3));

        // java.util.Iterator API 활용 ==> 컬렉션에 저장된 데이터를 순회화면서 값을 얻어올 때 사용된다.
        // 일관된 방법으로 데이터를 얻어올수 있다.
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("5. Iterator: " + iterator.next());
        }

        // 추가 메서드
        System.out.println("6. 리스트 길이:" + list.size());
        System.out.println("7. 값의 존재 여부:" + list.contains("정조"));
        System.out.println("7. 값의 존재 여부:" + list.contains("베트맨"));


        Object [] obj = list.toArray();
        // obj가 가리키고 있는 것은 어떤 -> 배열임 (임의의 배열) obj 0x100 을 가리키고 있다 ->
        //String [] obj = list.toArray(new String[0]);
        System.out.println("8. 배열로 변경:" + Arrays.toString(obj));
        System.out.println("9. 특정 값의 위치:" + list.indexOf("베트맨"));

        // 부분 리스트
        List<String> subList = list.subList(1, list.size());
        System.out.println("10. 부분리스트: " + subList);

        list.clear();
        System.out.println("11. 전체 삭제:" + list);

    }
}
