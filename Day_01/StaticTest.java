package Day_01;


class Counter{
	int num; // 0으로 자동초기화
	static int count;  // 한번만 생성, 누적용, 클래스명.count, 자동초기화, new 무관(인스턴스)
	public Counter() {
//		num++;
		count++;
	}
	// static 메서드
	// :  new 없이 사용 가능( 목적: 편리할 목적, 싱글톤 객체:단 하나의 인스턴스만 생성패턴)
	// :  인스턴스 변수 접근 불가, this 사용 불가
	public static int getCount() {
//		System.out.println(this);
//		return num;
		return count;
	}
	// 인스턴스 메서드: this 및 인스턴스 변수 및 static 변수 모두 사용 가능
	public int getNum() {
		System.out.println(this);
//		return count;
		return num;
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		System.out.println(Counter.count);
		System.out.println(Counter.getCount());
		
		// Counter클래스 객체생성 횟수 출력하자.
		Counter c = new Counter();
		System.out.println(Counter.count);
		c = new Counter();
		System.out.println(Counter.count);
	}

}
