package Control;

import AboutConnection.SqlConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateFunctions extends Controlors{

    public static void updateTable(String table){
        try {
            String sql = "UPDATE " + table + " SET ?" + " WHERE ?;";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setString(1, sc.nextLine());
            pstmt.setString(2, sc.nextLine());
            int rowsNum = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
