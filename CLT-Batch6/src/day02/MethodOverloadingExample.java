package day02;

public class MethodOverloadingExample { 

	public static void main(String[] args) { // step 1 - execution starts here
		System.out.println("class loader loads this main..");
		main(20); // step - 2
		System.out.println("final print.. "); // step - 8
	} // end of main

	public static void main(int number) {  // step - 3 
		main("data"); // step 4
		System.out.println(number); // step - 7
	} // end of main

	public static void main(String reference) { // step - 5
		System.out.println(reference); // step - 6
	} // end of main

} // end of MethodOverloadingExample class
