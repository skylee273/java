package Day_03.app1_lamda;

public class LambdaTest3 {

    public static void main(String[] args) {
        //1. 익명클래스
        Flyer3 f = new Flyer3() {
            @Override
            public void fly(int n, int n2) {
                System.out.println("익명클래스.fly"+ n + "\t" + n2);
            }
        };
        f.fly(10,30);


        //2.람다표현식
        Flyer3 f2 = (int n, int n2) -> System.out.println("람다표현식.fly" + n + "\t" + n2);
        f2.fly(10,20);

        //3. 람다표현식
        Flyer3 f3 = (n, n2) -> System.out.println("람다표현식.fly" + n + "\t" + n2);
        f3.fly(30,40);

    }

}
