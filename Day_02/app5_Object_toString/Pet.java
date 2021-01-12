package Day_02.app5_Object_toString;


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


    // name과 age 동시 반환
    public String getPet(){
        return name+ "\t" +age;
    }

}
