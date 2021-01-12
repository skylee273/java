package Day_02.app11_Interface;

public class TestPet {
    public static void main(String[] args) {
        Cat c = new Cat("나비", 2, "블랙");
        Dog d = new Dog("망치", 1, "수컷");

        System.out.println("고양이 정보 : "  + c);
        c.eat();
        c.sleep();
        System.out.println("강아지 정보 : " + d);
        d.eat();
        d.sleep();


    }
}
