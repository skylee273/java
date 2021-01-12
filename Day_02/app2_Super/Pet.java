package Day_02.app2_Super;


// Dog, Cat의 공통적인 속성및동작 정의
public class Pet  { //extends Object 자동으로 삽입

    // 부모가 큰타입이고 자식이 작은 타입이다.
    public Pet(){

    }
    String name;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int age;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String color;

}
