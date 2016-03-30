package jdbc;
import java.sql.*;
public class InsertingRecords {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

  
  static final String USER = "root";
  static final String PASS = "beehyv123";
  
  public static void main(String[] args) {
  Connection conn = null;
  Statement stmt = null;
  try{
     
     Class.forName("com.mysql.jdbc.Driver");

     
     System.out.println("Connecting to a selected database...");
     conn = DriverManager.getConnection(DB_URL, USER, PASS);
     System.out.println("Connected database successfully...");
     
     
     System.out.println("Inserting records into the table...");
     stmt = conn.createStatement();
     
     String sql = "INSERT INTO types " +
                  "VALUES (2, 'Ali', 'moen', 18)";
     stmt.executeUpdate(sql);
     sql = "INSERT INTO types " +
                  "VALUES (3, 'Sunil', 'Naidu', 25)";
     stmt.executeUpdate(sql);
     sql = "INSERT INTO types " +
                  "VALUES (4, 'Brahma', 'Nandam', 30)";
     stmt.executeUpdate(sql);
     sql = "INSERT INTO types " +
                  "VALUES(5, 'Sumit', 'Mittal', 28)";
     stmt.executeUpdate(sql);
     System.out.println("Inserted records into the table...");

  }catch(SQLException se){
     
     se.printStackTrace();
  }catch(Exception e){
     
     e.printStackTrace();
  }finally{
     
     try{
        if(stmt!=null)
           conn.close();
     }catch(SQLException se){
     }
     try{
        if(conn!=null)
           conn.close();
     }catch(SQLException se){
        se.printStackTrace();
     }
  }
  
}
}
