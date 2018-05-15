package Control;

import AboutConnection.SqlConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFunctions extends Controlors{

    public static void deleteFromGoods(){
        try{
            String sql = "DELETE FROM Goods WHERE ?;";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setString(1, sc.nextLine());
            int rowsNum = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
