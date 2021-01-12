package Day_02.app9_Abstract;

public class TestPet {
    public static void main(String[] args) {
        Cat c = new Cat("나비", 2, "블랙");
        Dog d = new Dog("망치", 1, "수컷");

        System.out.println("고양이 정보 : "  + c);
        c.eat();
        c.sleep();
        System.out.println("강아지 정보 : " + d);
        d.dog_eat();
        d.dog_sleep();

        // method가 많아짐 비효율적 (Cat은 재정의 했지만 Dog은 나름대로 메소드 추가함)
        // 잘 따라주면 좋은데 안따라주는 것이 있다. -> 강제적으로 부모 메소드 기능 사용하도록
    }

}
