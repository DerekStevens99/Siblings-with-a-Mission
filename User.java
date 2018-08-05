package minimum;
import java.util.ArrayList;


public class User {

	/* Fields */
	private String name;
	private String password;
	private ArrayList<Question> questions = new ArrayList<Question>();

	/* Constructor */
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}	
	
	/* Setter Methods */
	public void setName(String newName) {
		name = newName;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}


	/* Getter Methods */
	public String getName() {
		return name;
	}

	public String getPassword() { 
		return password;
	}
	
	
	public static void main(String args[]) {
		User derek = new User("derek", "password");
		System.out.println(derek.getName());
		Question quest = new Question("Where do you live?");
		quest.answer();
		System.out.println(quest.get_Question_answers().get(1));
	}

}
