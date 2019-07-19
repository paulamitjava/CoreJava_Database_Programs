package day02;

// example of encapsulation
// hibernate / JPA(Java Persistance API) ==> application area of POJO class
// this User class also knows as ==> POJO class / entity class

public class User {

	private String userID;
	private String userPassword;
	int age;
	
	// setter methods
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	// getter methods
	
	public int getAge() {
		return age;
	}
	
	
	public String getUserID() {
		return userID;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
}
