package day01;

import java.util.Scanner;

/*class User{
	// userID take as String
	// userPassword take as String
}*/

class AuthenticationLogic{
	
	String userID, userPassword; // are we going to hold the value???
	boolean status;
	
	public void upserInput(String userID, String localVariable) { // we are going to hold the value
		this.userID = userID; // this.globalVariable = localVariable (if both names are same)
		userPassword=localVariable; // globalVariable = localVariable (if names are different)
		checkValidateStatus();
	} // end of userInput()
	
	void checkValidateStatus(){
		validateUser();
		if (validateUser() == true) {
			System.out.println("Welcome..");
		}
		else {
			System.out.println("Not Valid..");
		}
	}
	
	// write a logic to validate user
	public boolean validateUser() {
		if (userID.equals("admin") && userPassword.equals("admin123")) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
} // end of AuthenticationLogic


public class UserLoginAuthentication {

	public static void main(String[] args) {
		
		// Scanner class helps to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserID : ");
		String userID = sc.next();
		System.out.println("Enter UserPassword : ");
		String userPassword = sc.next();
		AuthenticationLogic ref = new AuthenticationLogic();
		ref.upserInput(userID,userPassword);

	}

}
