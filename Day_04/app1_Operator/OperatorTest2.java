package Day_04.app1_Operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

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


public class OperatorTest2 {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동1", 34);
        Person p2 = new Person("홍길동2", 28);

        //익명클래스
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.age,o2.age); // 오름차순
                // return Integer.compare(o2.age,o1.age); // 내림차순
            }

        };

        /*BinaryOperator<Person> op = BinaryOperator.maxBy(comparator);
        Person maxAgePerson = op.apply(p1,p2);
        System.out.println(maxAgePerson);*/

        BinaryOperator<Person> x = BinaryOperator.maxBy((f,f2) -> Integer.compare(f.age, f2.age));
        Person maxAgePerson = x.apply(p1,p2);
        System.out.println("lambda.maxBy>>" + maxAgePerson);

    }
}
