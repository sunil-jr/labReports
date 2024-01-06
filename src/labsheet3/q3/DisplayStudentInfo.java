package labsheet3.q3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudentInfo {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "mysqlroot778$";

        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            Statement statement = connection.createStatement();

            String query = "SELECT Roll, Name, Address, Program FROM student";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int roll = resultSet.getInt("Roll");
                String name = resultSet.getString("Name");
                String address = resultSet.getString("Address");
                String program = resultSet.getString("Program");

                System.out.println("Roll: " + roll);
                System.out.println("Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Program: " + program);
                System.out.println("-------------------------");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

