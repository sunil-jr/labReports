package labsheet3.q2;


import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeDataManagement {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/ayush_java";
        String username = "root";
        String password = "mysqlroot778$";

        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(dbURL);
            jdbcRowSet.setUsername(username);
            jdbcRowSet.setPassword(password);
            jdbcRowSet.setCommand("SELECT * FROM employee");
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                System.out.println("Employee ID: " + jdbcRowSet.getInt("EmployeeID"));
                System.out.println("Name: " + jdbcRowSet.getString("Name"));
                System.out.println("Salary: " + jdbcRowSet.getInt("Salary"));
                System.out.println("------------------");
            }

            jdbcRowSet.beforeFirst();
            while (jdbcRowSet.next()) {
                if (jdbcRowSet.getInt("EmployeeID") == 5) {
                    jdbcRowSet.updateInt("Salary", 50000);
                    jdbcRowSet.updateRow();
                }
            }


            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(dbURL);
            cachedRowSet.setUsername(username);
            cachedRowSet.setPassword(password);
            cachedRowSet.setCommand("SELECT * FROM employee");
            cachedRowSet.execute();
            cachedRowSet.moveToInsertRow();
            cachedRowSet.updateInt("EmployeeID", 5);
            cachedRowSet.updateString("Name", "New Employee");
            cachedRowSet.updateInt("Salary", 60000);
            cachedRowSet.insertRow();
            cachedRowSet.moveToCurrentRow();
            cachedRowSet.acceptChanges();
            ((Connection) cachedRowSet).setAutoCommit(false);

            System.out.println("Employee added successfully.");

            jdbcRowSet.close();
            cachedRowSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

