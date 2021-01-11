package com.app1_표준출력;

public class 표준출력 {

	public static void main(String[] args) {

		// 콘솔에 출력
		/*
		 *  한줄복사: ctrl+alt+ 화살표
		 *  한줄삭제: ctrl+d
		 *  
		 *  실행: ctrl + F11
		 */
		//1. 새로운 줄 생성하면서 출력
		System.out.println("홍길동");
		System.out.println("유관순");

		//2. 한 라인에 출력
		System.out.print("이순신");
		System.out.print("강감찬");
		System.out.println();
		
		//3. 포맷출력
		/*
		 *  %s: 문자열맵핑
		 *  %d: 정수
		 *  %f: 실수
		 *  %c: 문자
		 *  %b: 논리값
		 * 
		 */
		System.out.printf("이름:%s, 나이:%d, 키:%.2f, 성별:%c , 결혼:%b", 
				             "홍길동",   20,  178.6,  '남', false);
		
	}

}




