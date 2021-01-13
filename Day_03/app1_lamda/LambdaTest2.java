package Day_03.app1_lamda;

public class LambdaTest2 {
    public static void main(String[] args) {

        // 1. 익명클래스
        Flyer2 fly = new Flyer2() {
            @Override
            public void fly(int n) {
                System.out.println("익명클래스 n = " + n);
            }
        };

        fly.fly(10);

        //2. 람다표현식
        Flyer2 fly2 = (int n) -> System.out.println("람다표현식 n = " + n);
        fly2.fly(20);

        //3. 람다표현식 ==> 데이터 타입 생략
        Flyer2 fly3 = (n) -> System.out.println("람다표현식 n = " + n);
        fly3.fly(30);

        //4. 람다표현식 ==> 파라미터변수가 하나인 경우에는 () 생략가능
        Flyer2 fly4 = n -> System.out.println("람다표현식 n = " + n);
        fly4.fly(40);

    }
}
