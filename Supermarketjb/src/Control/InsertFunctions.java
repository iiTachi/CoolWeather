package Control;

import AboutConnection.SqlConnection;
import java.sql.Date;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Time;
import java.util.Scanner;

public class InsertFunctions extends Controlors{


    //传入带参数的插入语句
    public  static void insertIntoGoods(){
        try{
            String sql = "insert into Goods ( gname, brand, price, quantity ) values ( ?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.println("Input name:");
            pstmt.setString(1, sc.next());
            System.out.println("Input brand:");
            pstmt.setString(2, sc.next());
            System.out.println("Input price:");
            pstmt.setDouble(3, sc.nextDouble());
            System.out.println("Input quantity:");
            pstmt.setInt(4, sc.nextInt());
            int rowsNum = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoClothes(){
        try{
            String sql = "INSERT INTO Clothes VALUES (?, ?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setInt(1, sc.nextInt());
            pstmt.setString(2 ,sc.nextLine());
            pstmt.setString(3, sc.nextLine());
            pstmt.setString(4, sc.nextLine());
            pstmt.setString(5, sc.nextLine());
            int rowsNUm = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoFoods(){
        try{
            String sql = "INSERT INTO Foods VALUES (?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setInt(1, sc.nextInt());
            pstmt.setString(2 ,sc.nextLine());
            pstmt.setString(3, sc.nextLine());
            pstmt.setDate(4, Date.valueOf(sc.nextLine()));
            int rowsNUm = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoInRecords(){
        try{
            String sql = "INSERT INTO InRecords VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setInt(1, sc.nextInt());
            pstmt.setTime(2 , Time.valueOf(sc.nextLine()));
            pstmt.setInt(3, sc.nextInt());
            pstmt.setDouble(4, sc.nextDouble());
            pstmt.setInt(5, sc.nextInt());
            pstmt.setDouble(6, sc.nextDouble());
            int rowsNUm = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoOutRecords(){
        try{
            String sql = "INSERT INTO OutRecords VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setInt(1, sc.nextInt());
            pstmt.setTime(2 , Time.valueOf(sc.nextLine()));
            pstmt.setInt(3, sc.nextInt());
            pstmt.setDouble(4, sc.nextDouble());
            pstmt.setInt(5, sc.nextInt());
            pstmt.setDouble(6, sc.nextDouble());
            int rowsNUm = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoOffShelve(){
        try{
            String sql = "INSERT INTO OffShelve VALUES (?, ?, ?, ?);";
            PreparedStatement pstmt = (PreparedStatement) SqlConnection.getConn().prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            pstmt.setInt(1, sc.nextInt());
            pstmt.setTime(2 , Time.valueOf(sc.nextLine()));
            pstmt.setInt(3, sc.nextInt());
            pstmt.setString(4, sc.nextLine());
            int rowsNUm = pstmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
