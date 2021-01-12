package Day_02.app3_ToParent;

public class TestPet {
    public static void main(String[] args) {

        Cat c = new Cat();

        /**
         *  생성자 호출상태
         *  1. 다른 클래스에서 객체생성시
         *  - new ClassName();
         *
         *  2. 자식클래스에서 부모 생성자 호출
         *  ( 자식클래스 생성자 첫라인에 자동 삽입 )
         *  - super();
         *
         *  3. 같은 클래스의 특정 생성자에서 다른 생성자 호출
         *  - this();
         */
    }
}
