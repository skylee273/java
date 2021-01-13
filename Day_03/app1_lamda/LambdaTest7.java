package Day_03.app1_lamda;

import java.util.*;

public class LambdaTest7 {
    public static void main(String[] args) {

        // 1. list 관리 ( 기존방식 )
        List<Person> list = Arrays.asList(new Person("홍길동",20), new Person("이하늘",29), new Person("김길동",31)
        , new Person("테스트",45), new Person("사람인",18));

        // 배열인 경우 ---> Arrays.sort();
        // 리스트인 경우 --> Collections.sort()

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        System.out.println(list);

        // 2. 람다 표현식
        list.sort((o1, o2) -> o2.age - o1.age);
        System.out.println(list);
    }
}

class Person {

    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}//end Person
