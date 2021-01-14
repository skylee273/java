package Day_01;





public class StaticTest2 {
	public static void main(String[] args) {
		
		// API 중에서 대표적인 static 메서드: 클래스명.메서드
		
		//1. "10"----->  10
		int num = Integer.parseInt("10");
		System.out.println(num+20); // 30
		System.out.println("10"+20); // 1020
		
		
		//2. 10 ---> "10" , 문자열이 아니 데이터를 문자열로 변환할 때
		String str = String.valueOf(10);
		String str2 = String.valueOf(true);
		String str3 = String.valueOf(3.14);
		
		System.out.println(str+20); //1020
		
		//
		//Arrays.sort()
		//Arrays.toString()
		
	}

}
