package Day_03.app1_lamda;

public class LambdaTest {
    public static void main(String[] args) {

        // 1. 익명클래스
        Flyer flyer = new Flyer() {
            @Override
            public void fly() {
                System.out.println("익명클래스.fly");
            }
        };
        flyer.fly();

        //2. 람다 표현식 (arrow 표현식)
        Flyer flyer1 = () ->  {
            System.out.println("람다표현식.fly");
        };
        flyer1.fly();

        //2. 람다 표현식 ===> 단일 문장인 경우에는 {}생략가능
        Flyer flyer2 = () -> System.out.println("람다표현식.fly2");
        flyer2.fly();

    } //end main
}//end class
