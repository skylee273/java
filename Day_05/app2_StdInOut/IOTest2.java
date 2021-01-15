package Day_05.app2_StdInOut;

import java.io.IOException;
import java.io.InputStream;

public class IOTest2 {
    public static void main(String[] args) {

        // 표준입력
        InputStream is = System.in;
        System.out.println("이름입력");
        try {
            int n = is.read();
            System.out.println((char) n);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
