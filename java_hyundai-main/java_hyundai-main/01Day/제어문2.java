package com.app5_제어문;

import java.util.Scanner;

public class 제어문2 {

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
		
		// 1.for문
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello"+ i);
		}
		for (int i = 10; i < 15; i++) {
			System.out.println("world"+ i);
		}
		for (int i = 10; i < 15; i+=2) {
			System.out.println("Happy"+ i);
		}
		for (int i=0,j=1; i < 5 && j<2; i+=2,j++) {
			System.out.println("Java"+ i+"\t"+j);
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i+"\t"+j);
			}
		}
		
		//2. while문: 반복횟수 예측이 힘들때 주로 사용, 무한루프
		// for문: 반복횟수 예측이 가능할 때 주로 사용
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello"+ i);
		}
		
		int k = 0;
		while(k<5) {
			System.out.println("Java2");
			k++;
		}
		
	}

}









