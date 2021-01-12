package Day_02.app11_Interface;

public class Bird extends Pet implements Flyer{

    /**
     * 날아 다니는 기능 메서드 fly() 어디에 추가?
     * 1. Pet 클래스 추가
     *  - fly 기능이 없는 Cat, Dog 문제가 된다.
     *
     * 2. Bird 클래스 추가
     *  - fly()
     *  - Bird2() class -> fly2()
     *  - 메소드 많아짐 강제해야됨
     *
     *  3. InterFace
     */
    double weight; // 고유 속성

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Bird(){

    }

    public Bird(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Bird.eat");
    }
    @Override
    public void sleep() {
        System.out.println("Bird.sleep");
    }


    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }
}
