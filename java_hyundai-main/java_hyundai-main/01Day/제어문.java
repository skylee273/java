package com.app5_제어문;

import java.util.Scanner;

public class 제어문 {

	public static void main(String[] args) {

		/*
		 *   문장 종류 2가지
		 *   
		 *   1) 실행문
		 *         - 순차문
		 *         - 제어문
		 *            : 분기문
		 *               - 단일 if문
		 *               - if~else문
		 *               - 다중 if 문
		 *               - switch문
		 *               
		 *            : 반복문
		 * 				  - for문
		 *  			  - while문
		 *  			 - do~while문
		 * 
		 *   2) 비실행문
		 *      - 주석문
		 *          한줄 주석문 //
		 *          여러줄 주석문  /* ~  
		 */
		
		//1. 단일 if문 : 조건에 true인 경우에만 실행
		System.out.println("1");
		if(3==13) {
			System.out.println("2");
			System.out.println("2-1");
		}
		System.out.println("3");
		
		//2. if~else문 : 조건에 따라서 실행되는 문장이 다른 경우
		System.out.println("10");
		if (3==3) {
			System.out.println("20");
		} else {
			System.out.println("30");
		}
		System.out.println("40");
		
		//3. 다중 if 문 : 조건이 여러개 인 경우
		/*
		 *    90~ 100: A학점
		 *    80~ 89: B학점
		 *    70~ 79: C학점
		 *    이외     : F학점
		 * 
		 */
		 // 키보드 입력받기
		//import java.util.Scanner;
		Scanner scan  = new Scanner(System.in);
		System.out.println("점수 입력");
		int num = scan.nextInt();
//		System.out.println(num);	
		if(num >= 90) {
			System.out.println("A학점");
		}else if(num >=80) {
			System.out.println("B학점");
		}else if( num >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		//라. switch
		/*
		 *   문법:  == 연산자
		 *   
		 *    switch(변수){
		 *     case 값1: 문장; break;
		 *     case 값2: 문장; break;
		 *     case 값3: 문장; break;
		 *     default: 문장; break;
		 *    }
		 * 
		 *   break문은 옵션이다.
		 * 
		 */
		
		int xxx = 10;
		switch (xxx) {
		case 5:
			System.out.println("5");break;
		case 10:
			System.out.println("10");break;
		case 15:
			System.out.println("15");break;	
		default:
			System.out.println("default");break;
		}
		
	}

}









