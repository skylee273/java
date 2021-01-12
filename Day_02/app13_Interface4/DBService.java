package Day_02.app13_Interface4;

import java.util.List;

public class DBService {

    //OracleDAO dao;
    // MySQLDAO dao;
    DBDAO dao;


    public void setDao(DBDAO dao){
        this.dao = dao;
    }

    public List<String>  connectOracle(){
        return dao.connect();
    }
}
