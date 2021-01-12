package Day_02.app13_Interface3;

import java.util.List;

public class DBService {

    //OracleDAO dao;
    MySQLDAO dao;

    public void setDao(MySQLDAO dao){
        this.dao = dao;
    }

    public List<String>  connectOracle(){
        return dao.connectMySQL();
    }
}
