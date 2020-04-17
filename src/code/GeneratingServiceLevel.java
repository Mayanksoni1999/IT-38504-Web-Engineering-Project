package code;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


public class GeneratingServiceLevel {
	int ques_no=1;
	public ArrayList<Question> showques(String s) {
	try {
	Connection con = DatabaseConnection.initializeDatabase(); 
	ques_no=1;
	Statement st = con.createStatement();
	String sql="select form_category,question_category,question from question_table where form_category= "+s;
	ResultSet a =st.executeQuery(sql);
	ArrayList<Question> final_lst=new ArrayList<Question>();
	while(a.next()) {
		String question=a.getString("question");
		int question_category=Integer.parseInt(a.getString("question_category"));
		int form_category=Integer.parseInt(a.getString("form_category"));
		final_lst.add(new Question(form_category,question_category,question));
	}
	
	
	return final_lst;
	
}
	catch (Exception e) { 
		e.printStackTrace(); 
	}
	return null;
}
	
	public ArrayList<Answer> showoptions() {
		try {
		Connection con = DatabaseConnection.initializeDatabase(); 
		Statement st = con.createStatement();
		String sql="select * from option_table where form_category=1 and question_category="+String.valueOf(ques_no);
		ResultSet a =st.executeQuery(sql);
		ArrayList<Answer> final_lst=new ArrayList<Answer>();
		while(a.next()) {
			String option=a.getString("option_name");
			int question_category=Integer.parseInt(a.getString("question_category"));
			int form_category=Integer.parseInt(a.getString("form_category"));
			int marks=Integer.parseInt(a.getString("marks"));
			String option_id=a.getString("option_category");
			final_lst.add(new Answer(form_category,question_category,marks,option_id,option));
		}
		ques_no+=1;
		
		
		return final_lst;
		
	}
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return null;
	}
	
	
}
	
	


