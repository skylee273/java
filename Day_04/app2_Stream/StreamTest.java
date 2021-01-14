package Day_04.app2_Stream;

/**
 * 스트림?
 *
 * 1. Java I/O
 *  - InputStream
 *  - OutputStream
 *
 * 2. Stream API
 *  - JDK 1.8 지원
 *  - Collection 저장된 데이터를 중간처리 최종처리를 할 수 있다.
 *  - 중간처리 : ( 중복제거, 정렬, Skip,..) ==> 맵 (map)
 *  - 최종처리 : ( 총합, 최대값, 최소값, 갯수, ...) 가 가능하다. ==> 리듀스 (reduce)
 *      ==> 맵/리듀스
 *  - 함수형 인터페이스 API가 사용된다.
 * 3. Stream 타입 얻기
 *  - 컬렉션
 *  - 배열
 *  - 파일
 * 4. 종류
 *  - IntStream
 *  - LongStream
 *  - DoubleStream
 *
 * 5. 중간처리
 *  - 중복제거
 *      - distinct()
 *  - 필터링
 *      - filter()
 *  - 정렬
 *      - sorted()
 *  - 개수제한
 *      - limit(n)
 *  - map()
 *      - 사용자 정의 중간처리
 *
 *  6.최종처리
 *      - 총합
 *      - 개수
 *      - 최대/최소
 *      - collect()
 *  7. Optional 클래스
 *      - 집계값이 존재하지 않을경우 예외가 발생한다.
 *      - 따라서 예외방지용으로 Optional 클래스를 사용할 수 있다.
 *
 *  8. method 사용시 간략한 표현 방법
 *      - static Method
 *      - instance Method
 *
 */

/**
 *
 * 정리순서
 *
 * 1. 인터페이스
 *  - 인터페이스 구성요소 및 특징
 *  - 사용방법 (3가지) (**** 제일중요)
 *      - 이름있는 클래스
 *      - 익명 클래스
 *      - 람다 표현식 (********)
 *
 * 2. 함수형 인터페이스 API
 *  - Consumer : Parameter o, return x
 *  - Supplier : Parameter x, return o
 *  - Function : Parameter o, return x ==> 데이터타입 맵핑용도 ==> (int 전달 String 반환)
 *  - Operator : Parameter o, return x ==> 연산용도 ==> 임의의 타입 전달하고 임의의 타입 반환
 *  - Predicate : Parameter o, return x ==> 리턴값은 boolean 정해져 있다. ==> 임의의 타입전달하고 boolean 반환
 *
 * 3. 컬렉션 API
 *  - Set 계열
 *  - List 계열
 *  - Map 계열
 *
 * 4. 컬렉션 사용시 중간처리 / 최종처리 작업 처리 가능 ===> Stream API
 *  - Stream 얻는 방법
 *  - 중간처리 메서드
 *  - 최종처리 메서드
 *
 *  질문 : System.out::println 사용하는게 먼가?
 *  - 함수형 프로그래밍 사용시 사용되는 축약형 표현
 *
 */

public class StreamTest {
    public static void main(String[] args) {

    }
}
