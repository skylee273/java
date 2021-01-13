package Day_03.app1_lamda;

public class LambdaTest4 {
    public static void main(String[] args) {

        //1.익명클래스
        Flyer4 fly = new Flyer4() {
            @Override
            public int fly() {
                return 6;
            }
        };
        System.out.println("익명클래스.fly" + fly.fly());

        //2. 람다 표현식
        Flyer4 fly2 = () -> {
            System.out.print("람다표현식.fly");
            return 999;
        };
        int result2 = fly2.fly();
        System.out.println(result2);

        //3. 람다표현식 // {} return 키워드 생략 가능
        Flyer4 fly3 = () -> 3;
        System.out.println("람다표현식3.fly" + fly3.fly());


    }
}
