package Day_02.app14_Anonymous;

/**
 * 1) 중첩 클래스 (nested Class)
 *  class Outer{
 *      ..
 *      ..
 *      ..
 *      class Inner{
 *
 *      }//end Inner
 *  }
 *
 *  - member inner class
 *  - local inner class
 *  - static inner class
 *  - 익명 클래스
 *
 * 2) 익명 클래스 (Anonymous class)
 *  - 이름이 없는 클래스
 *  - 인터페이스 사용시 주로 익명클래스 사용됨 ( 가독성이 높아지기 때문에 )
 *
 */

interface Xyz{
    public abstract void a();
    public abstract void b();
    public abstract void c();
}
@FunctionalInterface //반드시 하나의 추상메서드만 설정할 수 있게 강제하는것. ==> 람다는 추상메서드가 반드시 하나여야 된다.
interface Flyer{
    public abstract void fly();
}
//1. 이름이 있는 클래스
class Bird implements Flyer{
    @Override
    public void fly(){
            System.out.println("Bird.fly");
    }
}

public class Anonymous {

    public static void main(String[] args) {

        //1. Bird 생성 사용
        Flyer f = new Bird();
        f.fly();

        //2. 익명 클래스
        /**
         * 인터페이스명 변수명  = new 인터페이스명(){
         *     // 메서드 재정의
         * }
         */

        Flyer f2 = new Flyer() {
            @Override
            public void fly() {
                System.out.println("익명클래스.fly");
            }
        };
        f2.fly();

        // 이클립스 자동완성
        Flyer f3  = new Flyer() {
            @Override
            public void fly() {
                System.out.println("익명클래스.fly(자동완성)");
            }
        };
        f3.fly();
    }

}
