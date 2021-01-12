package Day_02.app7_Ploymorphism;

import java.util.Date;

public class testMain3 {

    public static void main(String[] args) {

        // 1. 다형성 미적용
        Cat c1 = new Cat("나비1", 2, "블랙");
        Cat c2 = new Cat("나비2", 2, "블랙");
        Cat c3 = new Cat("나비3", 2, "블랙");
        Dog d1 = new Dog("망치1", 1, "수컷");
        Dog d2 = new Dog("망치2", 1, "수컷");
        Dog d3 = new Dog("망치3", 1, "수컷");

        Cat []  cats = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙")};
        Dog []  dogs = {
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")};

        // 2. 다형성 적용 ==> 하나의 변수로 모든 애완동물 참조 가능
        /**
         * - 배열사용 : 다형성의 대표적인 샘플
         */
        Pet [] pets = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")
        };

        for (Pet pet  : pets){
            System.out.println(pet);
        }

        // 다형성 확장
        Object [] obj = {"홍길동", 20, new Date(), new Cat("나비1", 2, "블랙")};

        // 메소드 파라미터 - 다형성의 대표적인 샘플
        setData(20);
    }

    public static void setData( Object obj) { // 다형성 적용

    }
}
