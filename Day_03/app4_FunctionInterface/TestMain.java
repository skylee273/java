package Day_03.app4_FunctionInterface;

public class TestMain {
    public static void main(String[] args) {
        /**
         *
         * 함수적 인터페이스 API
         *
         * 1. JDK 1.8지원
         * 2. java.util.function 패키지 포함되고 모두 interface로 구성됨
         *      ==> interface 사용할려면
         *          - 이름있는 클래스
         *          - 익명 클래스
         *          - 람다 함수 (*****)
         *
         *  종류 5가지
         *  - Consumer
         *      - 파라미터 있고 리턴값 없는 경우
         *  - Supplier
         *      - 파라미터 없고 리턴값 있는 경우
         *  - Function
         *      - 파라미터 있고 리턴값 있는 경우
         *      - 전달하는 파라미터의 타입과 리턴되는 리턴값의 타입 맵핑(*)용도
         *          -> 예 int -> String, String -> int, String,String -> int ..
         *  - Operator
         *      - 파라미터 있고 리턴값 있는 경우
         *      - 전달하는 파라미터를 연산(*)해서 임의의 값으로 리턴하는 용도
         *      - 내부적으로 Function 상속받음
         *  - Predicate
         *      - 파라미터 있고 리턴값(boolean) 있는 경우
         *  ===> 공통적으로 추상 메서드가 선언되어 있다.
         *  ===> 기능적으로 모든 메서드는 4가지 형태로 되어 있다.
         *      - 파라미터 없고 리턴값 없는
         *      - 파라미터 없고 리턴값 있는
         *      - 파라미터 있고 리턴값 없는
         *      - 파라미터 있고 리턴값 있는
         *
         *  ===> 위 4가지 기능을 구현하고자 한다면 직접 클래스로 구현하지 말고 상위의 함수적 인터페이스를 사용하자.(****)
         *
         */
    }
}
