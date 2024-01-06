package labsheet3.q4;

import java.sql.*;

public class ScrollableResultSetWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmgmt", "root", "mysqlroot778$");

            // Create a prepared statement with a scrollable result set
            String sql = "SELECT * FROM city;";
            PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstmt.executeQuery();

            rs.last();
            System.out.println("Row No : " + rs.getRow() + " Name : " + rs.getString("Name"));
            rs.first();
            System.out.println("Row No : " + rs.getRow() + " Name : " + rs.getString("Name"));
            rs.absolute(10);
            System.out.println("Row No : " + rs.getRow() + " Name : " + rs.getString("Name"));
            rs.previous();
            System.out.println("Row No : " + rs.getRow() + " Name : " + rs.getString("Name"));
            rs.relative(-1);
            System.out.println("Row No : " + rs.getRow() + " Name : " + rs.getString("Name"));

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

