package Day_02.app10_Abstract02;


// Dog, Cat의 공통적인 속성및동작 정의
public abstract class Pet  { //extends Object 자동으로 삽입

    /**
     * 추상메서드(abstract method)
     *
     * 1. public abstract void methodName(); Signature 표현
     * 2. 클래스는 반드시 abstract로 지정
     * 3. 추상클래스 요소
     *  - 인스턴스 변수
     *  - 생성자
     *  - 일반 메서드(인스턴스 메서드)
     *  - 추상 메서드(abstract)
     * 4. 추상 클래스를 상속받은 자식에서는 반드시 추상메서드를 재정의 해야한다.
     */

    public abstract void eat();
    public abstract void sleep();

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


}
