package zooregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static zooregister.ZooRegister.main;

public class ZooRegisterDatabase {

  Connection con = null;

    public static void main(String[] args) {
        ZooRegisterDatabase database = new ZooRegisterDatabase();
        try {
            database.test();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ZooRegisterDatabase() {

        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Class found");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Zoo_Data;user=Nadia;password=zxcvbnm");
            System.out.println("Database found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }

    public void test() throws SQLException {
        ResultSet results = con.createStatement().executeQuery("Select * from Animal");
        while (results.next()) {
            System.out.println(results.getString("Name"));
        }

    }
} 
