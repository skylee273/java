package com.app6_배열;

import java.util.Arrays;
import java.util.List;

public class 배열5_Arrays {

	public static void main(String[] args) {

		/*
		 *
		 *    java.util.Arrays 유틸리티 클래스
		 *    
		 */
		  String [] names = {"Java","SQL", "Oracle","Angular"};
		  //1. 정렬
		  Arrays.sort(names);
		  System.out.println("1. 오름차순 정렬:");
		  for (String s : names) {
			System.out.println(s);
		  }
		
		   //2. 배열값을 문자열로 출력
		  System.out.println("2. 배열값을 한꺼번에 출력:" + Arrays.toString(names));
		
		  //3. java.util.List 쉽게 생성하기
		  List<String> list = Arrays.asList("홍길동","이순신","유관순");  // ... 가변인자
		  System.out.println("3. java.util.List 쉽게 생성하기:" + list);
		  //System.out.printf("%s %d", "홍길동", 20);
	}//end 
}








