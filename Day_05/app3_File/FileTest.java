package Day_05.app3_File;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {

        // 파일읽기
        /**
         * byte : FileInputStream
         *      - 바이너리 데이터 최적화
         * char : FileReader
         *      - text 데이터 최적화
         *
         */
        File f = new File("c:\\temp\\IOTest.java"); //File은 파일 생성능력 없고, 단지 파일에 메타정보

        BufferedReader buffer = null;
        try {
            FileReader reader = new FileReader(f);
            buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while(line != null){
                //EOF
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(buffer != null) buffer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
