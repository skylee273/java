package com.app6_배열;

public class 배열4_2차원 {

	public static void main(String[] args) {

		/*
		 *   변수(variable)
		 *   1. 값 하나만 저장 가능 ==> 데이터가 많아지면 변수도 많아진다. 관리 어려움.
		 *   2. 사용방법
		 *   
		 *      가. 변수선언
		 *      나. 초기화
		 *   3. 기본형
		 * 
		 *   배열(array)
		 *   1. 여러 데이터를 변수(배열명) 하나로 관리 가능
		 *   2. 동일한 데이터만 관리
		 *   3. 사용방법
		 *   
		 *     가. 배열 선언
		 *      예> 
		 *          int n; // n은 기본형 변수, 변수에 가면 정수값 존재
		 *          int [] num; // num은 참조형 변수, 변수에 가면 주소값 존재
		 *          
		 *     나. 배열 생성
		 *      예>
		 *          num = new int[크기];
		 *          
		 *     다. 초기화
		 *     
		 *   4. 참조형 데이터 : 클래스, 배열, 인터페이스 ==> 무조건 생성부터(new 이용)
		 *   
		 *   5. 배열 사용 방법 3가지
		 *   
		 *    가. new 이용
		 *    나. 초기값 이용 ( new 없이 )
		 *      
		 *       데이터형 [] 배열명 ={ 값,값2};
		 *   
		 *    다.  가+나 방법 혼합
		 */
		
		
		     int [][] num = {{1,2,3}, {4,5}, {6}};
	
		     System.out.println("행길이:"+  num.length);
		     System.out.println("1행 열길이:"+  num[0].length);
		     System.out.println("2행 열길이:"+  num[1].length);
		     System.out.println("1행 2열 값:"+  num[0][1]);
		     
		     for (int[] is : num) {
			    for(int n: is) {
			    	System.out.println(n);
			    }
			 }
		     
		     for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					System.out.println("num["+i+"]["+j+"]="+num[i][j]);
				}
			}
	}//end 
}








