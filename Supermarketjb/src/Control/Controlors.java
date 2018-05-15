package Control;

import AboutConnection.SqlConnection;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class Controlors {

    //直接传入整条增/删/改语句模式
    public void OperateByStr(String sql){
        try{
            Statement stmt = (Statement) SqlConnection.getConn().createStatement();
            int rowsNum = stmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
