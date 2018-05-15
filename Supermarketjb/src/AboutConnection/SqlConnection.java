package AboutConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/Supermarket?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "sn5diphone6";
    private static Connection conn = null;

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        SqlConnection.conn = conn;
    }

    public void OpenSqlConnection(){
        //加载驱动
        try{
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("未能成功加载驱动程序,请检查是否导入驱动程序!");
            e.printStackTrace();
        }
        try{
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("获取数据库链接成功");
        }catch (SQLException e) {
            System.out.println("获取数据库连接失败");
            e.printStackTrace();
        }
    }

    public void CloseSqlConnection(){
        //数据库打开后要关闭
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
                conn = null;
            }
        }
    }
}
