package day01;

public class Customer { // Customer is a name of the class
	
	// declare variable
	int age = 20;  // has a relationship
	String NRIC = "AA898765JH"; // has a relationship
	
	void customerDetails(int age, String NRIC) { // method
		System.out.println(age);
		System.out.println(NRIC);
	}

	public static void main(String[] args) {
		
		// create an object of Customer class
		Customer refCustomer = new Customer(); // object we create by using new operator
		
		// call the method through the reference
		refCustomer.customerDetails(10,"GR234565TT");
		
	}

}
