package code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Direct_Observation_Response
 */
@WebServlet("/Direct_Observation_Response")
public class Direct_Observation_Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Direct_Observation_Response() {
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
				.prepareStatement("insert into direct_observation  values(?,?,?,?,?,?,?,?,?,?)"); 

			// For the first parameter, 
			// get the data using request object 
			// sets the data to st pointer 
			st.setString(1, (request.getParameter("city"))); 

			// Same for second parameter 
			String[] qdr2=request.getParameterValues("2");
			int result2=0;
			for(int i=0;i<qdr2.length;i++) {
				result2+=Integer.valueOf(qdr2[i]);
			}
			String[] qdr8=request.getParameterValues("8");
			int result8=0;
			for(int i=0;i<qdr8.length;i++) {
				result8+=Integer.valueOf(qdr8[i]);
			}
			st.setInt(2, Integer.valueOf(request.getParameter("1"))); 
			//st.setInt(3, Integer.valueOf(request.getParameter("qdr2"))); 
			st.setInt(3, result2);
			st.setInt(4, Integer.valueOf(request.getParameter("3"))); 
			st.setInt(5, Integer.valueOf(request.getParameter("4"))); 
			st.setInt(6, Integer.valueOf(request.getParameter("5"))); 
			st.setInt(7, Integer.valueOf(request.getParameter("6"))); 
			st.setInt(8, Integer.valueOf(request.getParameter("7"))); 
			//st.setInt(9, Integer.valueOf(request.getParameter("qdr8"))); 
			st.setInt(9,result8);
			st.setInt(10, Integer.valueOf(request.getParameter("9"))); 
			
			

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
			out.println("<html><body><b>You have already responded for city."
						+ "</b></body></html>"); 
			
	}

	}}
