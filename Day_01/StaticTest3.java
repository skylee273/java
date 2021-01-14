package Day_01;


public class StaticTest3 {
	
	
	static {
		int num = 10;
		System.out.println(num);
		System.out.println("초기화작업");
	}
	
	//인스턴스 초기화 블럭 ==> 객체생성시 수행
//	{
//		System.out.println("인스턴스 초기화 블럭");
//	}
//	
	public static void main(String[] args) {
		
	  // static 초기화 블럭: {}의미
	  //  임의의 작업을 초기화할 때 ( 파일 open등...)
		
		
//		StaticTest3 s = new StaticTest3();
	}

}
