package Day_02.app13_Interface3;

import java.util.Arrays;
import java.util.List;

public class MySQLDAO {
    // oracle 연동해서 데이터 반환
    public List<String> connectMySQL(){
        List<String> list = Arrays.asList("홍길동", "이순신","유관순");
        return list;
    }

}
