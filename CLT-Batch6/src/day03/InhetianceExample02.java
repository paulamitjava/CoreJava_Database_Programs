package day03;

class Bank{

	Bank(String location){
		System.out.println("I am in default constructor ==> Bank"+location);
	}
} // end of Bank

class DigitalBank extends Bank{
	
	DigitalBank(String location, int code) {
		super(location); // we must use super keyword to call parent class constructor
		System.out.println(code); // 1234
		// either we can print location here or we can call parent class constructor
	}
	
} // end of DigitalBank

/*class ChildClassOfDigitalBank extends DigitalBank{
	 // you can write the code and show to me
}*/

public class InhetianceExample02 {
	public static void main(String[] args) {
		
		new DigitalBank("Digibank",1234); // it will line no 12

	}

}
