package Day_01;

public class VariableTest3 {

	public static void main(String[] args) {

		/* 
		 *    데이터 형변환
		 *    ==> 데이터 종류가 변경 가능
		 *    
		 *    
		 *    가. 묵시적 형변환 (자동 형변환)
		 *      a. byte > short > int > long > float > double
		 *      
		 *      b. char > int  ( 아스키 코드 )
		 *       ==> char값을 연산 가능하다.
		 *       
		 *      c. int보다 작은 데이터형의 연산결과는 int로 반환
		 *        예>
		 *           short s = 10;
		 *           short s2 = 20;
		 *           short result = s+s2; //에러발생, s+s2의 결과는 int로 반환
		 *           int result2 = s + s2;
		 *           
		 *      d. 작은타입과 큰타입 연산결과는 큰타입으로 반환
		 *           
		 *    나. 명시적 형변환(강제 형변환)
		 *       ==> (데이터)변수
		 *    
		 *  =====> 데이터형변환은 기본형뿐만 아니고 
		 *         참조형도 가능하다.(클래스도 형변환이 된다.)
		 * 
		 */
		char c = 'A';
		int c2 = c;
		System.out.println(c2);  // 'A':65  'a':97
		System.out.println(c+1);  // 
		System.out.println(c > 66);  // 
		
		short s = 10;
		short s2 = 20;
		//short result = s+s2;
		int result = s + s2;
		short result2 = (short)(s+s2); //강제 형변환
	}

}
