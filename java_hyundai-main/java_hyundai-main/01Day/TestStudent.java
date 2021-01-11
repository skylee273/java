package com.app7_클래스4;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student();
//setter 메서드
		s.setName("홍길동");
		s.setAge(200);
		s.setAddress("서울");
//getter 메서드		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}
}
