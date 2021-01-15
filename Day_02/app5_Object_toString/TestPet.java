package Day_02.app5_Object_toString;

public class TestPet {
    public static void main(String[] args) {
        Cat c = new Cat("나비", 2, "블랙");
        Dog d = new Dog("망치", 1, "수컷");

        System.out.println("고양이 정보 : "  + c);
        System.out.println("고양이 정보2 : " + c.toString());
        System.out.println("강아지 정보 : " + d);

        /**
         *  Object의 ToString()
         *
         *  1.참조변수를 println 할때 자동으로 호출된다.
         *  - 참조변수는 주소값이 저장되어있는데
         *  - print하면 콘솔(console)에 문자열로 출력시키기 위해서
         *  toString() auto call.
         *
         *  2. Object의 toString() 구현
         *  - return 클래스명@16진수
         *
         *  3. 결론은 모든 사용자 정의 클래스 Object의 toString 재정의하자.
         *  ==> 명시적인 메서드 호출없이 원하는 객체정보를 출력할수 있다.
         *
         *  4. toString
         */


    }
}
