package code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import code.DatabaseConnection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/**
 * Servlet implementation class Result_Processing
 */
@WebServlet("/Result_Processing")
public class Result_Processing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result_Processing() {
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
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			Statement st = con.createStatement();
			String sql="select city,qcert1+qcert2 as Certification_Score from certification_feedback";
			Statement st1 = con.createStatement();
			String sql1="select city,q1+q2+q3+q4+q5+q6+q7 as Citizen_Score from citizen_feedback";
			Statement st2 = con.createStatement();
			String sql2="select city,q1+q2+q3+q4+q5+q6+q7+q8+q9 as Direct_Score from direct_observation";
			Statement st3 = con.createStatement();
			String sql3="select city, qt1+qt2+qt3+qt4+qt5+qt6+qt7+qt8+qt9+ qp1+qp2+qp3+qp4+qp5+qp6+qp7+qp8+qp9+qp10+qp11+qp12+qp13+qss1+qss2+qss3+qss4+qss5+qss6+qss7+qss8+qss9+qss10+qss11+qss12+qib1+qib2+qib3+qcb1+qcb2 as Service_Score from service_level";
			
			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			ResultSet a =st.executeQuery(sql);
			ResultSet b =st1.executeQuery(sql1);
			ResultSet c =st2.executeQuery(sql2);
			ResultSet d =st3.executeQuery(sql3);
			PrintWriter out = response.getWriter(); 
			
			
			while(a.next()) {
				String city=a.getString("city");
				city = city.toUpperCase();
				int score=Integer.valueOf(a.getString("Certification_Score"));
				if(map.containsKey(city)) {
					int old_score=map.get(city);
					old_score+=score;
					map.replace(city, old_score);
				}
				else {
					map.put(city, score);
				}
					
			}
				
				while(b.next()) {
					String city=b.getString("city");
					city = city.toUpperCase();
					int score=Integer.valueOf(b.getString("Citizen_Score"));
					if(map.containsKey(city)) {
						int old_score=map.get(city);
						old_score+=score;
						map.replace(city, old_score);
					}
					else {
						map.put(city, score);
					}
				}
				while(c.next()) {
					String city=c.getString("city");
					city = city.toUpperCase();
					int score=Integer.valueOf(c.getString("Direct_Score"));
					if(map.containsKey(city)) {
						int old_score=map.get(city);
						old_score+=score;
						map.replace(city, old_score);
					}
					else {
						map.put(city, score);
					}
						
				}
				
				
				while(d.next()) {
					String city=d.getString("city");
					city = city.toUpperCase();
					int score=Integer.valueOf(d.getString("Service_Score"));
					if(map.containsKey(city)) {
						int old_score=map.get(city);
						old_score+=score;
						map.replace(city, old_score);
					}
					else {
						map.put(city, score);
					}
						
				}
				out.println(map);
				
				Map<Integer, String> sorted_map = sortByValues(map); 
			/*
			 * System.out.println("After Sorting:"); Set set2 = sorted_map.entrySet();
			 * Iterator iterator2 = set2.iterator(); while(iterator2.hasNext()) { Map.Entry
			 * me2 = (Map.Entry)iterator2.next(); System.out.print(me2.getKey() + ": ");
			 * System.out.println(me2.getValue()); }
			 */
			  
			      
		      request.setAttribute("ranks", sorted_map);
		      request.getRequestDispatcher("/Result.jsp").forward(request, response);
				
				
			// Close all the connections 
		 

			// Get a writer pointer 
			// to display the successful result 
			
			
			st.close(); 
			con.close();
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Error."
						+ "</b></body></html>"); 
		} 
	}


private static HashMap sortByValues(HashMap map) { 
    List list = new LinkedList(map.entrySet());
    // Defined Custom Comparator here
    Collections.sort(list, new Comparator() {
         public int compare(Object o1, Object o2) {
            return ((Comparable) ((Map.Entry) (o2)).getValue())
               .compareTo(((Map.Entry) (o1)).getValue());
         }
    });

    // Here I am copying the sorted list in HashMap
    // using LinkedHashMap to preserve the insertion order
    HashMap sortedHashMap = new LinkedHashMap();
    for (Iterator it = list.iterator(); it.hasNext();) {
           Map.Entry entry = (Map.Entry) it.next();
           sortedHashMap.put(entry.getKey(), entry.getValue());
    } 
    return sortedHashMap;
}
}