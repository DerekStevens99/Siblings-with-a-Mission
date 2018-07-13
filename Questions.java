import java.util.ArrayList;
import java.util.List;

public class Questions {

	/* Fields */
	ArrayList<String> questionsList = new ArrayList<>;
	int size = questionsList.size;

	/* Constructor */
	// The constructor doesn't need anything passed because
	// we can always just change or add to the questionsList
	// with methods. These are here for testing purposes.
	public Questions() {
		questionsList.add("Name?");
		questionsList.add("Age?");
		questionsList.add("Password?");
		questionsList.add("Email?");
	}

	/* Setter Methods */
	public void addQuestion(String newQuestion) {
		questionsList.add(newQuestion);
	}

	public void setQuestion(int index, String newQuestion) {
		questionsList.set(index, newQuestion);
	}

	public void removeQuestion(int index) {
		questionsList.remove(index);
	}

	/* Getter Methods */
	public String getQuestion(int index) {
		return questionsList(index);
	}

	// Not sure when we'd need this functionality but just in case
	public String getQuestionIndex(String question) { 
		private int count = 0;
		for(String elem : questionsList) {
			if(question.equals(elem)) {
				return count;
			}
			count++;
		}
	}


}