package Day_01;

import java.util.Scanner;

public class ControlStatement3 {

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
		
		//무한루프로 키보드 입력 받기: 필요시 중지할 수 있는 코드 구현 필수
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름 입력");
			//int num = scan.nextInt();
			String name = scan.nextLine();
			System.out.println("이름:" + name);
			if(name.equalsIgnoreCase("Q"))break; // break문은 반복문 빠져나올 때 사용
		}
		System.out.println("END");
		
	}

}









