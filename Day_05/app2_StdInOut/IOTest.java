package Day_05.app2_StdInOut;


/**
 *
 * 자바I/O (Input / OutPut)
 *
 * 1. 용어정리
 *
 *         (스트림)     기준은
 *  Input ~~~~~~~~~              ~~~~~~~~ Output
 *    |             자바 프로그램                |
 *  Keyboard( 표준입력 )                      모니터 ( 표준출력)
 *    |                                       |
 *  File                                     파일
 *    |                                       |
 *  Network                                 네트워크
 *    |                                       |
 *  입력(byte/char)                    출력 (byte/char) ===> String 기능을 추가
 *
 *  - 자바 I/O 가 어려운 이유 조합되는 것이 너무 많음
 *  - byte - (InputStream, OutputStream) - 인터페이스
 *      - InputStream
 *          - FileInputStream
 *          - ObjectInputStream
 *      - OutputStream
 *          - FileOutputStream
 *          - ObjectOutputStream
 *  - char - (Reader, Writer)
 *      - Reader
 *          - InputStreamReader
 *          - BufferReader
 *          - FileReader
 *      - Writer
 *          - PrintWriter
 *          - FileWriter
 */


public class IOTest {
    public static void main(String[] args) {

    }
}
