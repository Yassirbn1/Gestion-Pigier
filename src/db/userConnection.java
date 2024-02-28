package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class userConnection {
        static Connection conn = null;

    public static Connection getConn() {
        return conn;
    }
        
    public static void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:src/db/pigierDB";
            // create a connection to the database
                conn = DriverManager.getConnection(url);
                System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertIntoDB(String sql){
          try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
              System.out.println("DB insert Error: " + e.getMessage());
              System.out.println("Cause: " + e.getCause());
        }
    }
    
    public static ResultSet selectFromDB(String sql){
        ResultSet resultSet = null;
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            
        }catch (SQLException e){
                System.out.println("DB select Error: " + e.getMessage());
                System.out.println("Cause: " + e.getCause());
            }
        return resultSet;
    }
    
    public static void deletefromDB(String sql){
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch (SQLException e){
                System.out.println("DB delete Error: " + e.getMessage());
                System.out.println("Cause: " + e.getCause());
            }
    }
            
    public static void closeConnection(){
        try {
            conn.close();
            System.out.println("Connection to SQLite has been closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

