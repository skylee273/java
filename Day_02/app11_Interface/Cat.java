package Day_02.app11_Interface;

// Cat is a Pet 성립 : Pet의 구성요소를 Cat이 그냥 사용가능
public class Cat extends Pet {

    String color; // 고유한 속성

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    // 없는데도 사용할 수 있는 이유 Pet class 에서 상속 받았기 때문에
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat.sleep");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
