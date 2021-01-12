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
    
