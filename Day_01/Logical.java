package Day_01;

public class Logical {

	public static void main(String[] args) {
		
		//4. 논리연산자 ==> 논리값 이용, 실행결과는 논리값
		/*
		 * 
		 *   &&: and 의미, 그리고 해석
		 *   
		 *   ||: or 의미, 또는 해석
		 *   
		 *   ! : not 의미, 부정
		 */
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
	System.out.println("/////////////////////////////////");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println("/////////////////////////////////");
		
		System.out.println(!true); //false
		System.out.println(!false); //true
	
		// 실제활용
		//문제1:  num값이 15보다 크고 num2값이 30보다 작냐?
		int num = 10;
		int num2 = 10;
		
		System.out.println((num > 15)&&(num2 < 30));
		
		//문제2:  num값이 15보다 크거나 num2값이 30보다 작냐?
		System.out.println((num > 15)||(num2 < 30));
		
		/*
		 *  실행결과가 논리값 반환하는 연산자?
		 *   가. 비교연산자
		 *   나. 논리연산자
		 *   다. instanceof 연산자:  실제 생성된 인스턴스타입 체크
		 *    예> String name = "홍길동";
		 *       System.out.println( name instanceof String) 
		 * 
		 */
		String name = "홍길동";
		System.out.println( name instanceof String); //true
	}
}






