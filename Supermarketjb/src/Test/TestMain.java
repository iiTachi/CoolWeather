package Test;

import Control.DeleteFunctions;
import Control.InsertFunctions;

public class TestMain {
    public static void main(String[] args){
        new AboutConnection.SqlConnection().OpenSqlConnection();
        InsertFunctions.insertIntoGoods();
        new AboutConnection.SqlConnection().CloseSqlConnection();
    }
}
