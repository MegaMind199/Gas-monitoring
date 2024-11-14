package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {

    private static final String user  = "root";
    private static final String pass  = "gujaguja";
    private static final String url   = "jdbc:mysql://localhost:3303/gas_account_db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

}
