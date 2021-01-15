package Day_05.app3_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest2 {
    // 파일출력
    /**
     * byte : FileOutputStream
     *      - 바이너리 데이터 최적화
     * char : FileWriter
     *      - text 데이터 최적화
     *
     */
    public static void main(String[] args) {

        File f = new File("c:\\temp\\abc.txt"); // 읽을때는 파일이 없으면 예외발생 . 쓸때는 파일이 없으면 자동생성됨
        PrintWriter out = null;
        try{
            FileWriter writer = new FileWriter(f, true);  // true : 수정 o
            out = new PrintWriter(writer);
            out.println("aaa");
            out.println(100);
            // out.flush(); 버퍼 비우기
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }
}
