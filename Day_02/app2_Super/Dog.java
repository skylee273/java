package Day_02.app2_Super;

public class Dog extends Pet{

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
}
