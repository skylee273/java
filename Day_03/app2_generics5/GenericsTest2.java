package Day_03.app2_generics5;


import java.util.Arrays;
import java.util.List;

class Person{

}

class Man extends Person{

}
class Women extends Person{

}
public class GenericsTest2 {
    public static void main(String[] args) {

        List<Man> listMan = Arrays.asList(new Man(), new Man());
        List<Person> listPerson = Arrays.asList(new Person(), new Person());
        List<Women> listWomen = Arrays.asList(new Women(), new Women());

        List<String> listString= Arrays.asList("AAA","BBB");

        printData(listMan);
        printData(listWomen);
        printData(listString);
        printData(listPerson);

        printData2(listMan);
        printData2(listWomen);
        printData2(listPerson);
        // printData2(listString); error 남 List<? extends Perosn> Person을 상속받은 것만 받겠다

        printData3(listMan);
        printData3(listPerson);
        // printData3(listWomen);

    }
    // 모든 제네릭스 저장된 List 전달 가능
    public static void printData(List<?> list){

    }

    // Person클래스를 상속받은 클래스로 지정된 제네릭스만 전달 가능
    public static void printData2(List<? extends Person> list){

    }

    // Man 클래스 및 Man 부모로 지정된 제네릭스만 전달 가능
    public static void printData3(List<? super Man> list){

    }

}
