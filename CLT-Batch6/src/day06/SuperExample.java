package day06;

class SuperClass{
	int number = 20;
} // end of SuperClass

class SubClass extends SuperClass{
	final int number = 30;
	
	void accessNumber(int num) {
		//number = num; // we can't re assign the value
		System.out.println(this.number); // this means current class
		System.out.println(super.number); // this means parent class
	} // end of accessNumber
} // end of SubClass

public class SuperExample {

	public static void main(String[] args) {
		new SubClass().accessNumber(10);
	}

}
