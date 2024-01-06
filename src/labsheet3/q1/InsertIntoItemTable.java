package labsheet3.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class InsertIntoItemTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ayush_java";
        String user = "root";
        String password = "mysqlroot778$";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            String insertQuery = "INSERT INTO item (ItemId, Name, UnitPrice, Units, ExpiryDate) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Item 1");
            preparedStatement.setDouble(3, 10.99);
            preparedStatement.setInt(4, 100);
            preparedStatement.setDate(5, new java.sql.Date(new Date().getTime()));

            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Item 2");
            preparedStatement.setDouble(3, 5.99);
            preparedStatement.setInt(4, 50);
            preparedStatement.setDate(5, new java.sql.Date(new Date().getTime()));

            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Item 3");
            preparedStatement.setDouble(3, 7.49);
            preparedStatement.setInt(4, 75);
            preparedStatement.setDate(5, new java.sql.Date(new Date().getTime()));

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            System.out.println("Records inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

