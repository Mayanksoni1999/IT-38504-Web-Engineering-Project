package code;

public class Question {
	int form,ques;
	String question;
	public Question(int form, int ques, String question) {
		super();
		this.form = form;
		this.ques = ques;
		this.question = question;
	}
	public int getForm() {
		return form;
	}
	public void setForm(int form) {
		this.form = form;
	}
	public int getQues() {
		return ques;
	}
	public void setQues(int ques) {
		this.ques = ques;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

}
