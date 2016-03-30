package registrationDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  
      String name = request.getParameter("name");
      String email = request.getParameter("email");
      String pass = request.getParameter("pass");
      try{
      
        
       
        Class.forName(JDBC_DRIVER);
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        

        
        Connection  con=DriverManager.getConnection("jdbc:mysql://localhost/training","root","beehyv123");
        

        PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?)");

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);
        int i=ps.executeUpdate();
      
        if(i>0)
        {
          out.println("You are sucessfully registered");
        }
      
        }
       catch(SQLException se){
        
          se.printStackTrace();}
        catch(Exception e)
        {
          e.printStackTrace();
        }
	}

}
