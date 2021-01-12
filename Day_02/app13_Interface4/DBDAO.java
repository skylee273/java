package Day_02.app13_Interface4;

import java.util.List;

public interface DBDAO {

    // DB 연동시 필요한 메서드를 추상 메서드
    public abstract List<String> connect();

}
