package Day_03.app1_lamda;

public class TestMain {

    public static void main(String[] args) {
        /**
         *
         * 람다(lambda) 식
         *
         * 1. 함수형 프로그래밍 언어에 적합한 표현식. ( JDK 1.8)
         *  * 함수형 프로그래밍(functional Programming)
         *  ==> 함수 기반으로 프로그래밍을 하자.
         *  ==> 자바는 최소단위 클래스이다. ==> 따라서 하나의 메서드가 필요한 경우에도 반드시 클래스가 필요하다.
         *  - 불필요한 클래스를 매번 생성해야 한다. ==> 비효율적이다.
         *  - 해결은 매서드만 집중해서 표현할 수 있는 람다식 이용한다.  ===> 실행하면 런타임때 익명클래스가 자동으로 생성된다.
         *  - java 는 A라는 메소드 사용하려면 최소 A를 감싸는 클래스를 만들어야 한다.
         *  - 람다를 이용하면 A라는 것만 이용할 수 있다.
         *  - 람다를 실행할때 익명 클래스가 만들어진다 겉으로 보여지진 않지만 클래스가 만들어지는 것이기 때문에 내부적으로는
         *  최소 단위인 클래스를 이용한다고 볼 수 있다.
         *
         * 2. 람다식의 특징
         *  - 객체가 아닌 기능적인 코드(메서드)에 집중하자.
         *  - 간결한 표현식
         *  - 하나의 메서드를 가진 인터페이스 사용시 일반적으로 람다식이 사용된다. (******)
         *  - 특정 인터페이스가 하나의 추상메서드를 가지는 것을 강제할 방법으로 @FunctionalInterface 사용한다.
         *
         *
         * 3. 람다식의 문법
         *   ====> 인터페이스를 활용한 익명클래스의 또 다른 표현식이라고 생각하자.
         *   ====> 메서드의 기능에 따라서 람다식 표현이 달라진다.
         *
         *   - 메서드문법
         *      - public returnType 메서드명([val1, val2..])
         *          문장;
         *          [return 값;]
         *        }
         *   - 메서드 기능에 따른 종류 4가지
         *      - 파라미터 변수 없고 리턴값 없는 경우
         *      - 파라미터 변수 없고 리턴값 있는 경우
         *      - 파라미터 변수 있고 리턴값 없는 경우
         *      - 파라미터 변수 있고 리턴값 있는 경우
         */

    }
}
