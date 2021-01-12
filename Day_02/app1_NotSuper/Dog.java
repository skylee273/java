package Day_02.app1_NotSuper;

public class Dog {

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    int age;

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String sex;

    public Dog(){

    }

}
