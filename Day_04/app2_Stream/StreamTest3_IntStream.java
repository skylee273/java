package Day_04.app2_Stream;

import java.util.stream.IntStream;

public class StreamTest3_IntStream {
    public static void main(String[] args) {

        IntStream stream = IntStream.range(-1, 11);
        stream.forEach(s -> System.out.println("1.IntStream : " + s));
    }
}
