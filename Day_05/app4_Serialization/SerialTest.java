package Day_05.app4_Serialization;

import java.io.*;

/**
 * 객체 직렬화
 *
 * 1. 개념?
 *  - 임의의 객체 생성했을때 heap 메모리에 인스턴스 정보중에서 데이터 (인스턴스 변수)를 파일이나 또는 네트워크 전송시 연속적인
 *  byte 데이터로 변환해야 되는데 이과정을 의미한다.
 *  반드시 객체 생성에서 바이트 열로 만들 수 있는 클래스는 반드시 특별한 인터페이스 Serializable
 *
 *  2. 모든 클래스가 객체 직렬화 되는 것은 아니고 반드시 implements Serializable 받은 클래스만 가능하다.
 *  대표 > String
 *
 *  3.FileOutputStream
 *  FileInputStream
 *  ObjectInputStream
 *  ObjectOutputStream
 *
 */

// 설정된 클래스가 직렬화될 수 있는 객체라고 알려주는 용도.( marker interface )
class Person implements Serializable{

    String name;
    int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class SerialTest  {
    public static void main(String[] args) {
        // Person 클래스를 객체 생성후에 직렬화 하자.
        File f = new File("c:\\temp\\serial.dat");  // 바이너리 데이터 이기 때문에 text에디터 로 못봄

        //직렬화 ==> 파일저장
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Person("홍길동", 20));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }

        //////////////////////////////////////////////
        //역직렬화 ==>
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
