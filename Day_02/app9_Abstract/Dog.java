package Day_02.app9_Abstract;

public class Dog extends Pet {

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    String sex;
    public Dog(){

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //Dog 클래스는 재정의 하지 않고 나름 메서드 추가
    public void dog_eat(){
        System.out.println("Dog.dog_eat");

    }
    public void dog_sleep(){
        System.out.println("Dog.dog_sleep");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
