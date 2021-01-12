package Day_02.app13_Interface4;

import java.util.Arrays;
import java.util.List;

public class MySQLDAO implements DBDAO {

    @Override
    public List<String> connect() {
        List<String> list = Arrays.asList("홍길동", "이순신","유관순");
        return list;
    }
}
