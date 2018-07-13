import java.util.ArrayList;
import java.util.List;

public class User {

	/* Fields */
	String name;
	String password;
	int[] responseIDs = new int[4]; 

	/* Constructor */
	public User(String thisName; String thisPassword; int ID1; int ID2; int ID3; int ID4) {
		name = thisName;
		password = thisPassword;
		responseIDs[0] = ID1;
		responseIDs[0] = ID1;
		responseIDs[0] = ID1;    // Not sure how to loop through variables in a constructor
		responseIDs[0] = ID1;
	}

	/* Setter Methods */
	public void setName(String newName) {
		name = newName;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public void setResponseID(int index, int newID) {
		responseIDs[index] = newID;
	}

	/* Getter Methods */
	public String getName() {
		return name;
	}

	public String getPassword() { 
		return password;
	}

	public int getResponseID(int index) {
		return responseIDs[index];
	}
}