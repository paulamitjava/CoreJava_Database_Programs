package day02;

class Laptop{
	
	Laptop(){
		this(20);
		System.out.println("hello I am in default constructor..");
	}
	
	Laptop(int price){
		this(30,"Apple");
		System.out.println(price); //20
	}
	
	
	Laptop(int price, String brand){
		System.out.println(price+ " "+brand); // 30 Apple
	}
	
} // end of class Laptop

public class ConstructorChainingExample {
	public static void main(String[] args) {
		new Laptop();
		
	}
}
