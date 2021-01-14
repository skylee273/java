package Day_01;

public class Student {

	/*
	 *   접근지정자(접근제어자: access modifier)
	 *   ==> 외부클래스에서 자신 접근 제약지정
	 *   public: 제약이 없다. 
	 *   protected
	 *            (default)
	 *   private: 자신만 접근
	 * 
	 */
	private String name;
	private int age;
	private String address;
	//2. 생성자:  인스턴스 변수 초기화
	public void setAge(int age) {
		//age 검증코드 추가 가능
		if(age>100) {
			System.out.println("age 잘못설정");
		}else {
			this.age = age;
		}
	}
	/*
	 *   this ?
	 *   1. 객체생성된 후 
	 *    heap 메모리에 올라간 자신을 참조하는 키워드.
	 * 
	 */
	public Student() {
	}
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//3. 메서드 : 인스턴스 변수 값 변경 및 조회
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
