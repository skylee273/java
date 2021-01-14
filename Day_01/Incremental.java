package Day_01;

public class Incremental {

	public static void main(String[] args) {
		
		//5. 증감연산자 ==> 증가 연산자, 감소 연산자
		/*
		 *  1) 증가 연산자
		 *    1씩 증가
		 *    ++
		 *   예>
		 *      ++num;  전치 연산자, num = num + 1; , num+=1;
		 *      
		 *      num++;  후치 연산자 num = num + 1; , num+=1;
		 *   
		 *   
		 *  2) 감소 연산자
		 *    1씩 감소
		 *    --
		 *   	--num;  전치 연산자  num = num - 1; , num-=1;
		 *      num--;  후치 연산자  num = num - 1; , num-=1;
		 *      
		 *   
		 *   * 주의할 점
		 *   ==> 다른 연산자와 같이 사용시 실행결과가 달라질 수 있다.
		 */
		int num = 10;
		int result = ++num; //전치:   먼저 증가하고 나중에 할당
		System.out.println(result + "\t" + num); // 11  11
		
		int num2 = 10;
		int result2 = num2++; //후치: 먼저 할당하고 나중에 증가
		System.out.println(result2 + "\t" + num2); // 10 11
		
		//getNum()
		System.out.println(getNum());
		System.out.println(getNum2());
		
	}
	
	public static int getNum() {
		int num = 9;
		return ++num;//전치 : 먼저 증가하고 나중에 반환
	}
	public static int getNum2() {
		int num = 9;
		return num++; //후치: 먼저 반환하고 나중에 증가
	}
	
}






