package Day_02.app7_Ploymorphism;

public class testMain4
{
    public static void main(String[] args) {
        Pet [] pets = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")
        };

        // 1. 모든 애완동물 출력
        for (Pet pet: pets){
            System.out.println(pet);
        }
        System.out.println("/////////////////////");
        // 2. 고양이만 출력 ==> 고양이 타입인지 체크 필요,  instanceof
        for (Pet pet : pets){
            if(pet instanceof Cat){
                System.out.println("고양이 정보만 출력 :" +pet);
            }
        }

        // 3. 고양이의 정보중에서 색상만 출력
        for(Pet pet : pets){
            if(pet instanceof Cat){
                // Cat 형변환
                Cat cat = (Cat)pet;
                System.out.println("고양이 색상만 출력: " + cat.getColor());
            }
        }

    }
}
