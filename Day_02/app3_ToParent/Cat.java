package Day_02.app3_ToParent;

//
public class Cat extends Pet {

    String color;

    public Cat(String name, int age){
        super(name,age);
    }
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    public Cat(){
        super();
        // super(10);
        System.out.println("Cat 클래스 생성자");
    }
}
