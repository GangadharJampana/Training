package jdbc;

import java.sql.*;

public class FirstExample {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost:3306/training";

  //  Database credentials
  static final String USER = "root";
  static final String PASS = "beehyv123";
  
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM Persons where PersonID=1";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        int id  = rs.getInt("PersonID");
        String first = rs.getString("FirstName");
        String last = rs.getString("LastName");

        System.out.print("id: " + id);
        System.out.print(", First: " + first);
        System.out.println(", Last: " + last);
      }
        rs.close();
        stmt.close();
        conn.close();
    }
    catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
  }
}
