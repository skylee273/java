package Day_03.app2_generics2;


import java.util.Date;

/**
 *
 *  제네릭스(generics)
 *  --> <T>
 */

// BoX안에 여러가지 물건을 담을 수 있다. ==> Box 안에 여러 데이터(문자열,정수,날짜...)를 담을 수 있다.
class Box{

    Object obj;
    public void setValue(Object obj){
        this.obj = obj;
    }
    public Object getValue(){
        return obj;
    }
}

public class GenericTest {
    public static void main(String[] args) {

        Box b = new Box();

        b.setValue("홍길동");
        // 문제 문자열이 아닌 숫자가 두번째에 와도 컴파일 에러가 안난다.
        //b.setValue(100); // 잘못된 데이터가 저장된 사실을 개발단계인 컴파일시점이 아닌 실제로 실행되는 런타임 시점에 확인 할 수 있다.
        String str = (String)b.getValue(); //나. 반드시 형변환 필요
        System.out.println("1." + str);

        Box b2 = new Box();
        b2.setValue(new Date());

        Date d = (Date) b2.getValue();
        System.out.println("2." + d);


    }
}
