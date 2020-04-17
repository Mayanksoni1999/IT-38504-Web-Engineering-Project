package code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import code.DatabaseConnection;

/**
 * Servlet implementation class InsertSLP
 */
@WebServlet("/InsertSLP")
public class InsertSLP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertSLP() {
        // super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter out = response.getWriter(); 
		try { 

			// Initialize the database 
			Connection con = DatabaseConnection.initializeDatabase(); 

			// Create a SQL query to insert data into demo table 
			// demo table consists of two columns, so two '?' is used 
			PreparedStatement st = con.prepareStatement("insert into service_level values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"); 
			
			st.setString(1, request.getParameter("city"));
			st.setInt(2, Integer.valueOf(request.getParameter("1")));
			st.setInt(3, Integer.valueOf(request.getParameter("2")));
			st.setInt(4, Integer.valueOf(request.getParameter("3")));
			st.setInt(5, Integer.valueOf(request.getParameter("4")));
			st.setInt(6, Integer.valueOf(request.getParameter("5")));
			st.setInt(7, Integer.valueOf(request.getParameter("6")));
			st.setInt(8, Integer.valueOf(request.getParameter("7")));
			st.setInt(9, Integer.valueOf(request.getParameter("8")));
			st.setInt(10, Integer.valueOf(request.getParameter("9")));
			st.setInt(11, Integer.valueOf(request.getParameter("10")));
			st.setInt(12, Integer.valueOf(request.getParameter("11")));
			st.setInt(13, Integer.valueOf(request.getParameter("12")));
			st.setInt(14, Integer.valueOf(request.getParameter("13")));
			st.setInt(15, Integer.valueOf(request.getParameter("14")));
			st.setInt(16, Integer.valueOf(request.getParameter("15")));
			st.setInt(17, Integer.valueOf(request.getParameter("16")));
			st.setInt(18, Integer.valueOf(request.getParameter("17")));
			st.setInt(19, Integer.valueOf(request.getParameter("18")));
			st.setInt(20, Integer.valueOf(request.getParameter("19")));
			st.setInt(21, Integer.valueOf(request.getParameter("20")));
			st.setInt(22, Integer.valueOf(request.getParameter("21")));
			st.setInt(23, Integer.valueOf(request.getParameter("22")));
			st.setInt(24, Integer.valueOf(request.getParameter("23")));
			st.setInt(25, Integer.valueOf(request.getParameter("24")));
			st.setInt(26, Integer.valueOf(request.getParameter("25")));
			st.setInt(27, Integer.valueOf(request.getParameter("26")));
			st.setInt(28, Integer.valueOf(request.getParameter("27")));
			st.setInt(29, Integer.valueOf(request.getParameter("28")));
			st.setInt(30, Integer.valueOf(request.getParameter("29")));
			st.setInt(31, Integer.valueOf(request.getParameter("30")));
			st.setInt(32, Integer.valueOf(request.getParameter("31")));
			st.setInt(33, Integer.valueOf(request.getParameter("32")));
			st.setInt(34, Integer.valueOf(request.getParameter("33")));
			st.setInt(35, Integer.valueOf(request.getParameter("34")));
			st.setInt(36, Integer.valueOf(request.getParameter("35")));
			st.setInt(37, Integer.valueOf(request.getParameter("36")));
			st.setInt(38, Integer.valueOf(request.getParameter("37")));
			st.setInt(39, Integer.valueOf(request.getParameter("38")));
			st.setInt(40, Integer.valueOf(request.getParameter("39")));
			
			
			
			
			
			// For the first parameter, 
			// get the data using request object 
			// sets the data to st pointer 
			
			
			//st.setInt(1, Integer.valueOf(request.getParameter("qt1"))); 

			// Same for second parameter 
			
			
			//st.setString(2, request.getParameter("qt2")); 

			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			con.close(); 

			// Get a writer pointer 
			// to display the successful result 
			
			out.println("<html><body><b>Successfully Inserted"
						+ "</b></body></html>"); 
		} 
		catch (Exception e) { 
			e.printStackTrace();
			out.println("<html><body><b>City Already Exists!"
					+ "</b></body></html>"); 
		} 
		
	
	}

}
