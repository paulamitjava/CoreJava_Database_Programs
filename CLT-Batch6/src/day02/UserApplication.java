package day02;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		
		String userID = sc.next(); // take data from console and store to userID
		
		System.out.println("Enter Password : ");
		
		String userPassword = sc.next(); // take data from console and store to userPassword
		
		
		System.out.println("Enter Age : ");
		
		int userAge = sc.nextInt(); // take data from console and store to userAge
		
		
		// create an object of User class
		
		User refUser = new User();
		
		// set the values to setter methods
		refUser.setAge(userAge);
		refUser.setUserID(userID);
		refUser.setUserPassword(userPassword);
		
		
		// call the getter methods
		
		System.out.println(refUser.getAge() + " "+refUser.getUserID()+ " "+refUser.getUserPassword());
		
		} // end of main()

} // end of UserApplication class
