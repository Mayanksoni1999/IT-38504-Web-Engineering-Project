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

/**
 * Servlet implementation class Citizen_Response
 */
@WebServlet("/Citizen_Response")
public class Citizen_Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Citizen_Response() {
        super();
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
		try { 

			// Initialize the database 
			Connection con = DatabaseConnection.initializeDatabase(); 

			// Create a SQL query to insert data into demo table 
			// demo table consists of two columns, so two '?' is used 
			PreparedStatement st = con 
				.prepareStatement("insert into citizen_feedback values(?,?,?,?,?,?,?,?,?,?,?,?,?)"); 

			// For the first parameter, 
			// get the data using request object 
			// sets the data to st pointer 
			st.setString(1, (request.getParameter("state"))); 

			// Same for second parameter 
			st.setString(2, request.getParameter("city")); 
			st.setString(4, (request.getParameter("name"))); 
			st.setInt(3,Integer.valueOf( request.getParameter("age")));
			st.setString(6, (request.getParameter("gender1"))); 
			st.setString(5, request.getParameter("number"));
			st.setInt(7, Integer.valueOf(request.getParameter("q1"))); 
			st.setInt(8, Integer.valueOf(request.getParameter("q2"))); 
			st.setInt(9, Integer.valueOf(request.getParameter("q3"))); 
			st.setInt(10, Integer.valueOf(request.getParameter("q4"))); 
			st.setInt(11, Integer.valueOf(request.getParameter("q5"))); 
			st.setInt(12, Integer.valueOf(request.getParameter("q6"))); 
			st.setInt(13, Integer.valueOf(request.getParameter("q7"))); 
			

			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			con.close(); 

			// Get a writer pointer 
			// to display the successful result 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Successfully Inserted"
						+ "</b></body></html>"); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>You Have Already Responded for the City."
						+ "</b></body></html>"); 
		} 
	}

}
