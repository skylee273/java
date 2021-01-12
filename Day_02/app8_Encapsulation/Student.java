package Day_02.app8_Encapsulation;

public class Student {

    // 1. 은닉화(Student입장) : 직접 접근하지 못하게 변수를 private 설정 ==> 올바른 데이터 설정  목적
    //
    private String name;
    private int age;

    // 검증 메서드
    private boolean ageCheck(int age){
        return age > 100;
    }

    public void setAge(int age){
        if(ageCheck(age)) {
            System.out.println("age 잘못설정");
        }
        else{
            this.age = age;
        }
    }
}
