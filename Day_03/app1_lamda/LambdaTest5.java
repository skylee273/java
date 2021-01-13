package Day_03.app1_lamda;

public class LambdaTest5 {
    public static void main(String[] args) {

        //1. 익명 클래스
        Flyer5 f = new Flyer5() {
            @Override
            public int fly(int n, int n2) {
                return n + n2;
            }
        };


        System.out.println("익명클래스.fly" + f.fly(10,20));

        //2.람다 표현식
        Flyer5 f2 = (int n, int n2) -> { return n + n2; };
        System.out.println("람다표현식.fly" + f.fly(30,40));

        //3.람다표현식
        Flyer5 f3 = Integer::sum;
        System.out.println("람다표현식.fly" + f3.fly(80,40));
    }
}
