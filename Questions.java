package minimum;
import java.util.*;

public class Question {
	
	//fields
	private String assignedQuestion;
	private ArrayList<String> questions_answers = new ArrayList<String>();
	
	public Question(String question) {
	assignedQuestion = question;
	}

	public ArrayList<String> answer() {
		Scanner reader = new Scanner(System.in);
		System.out.println(this.assignedQuestion);
		String answer = reader.next();
		reader.close();
		ArrayList<String> question_answer = new ArrayList<String>();
		questions_answers.add(assignedQuestion);
		questions_answers.add(answer);
		return question_answer;
	}
	
	
	public ArrayList<String> get_Question_answers(){
		return questions_answers;
	}
}
