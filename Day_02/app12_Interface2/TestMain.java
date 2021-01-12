package Day_02.app12_Interface2;

interface X{
    public void a();
}
interface Y{
    public void b();
}
// 인터페이스끼리는 다중상속 가능
interface Z extends X,Y{
    public void c();
}
interface A{
    public static final int NUM = 20;
    int SIZE = 20; // public static final 자동지정
    public abstract void a();
    public abstract void a2();
    public default void b(){
        System.out.println("default method b()");
    }
    public static void c(){
        System.out.println("static method c()");
    }
}

// 인터페이스를 사용하기 위한 임의의  클래스 도움을 받는다.
class AImpl implements A{

    @Override
    public void a() {

    }
    @Override
    public void a2(){

    }
}

public class TestMain {
    public static void main(String[] args) {

        //A a  = new A(); 객체생성 불가
        // 하위클래스를 이용하여 인터페이스 구성요소 사용된다.
        AImpl xxx = new AImpl(); // 다형성
        System.out.println(xxx.NUM);
        System.out.println(xxx.SIZE);
        xxx.a();
        xxx.a2();
        xxx.b();
        A.c(); // 인터페이스명.static메서드

        /**
         *  추상클래스와 인터페이스 비교
         *
         *  1) 추상클래스
         *      - public abstract class 클래스명{}
         *      - 구성요소
         *          - 인스턴스 변수, 생성자, 인스턴스 메서드 --> 일반클래스 요소
         *          - 추상메서드 (abstract)
         *      - 특징
         *          : new 불가 (객체생성 불가)
         *          : 임의의 클래스 이용해서 추상클래스 요소 사용된다.
         *              ==> 임의의 클래스와 추상클래스는 상속관계로서 extends 사용한다.(단일 상속만 지원)
         *      - 목적
         *          : 하위 클래스에서 특정 메서드만 사용하도록 강제 + 일반 클래스의 상속(공통기능 재사용) 장점 제공
         *      - 단점
         *          : 다른 클래스를 상속 불가 ( 하나만 받아야 되기 떄문에 인터페이스로 받으면 여러개 받을 수 있는 장점이 있다.)
         *          : 특정 메소드만 강제할 목적이다 -> 인터페이스로 만드는게 좋다 ( 확장성이 좋기 떄문에 )
         *  2) 인터페이스
         *      - public interface 인터페이스명{}
         *      - 구성요소
         *          - 상수, 추상메서드, default 메서드, static 메서드
         *      - 특징
         *          : new 불가 (객체생성 불가)
         *          : 임의의 클래스 이용해서 인터페이스 요소 사용된다.
         *              ==> 임의의 클래스와 인터페이스는 구현관계로서 implements 사용한다. (다중 구현 가능)
         *          : 인터페이스간에 다중 상속 가능 (extends사용)
         *      - 목적
         *          : 하위 클래스에서 특정 메서드만 사용하도록 강제 + 클래스들간의 의존성 감소(decoupling)
         */
    }
}
