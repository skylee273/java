package Day_03.app2_generics;

import java.util.Date;

/**
 *
 *  제네릭스(generics)
 *  --> <T><?> <? extends>\, <? super 클래스명>
 *  ==> 참조형만 가능 ( 기본형은 Wrapper 클래스로 사용 )
 *
 *  기본형 ======================>
 *              클래스 제공
 *  byte  =======================> Byte
 *  short =======================> Short
 *  int   =======================> Integer(*)
 *  long  =======================> Long
 *
 *  float =======================> Float
 *  double=======================> Double
 *
 *  char  =======================> Charter(*)
 *
 *  boolean =======================> Boolean
 */

// BoX안에 여러가지 물건을 담을 수 있다. ==> Box 안에 여러 데이터(문자열,정수,날짜...)를 담을 수 있다.
class Box{

    // 데이터 갯수만큼 setValue 추가된다 ==> 오버로딩 메서드 형태로 구현 ==> 비효율적
    public void setValue(String string){

    }

    public void setValue(Date date) {

    }
}
public class GenericTest {
    public static void main(String[] args) {
        //1. 문자열 저장
        Box b = new Box();
        b.setValue("홍길동");

        Box b2 = new Box();
        b2.setValue(new Date());



    }
}
