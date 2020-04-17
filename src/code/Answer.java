package code;

public class Answer {
int form_category,question_category,marks;
String option_category;
String option_name;
public Answer(int form_category, int question_category, int marks, String option_category, String option_name) {
	super();
	this.form_category = form_category;
	this.question_category = question_category;
	this.marks = marks;
	this.option_category = option_category;
	this.option_name = option_name;
}
public int getForm_category() {
	return form_category;
}
public void setForm_category(int form_category) {
	this.form_category = form_category;
}
public int getQuestion_category() {
	return question_category;
}
public void setQuestion_category(int question_category) {
	this.question_category = question_category;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getOption_category() {
	return option_category;
}
public void setOption_category(String option_category) {
	this.option_category = option_category;
}
public String getOption_name() {
	return option_name;
}
public void setOption_name(String option_name) {
	this.option_name = option_name;
}


}
