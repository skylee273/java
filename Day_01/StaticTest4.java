package Day_01;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;

public class StaticTest4 {
	public static void main(String[] args) {
		
		// static import
		/*
		 *   static 변수및 메서드는 
		 *   반드시  클래스명을 지정해야된다.
		 *   이때 클래스명을 생략하는 방법이 static import가 된다.
		 *   ==> 안드로이드 개발환경에서 많이 사용됨.
		 */
		// 1. 기존 방법
		int num = Integer.parseInt("10");
		System.out.println(num);
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println(min+"\t"+max);
		
		//2. 단점: 가독성이 떨어진다.
		int kkk = parseInt("20");
		int kkk2 = MIN_VALUE;
		int kkk3 = MAX_VALUE;
		
		
		
	}

}
