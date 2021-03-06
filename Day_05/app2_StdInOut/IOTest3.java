package Day_05.app2_StdInOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest3 {
    public static void main(String[] args)  {

        // 표준입력 ===> InputStream만 사용해서는 원활한 IO불가. 따라서 기능추가된 클래스를 사용한다.

        InputStream is = System.in; //byte 처리 ( 1byte)
        InputStreamReader reader = null; // byte --> char 로 읽도록 변환 (2byte)
        BufferedReader bufferedReader = null; // char --> 한 라인씩 문자열로 읽도록 변환

        System.out.println("이름입력");

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        reader = new InputStreamReader(is);
        bufferedReader = new BufferedReader(reader);

        try {
            String str = bufferedReader.readLine();
            System.out.println(str);
        } catch (IOException e) {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }



    }
}
