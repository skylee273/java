package Day_02.app13_Interface4;


import java.util.List;

/**
 *
 * DB 연동 아키텍처
 *
 * Main <----->Service<--------->DAO<----------->DB(오라클,Mysql)
 * Main : 화면처리 + 사용자이벤트 발생 + 데이터출력 기능
 * Service : 중간자 역할 + 트랜잭션 처리 (commit, rollback)
 * DAO : Database Access Object 패턴
 *      - 실제 DB,file 접근하는 용도
 *
 *
 * TestMain ---> DBService ---> OracleDAO ----> 오라클
 *                              MySqlDAO  ----> Mysql
 * -> 현재 문제 하나의 변경으로 인해 여러 영향을 미친다.  (DBService 까지 영향미침)
 * ==> DB 변경시 DBService 변경 여파가 미친다.
 *
 * * 인터페이스 이용한 의존성 감소
 */

public class TestMain {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        // Main 입장에서 Oracle 연동하겠다는 의미
        //dbService.setDao(new MySQLDAO());
        dbService.setDao(new OracleDAO());
        List<String> list = dbService.connectOracle();
        System.out.println(list);
    }
}
