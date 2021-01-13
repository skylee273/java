package Day_03.app3_Collection.List;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MyComp implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        // return o1.age - o2.age;
        // return o2.age - o1.age;
        return Integer.compare(o1.age, o2.age); // 오름차순
        // return Integer.compare(o2.age, o1.age); // 내림차순
    }
}
public class ListTest2 {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("홍길동", 34),
                new Person("홍길동2",14),
                new Person("홍길동3",44),
                new Person("홍길동4",24),
                new Person("홍길동5",54));

        //1.정렬
        list.sort(new MyComp());
        System.out.println("1.정렬:" + list);
        // list.sort(((o1, o2) -> o1.age - o2.age));
        // list.sort((o1, o2) -> Integer.compare(o1.age, o2.age));
        //2. 최대 / 최소
        Person max = Collections.max(list, new MyComp());
        Person min = Collections.min(list, new MyComp());

        System.out.println("2. age 최대값:" + max);
        System.out.println("3. age 최소값:" + min);
    }
}
