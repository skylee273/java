package Day_02.app3_ToParent;

public class Pet {

    public Pet(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    String name;
    int age;


    public Pet(){
        super();
        System.out.println("Pet 클래스 생성자");
    }
    public Pet(int num){
        System.out.println("Pet2 클래스 생성자");

    }
}
