

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		String user = request.getParameter("Uname");
		String pass = request.getParameter("Password");
		PrintWriter ob = response.getWriter();
		
		try {
		if(user.equals("admin")&&pass.equals("admin123")) {
			ob.println("Welcome admin");
			
			RequestDispatcher rd = request.getRequestDispatcher("AdminHome.html");
			rd.forward(request, response);
		}
		else {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Task","root","Tony@143");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select*from Register");
			
			int flag=0;
			while(rs.next()) {
				
				String dbUser = rs.getString("UserName");
				String dbpass = rs.getString("Password");
				if(user.equals(dbUser)&&pass.equals(dbpass)) {
					ob.println("Welcome User");
					flag=1;
					RequestDispatcher rd = request.getRequestDispatcher("UserHome.html");
					rd.forward(request, response);
				}
				
			}
			if(flag==0) {
				ob.println("userName & Password is incorrent");
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}
		}
		}
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
