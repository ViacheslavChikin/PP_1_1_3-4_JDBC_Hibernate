package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection connection = getConnection();

    public static final String URL = "jdbc:mysql://localhost:3306/my_db";
    public static final String USERNAME = "bestuser";
    public static final String PASS = "bestuser";


    public static Connection getConnection()  {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
