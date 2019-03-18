
/*
Create database springDemo with  user table with fields
          (a) username
          (b) password
          (c) name
          (d) age
          (e) dob
 */


package Question1;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String connectionString = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "";
        Connection connection = (Connection) DriverManager.getConnection(connectionString,
                username, password);
        Statement stmt = connection.createStatement();
        String sqlQuery="Use springDemo";
        stmt.executeUpdate(sqlQuery);
        String sql1 = "create table user " +
                "(username VARCHAR(100), " +
                " password VARCHAR(100), " +
                " name VARCHAR(100), " +
                " age INT, " +
                " dob DATE)";
        stmt.executeUpdate(sql1);
        System.out.println("database and table user created");
    }
}
