
/*
Question2:Insert few records inside user Tables
 */


package Question2;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String connectionString = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "";
        Connection conn = (Connection) DriverManager.getConnection(connectionString,
                username, password);
        Statement statement = conn.createStatement();
        String sqlQuery1="Use springDemo";
        statement.executeUpdate(sqlQuery1);
        String sqlQuery="insert into user(username,password,name,age,dob) values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
        pstmt.setString(1, "rishabh03");
        pstmt.setString(2, "12345");
        pstmt.setString(3, "rishabh");
        pstmt.setString(4, "23");
        pstmt.setString(5, "1990-01-10");

        pstmt.addBatch();

        pstmt.setString(1, "ram123");
        pstmt.setString(2, "12345");
        pstmt.setString(3, "ram");
        pstmt.setString(4, "20");
        pstmt.setString(5, "1990-01-16");

        pstmt.addBatch();

        pstmt.setString(1, "ramesh@98");
        pstmt.setString(2, "ramesh23");
        pstmt.setString(3, "ramesh");
        pstmt.setString(4, "22");
        pstmt.setString(5, "1990-01-23");

        pstmt.addBatch();

        pstmt.executeBatch();
        System.out.println(" inserted row into database");

    }
}
