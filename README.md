# hyundai-java
java-study

## Table of Contents

- [About The Project](#About-The-Project)
- [Data Type](#Data-Type)
- [Variable](#Variable)
- [Upcasting](#Upcasting)
- [Class](#Class)
- [Array](#Array)
- [1일차 최종정리](#1일차-최종정리)
- [Super](#Super)
- [Polymorphism](#Polymorphism)
- [Encapsulation](#Encapsulation)
- [Abstract](#Abstract)
- [Interface](#Interface)
- [Anonymous](#Anonymous)
- [2일차 최종정리](#2일차-최종저리)

## About The Project

## Data Type

* 기본형 데이터 (8가지)
    - 수치형 
        + 정수형
            + byte (1byte)
            + short (2byte)
            + int (4byte)
            + long (8byte)
        
        + 실수형
            + float (4byte)
            + double (8byte) : 기본
            + 3.14 (double 처리)
            + 3.14F (float 처리)
            + 3.14D (double 처리)

    - 문자형
        + char (2byte) ===> '남', 'A'
        + escape 문자
            + \t : tab
            + \n : new line
            + \" : " output
            + \' : ' output
    + 논리형
        + boolean (1byte)
            + true
            + false (default)
* 참조형 데이터
    - 기본형 8가지 제외한 나머지 모두 참조형 대이터 
    - Class, Array, Interface


## Variable
* variable
    - object
        + data store
    
    - category
        + 기본형 변수 : 기본형 데이터를 저장한 변수
            + 변수에 가면 실제 기본 데이터가 저장되어 있음
        
        + 참조형 변수 : 참조형 데이터를 저장한 변수
            + 변수에 가면 실제 데이터가 저장된 주소 값이 저장되어 있다. 
            + 클래스,배열,인터페이스의 값의 주소값 저장되고 크기는 항상 4byte이다.
    
    - grammar
        + 변수 선언 : 메모리에 데이터를 저장할 영역만들고 영역에 이름 지정

        + 변수 초기화 

    - 선언 위치에 따른 변수 3가지 종류 (⁂⁂⁂⁂⁂)
        + local variable
            + 메서드안에서 선언된 변수
            + 메서드 호출시 생성 ~ 매서드 소멸시 제거
            + stack memory store
            + 사용전에 반드시 초기화 해야한다.
        + instance variable
            + 메서드 밖에서 선언된 변수
            + 객체생성(new) ~ 객체 소멸시 제거
            + heap memory store
            + auto init ( 정수: 0, 실수 : 0.0, 논리 : false, 참조형 : null)

        + class variable (static)
            + 메서드 밖에서 선언된 변수 + static
            + 프로그램 실행시 ~ 프로그램 종료시 제거
            + method area memory store
            + auto init (정수: 0, 실수: 0.0 , 논리:false,  참조형: null)

## Upcasting
* Upcasting
    - 데이터 종류가 변경 가능

    - 묵시적 형변환 (자동 형변환)
        + byte > short > int > long > float > double
        + char > int (ascii)
            + char값을 연산 가능하다.
        + int보다 작은 데이터형의 연산결과는 int로 반환

            ```
            short s = 10;
		    short s2 = 20;
		    short result = s+s2; //에러발생, s+s2의 결과는 int로 반환
		    int result2 = s + s2;
            ```
        + 작은타입과 큰타입 연산결과는 큰타입으로 반환
    
    - 명시적 형변환 (강제 형변환)
        + (데이터 타입) 변수
    
    ===========> 데이터 형변환은 기본형 뿐만 아니라 참조형도 가능 (클래스도 형변환 가능)
## Class
객체지향 프로그래밍 언어 ( Object Oriented Programming)

=> 객체 개념을 이용해서 프로그래밍 한다.

* Object?
    
    subject가 바라본 사물 의미

* 객체는 2가지 요소
    - 속성
        + 색상
        + 크기
        + 제조사
        + 가격..
    - 동작
        + on
        + off

* 자바 어플리케이션 개발 프로세스
    
    분석 --> 설계 --> 구현 --> 테스트 --> 배포
    - 분석 : 객체 추출 (어플리케이션 개발에 적합한 객체)
        + 학생관리 프로그램 개발
            + 학생객체
                + 속성 
                + 동작
            + 성적객체
            + 교사개체
    - 설계 : 분석단계에 추출한 객체를 클래스 표현
        + OOP 프로그래밍 : (현실세계 개념) ----------> (가상세계)

        + 학생객체 ----> Student 클래스 ----> 객체생성(new) ----> 인스턴스(홍길동 실제학생)
    - 구현
    
    - 테스트

    - 배포

* 용어정리 
    - 객체 : 현실세계의 사물의미
    - 클래스 : 객체의 자바문법의 표현방법 (틀, 설계도)
    - 인스턴스 : 메모리에 생성된 실체 (인스턴스, 객체)
                
                 
* 접근지정자 (access modifier)
    - 외부클래스에서 자신 접근 제약지정
        + public : 제약 X
        + protected
        + private : 자신만 접근
    
* this
    - 객체생성된 후 Heap Memory에 올라간 자신을 참조하는 키워드



## Array
* 변수
    - 값 하나만 저장 가능 -> 데이터 증가 -> 변수 증가
    - 사용방법
        + 변수선언
        + 초기화
    - 기본형
    
* 배열
    - 여러 데이터를 변수 (배열명) 하나로 관리 가능
    - 동일한 데이터만 관리
    - 사용방법
        + 배열 선언
        + 배열 생성
        + 초기화
    - 참조형 데이터 : 클래스, 배열, 인터페이스 무조건 생성부터(new 이용)

    - 배열 사용방법 3가지
        + new 이용
        + 초기값 이용 (new 없이)
        + 가+나 방법 혼합

    - java.util.Arrays 유틸리티 클래스
        + 정렬
        ```java
        Arrays.sort(names);
		System.out.println("1. 오름차순 정렬:");
		for (String s : names) {
			System.out.println(s);
		}
        ```
        + 배열값을 문자로 출력
        ```java
        System.out.println("2. 배열값을 한꺼번에 출력:" + Arrays.toString(names));
        ```
        + java.util.List 쉽게 생성하기
        ```java
        List<String> list = Arrays.asList("홍길동","이순신","유관순");  // ... 가변인자
		System.out.println("3. java.util.List 쉽게 생성하기:" + list);
        ```

## 1일차 최종정리

![1일차 그림](./asset/structure.png)
 
## Super

* 생성자 호출상태
    - 다른 클래스에서 객체생성시
        + new ClassName();
    - 자식클래스에서 부모 생성자 호출
        + super();
            + (자식클래스 생성자 첫 라인에 자동 삽입)
    - 같은 클래스의 특정 생성자에서 다른 생성자 호출
        + this();
    
    - 자식 입장에서는 기본 생성자를 기본적으로 호출한다 
        + 기본 생성자는 항상 만들어지기 때문에 기본적으로 기본 생성자를 호출한다.
        + 명시적으로 지정할시 반드시 첫라인에 사용해야된다.

* Object의 toString()
    - 참조변수를 println 할때 자동으로 호출된다.
        + 참조변수는 주소값이 저장되어 있음.
        + print하면 콘솔(console)에 문자열로 출력시키기 위해서 toString() auto call

    - Object의 toString 구현
        + return 클래스명 @16진수

    - 결론은 모든 사용자 정의클래스 Object의 toString 재정의하자
        + 명시적인 메서드 호출없이 원하는 객체 정보를 출력할 수 있다.    

* API
    - 시스템 제공한 클래스 의미 ===> 패키지로 제공
    - API 문서 : https://docs.oracle.com/javase/8/docs/api/index.html
    ```java
    Date d = new Date();
    System.out.println(d); // d.toString() 동일
    List<String> list = Arrays.asList("aa", "bb");
    System.out.println(list);
    ```

## Polymorphism
* 객체지향의 (OOP) 3대 특징
    - 상속 (inheritance)
    - 다형성 (Polymorphism)
    - 은닉화 (캡슐화, encapsulation)
* 다형성
    - 상속전제
    - 개념 : 하나의 변수가 서로 다른 데이터 타입을 참조하는 능력
    - 문법
        + 큰 타입 = 작은타입;
        + 부모클래스 타입변수 = new 자식클래스();
    - 단 하나의 변수로 여러 데이터 타입을 참조할 수 있다.

    ```java
    public static void main(String[] args) {

        // 1. 다형성 미적용
        Cat c = new Cat("나비", 2, "블랙");
        Dog d = new Dog("망치", 1, "수컷");


        // 2. 다형성 적용 ==> 하나의 변수로 모든 애완동물 참조 가능
        Pet pet = new Cat("나비",2,"블랙");
        System.out.println("고양이정보" + pet);
        pet = new Dog("망치", 1, "수컷");
        System.out.println("강아지정보" + pet);
    }
    ```
    ```java
    public static void main(String[] args) {

        // 1. 다형성 미적용
        Cat c1 = new Cat("나비1", 2, "블랙");
        Cat c2 = new Cat("나비2", 2, "블랙");
        Cat c3 = new Cat("나비3", 2, "블랙");
        Dog d1 = new Dog("망치1", 1, "수컷");
        Dog d2 = new Dog("망치2", 1, "수컷");
        Dog d3 = new Dog("망치3", 1, "수컷");

        Cat []  cats = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙")};
        Dog []  dogs = {
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")};

        // 2. 다형성 적용 ==> 하나의 변수로 모든 애완동물 참조 가능
        /**
         * - 배열사용 : 다형성의 대표적인 샘플
         */
        Pet [] pets = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")
        };

        for (Pet pet  : pets){
            System.out.println(pet);
        }

        // 다형성 확장
        Object [] obj = {"홍길동", 20, new Date(), new Cat("나비1", 2, "블랙")};

        // 메소드 파라미터 - 다형성의 대표적인 샘플
        setData(20);
    }
    ```

    ```java
    public static void main(String[] args) {
        Pet [] pets = {
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Cat("나비1", 2, "블랙"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷"),
                new Dog("망치1", 1, "수컷")
        };

        // 1. 모든 애완동물 출력
        for (Pet pet: pets){
            System.out.println(pet);
        }
        System.out.println("/////////////////////");
        // 2. 고양이만 출력 ==> 고양이 타입인지 체크 필요,  instanceof
        for (Pet pet : pets){
            if(pet instanceof Cat){
                System.out.println("고양이 정보만 출력 :" +pet);
            }
        }

        // 3. 고양이의 정보중에서 색상만 출력
        for(Pet pet : pets){
            if(pet instanceof Cat){
                // Cat 형변환
                Cat cat = (Cat)pet;
                System.out.println("고양이 색상만 출력: " + cat.getColor());
            }
        }

    }
    ```
## Encapsulation
* 접근지정자 은닉화 구현
    - private : instance val
    - public : method
    - Student 입장에서 효율적 (올바른 데이터 설정)

* Method private
    - TestStudent 입장에서 효율적 (사용하지 않는 메서드 hide : 복잡성이 감소)

    ```java
    public class Student {

    // 1. 은닉화(Student입장) : 직접 접근하지 못하게 변수를 private 설정 ==> 올바른 데이터 설정  목적
    //
    private String name;
    private int age;

    // 검증 메서드
    private boolean ageCheck(int age){
        return age > 100;
    }

    public void setAge(int age){
        if(ageCheck(age)) {
            System.out.println("age 잘못설정");
        }
        else{
            this.age = age;
        }
    }
    }
    ```

## Abstract

* 추상메서드 (abstract method)
    - public abstract void methodName(); Signature 표현
    - 클래스는 반드시 abstract로 지정
    - 추상클래스 요소
        - 인스턴스 변수
        - 생성자
        - 일반 메서드 (인스턴스 메서드)
        - 추상 메서드 (abstract)
    - 추상 클래스를 상속받은 자식에서는 반드시 추상메서드를 재정의 해야한다.
        + 목적 : 자식클래스에서 꼭 사용하도록 강제한다.
    - 추상 클래스는 new 불가
    - 다형성 적용 가능
    - 여러 클래스에서 공통적인 메서드 사용하게 하자. (강제성 필요==> 추상클래스)

    ```java
    public static void main(String[] args) {
        Cat c = new Cat("나비", 2, "블랙");
        Dog d = new Dog("망치", 1, "수컷");

        System.out.println("고양이 정보 : "  + c);
        c.eat();
        c.sleep();
        System.out.println("강아지 정보 : " + d);
        d.dog_eat();
        d.dog_sleep();

        // method가 많아짐 비효율적 (Cat은 재정의 했지만 Dog은 나름대로 메소드 추가함)
        // 잘 따라주면 좋은데 안따라주는 것이 있다. -> 강제적으로 부모 메소드 기능 사용하도록
    }
    ```

## Interface
날아 다니는 기능 메서드 fly()는 어디에 추가할것인가?

* fly() 새로운 기능 추가방법
    - Pet 클래스 추가
        + fly 기능이 없는 Cat?

    - Bird 클래스 추가
        + fly()
        + Bird2() Class 생성시 ? 
        + 메소드가 많아 짐에 따라 비효율적 -> 공통적으로 강제해야함

    - Interface 

* 인터페이스 구성요소 4가지
    - 상수
        + public static final 자동 지정됨

    - 추상메서드 ( 주로 쓰는 이유 ⁂⁂⁂⁂)
        + public abstract 자동지정 -> 자동 지정 권장
    
    - default 메서드
        + 일반클래스 인스턴스 메서드 기능과 동일
    
    - static 메서드

* 추상클래스와 인터페이스 비교
    - 추상클래스 
        + public abstract class 클래스명{}
        
        + 구성요소
            + 인스턴스 변수, 생성자, 인스턴스 메서드 ---> 일반클래스 요소
            + 추상메서드 (abstract)
        + 특징
            + new 불가 (객체생성 불가)
            + 임의의 클래스 이용해서 추상클래스 요소로 사용됨
                + 임의의 클래스와 추상클래스 상속관계로써 extends 사용한다 ( 단일 상속만 지원)
        + 목적
            + 하위 클래스에서 특정 메서드만 사용하도록 강제 + 일반 클래스의 상속 (공통기능 재사용) 장점 제공
        + 단점
            + 다른 클래스를 상속불가 (하나만 받아야 하기 때문에 인터페이스로 받으면 여러개 받을 수 있는 장점이 있다.)
            + 특정 메소드만 강제할 목적이다 -> 인터페이스로 만드는게 좋다 (확장성이 좋기 때문에)
    - 인터페이스
        + public interface 인터페이스명{}
        + 구성요소
            + 상수, 추상메서드, default 메서드, static 메서드
        + 특징
            + 임의의 클래스 이용해서 인터페이스 요소로 사용됨
                + 임의의 클래스와 인터페이스 구현관계로서 implements 사용한다. (다중구현 가능)
            + 인터페이스간에 다중 상속 가능 (extends 사용)
        + 목적
            + 하위 클래스에서 특정 메서드만 사용하도록 강제 + 클래스들간의 의존성 감소(decoupling)

* DB 연동 아키텍처
    - Main <----> Service <----> DAO <----> DB(오라클, Mysql)
        + Main
            + 화면처리 + 사용자이벤트 발생 + 데이터출력 기능
        + Service 
            + 중간자 역할 + 트랜잭션 처리 (commit, rollback)
        + DAO
            + Datavase Access Object 패턴
                + 실제 DB, file 접근하는 용도
    - TestMain <----> DBService <----> OracleDAO <----> Oracle
        + MysqlDAO  <----> Mysql
            + 현재 문제 하나의 변경으로 인해 여러 영향을 미친다. (DBService 까지 영향 미침)
            + DB 변경시 DBService 변경 여파가 미친다.

* 인터페이스 이용한 의존성 감소


## Anonymous
* 중첩 클래스 (nested Class)
    
    ```java
    class Outer{
     ..
     ..
     ..
     class Inner{
     }//end Inner
    }
    ```

    + member inner class
    + local inner class
    + static inner class
    + 익명 클래스

* 익명 클래스 (Anonymous class)
    - 이름이 없는 클래스
    - 인터페이스 사용시 주로 익명클래스 사용됨 (가독성이 높아지기 때문에)

## 2일차 최종정리
![2일차 그림](./asset/2day.png)