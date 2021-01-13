package Day_03.app2_generics3;


import java.util.Date;

/**
 *
 *  제네릭스(generics)
 *  --> <T>
 */

// Object ---> T 로 변경. T는 Box 클래스를 생성할때 구체적인 타입으로 변경된다.
class Box<T>{

    T obj;
    public void setValue(T obj){
        this.obj = obj;
    }
    public T getValue(){
        return obj;
    }
}

public class GenericTest {
    public static void main(String[] args) {

        Box<String> b = new Box<String>();
        b.setValue("홍길동");
        // b.setValue(100); 가. 컴파일 시점에 잘못된 데이터가 저장된 사실을 확인할 수 있다.
        // 문제 문자열이 아닌 숫자가 두번째에 와도 컴파일 에러가 안난다.
        //b.setValue(100); // 잘못된 데이터가 저장된 사실을 개발단계인 컴파일시점이 아닌 실제로 실행되는 런타임 시점에 확인 할 수 있다.
        System.out.println("1." + b.getValue());

        Box<Date> b2 = new Box<Date>();
        b2.setValue(new Date());
        System.out.println("2." + b2.getValue());


    }
}
