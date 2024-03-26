

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddUserDetails")
public class AddUserDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("Uname");
		String pass = request.getParameter("Password");
		String Cpassword= request.getParameter("Con_Password");
		
		PrintWriter ob = response.getWriter();
		ob.println("Username"+" "+uname);
		ob.println("Password"+" "+pass);
		ob.println("Confirm_Password"+" "+Cpassword);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Task","root","Tony@143");
			Statement st= con.createStatement();
			int value = st.executeUpdate("insert into Register(UserName,Password,Con_Password) values ('"+uname+"' , '"+pass+"' , '"+Cpassword+"');");
			
			if(value==1) {
				System.out.println("record inserted");
			}
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
