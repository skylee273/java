package Day_02.app9_Abstract;


// Dog, Cat의 공통적인 속성및동작 정의
public class Pet  { //extends Object 자동으로 삽입

    String name;
    int age;


    // 부모가 큰타입이고 자식이 작은 타입이다.
    public Pet(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 애완동물의 공통적인 기능
    public void eat() {
        System.out.println("Pet.eat");
    }
    public void sleep() {
        System.out.println("Pet.sleep");
    }
}
