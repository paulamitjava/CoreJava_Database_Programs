package day04;

// interface is a fully abstract class
interface Bank{ // we use interface keyword to create an interface
	void deposit(); // method is abstract by default
	void withdrow(); // abstract is optional to write
	void checkBalance();
	// int code; // we can't declare like this, compilation error
	final static int code = 204050; // we have to declare variable value, by default it is final and static
} // end of Bank

interface UserLoginCredential{
	void userLogin();
	void userLogout();
} // end of UserLoginCredential

// functional interface : Java 1.8 version onwards

@FunctionalInterface
interface SingleMethod{ // functional interface can't have more than one abstract method
	void method1();
	// void method2(); 
} // end of SingleMethod

// Java 1.8 new feature ==> default method in interface
interface DefaultMethod extends SingleMethod{ // interface can extends another interface
	default public void myMethod() {
		System.out.println("from Java 1.8 version we can have method with a body..");
	}
} // end of DefaultMethod



class CitiBank implements Bank,UserLoginCredential{ // Java supports multiple inheritance by using interface

	@Override
	public void deposit() {
	}

	@Override
	public void withdrow() {
	}

	@Override
	public void checkBalance() {
	}

	@Override
	public void userLogin() {
	
	}

	@Override
	public void userLogout() {
		
	}
}


public class InterfaceExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
