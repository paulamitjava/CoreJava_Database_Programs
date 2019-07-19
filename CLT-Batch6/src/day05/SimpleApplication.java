package day05;

class A{
	
	B refB; // class A has a reference of class B
	
	// setter method
	/*public void setRefB(B refB) {
		this.refB = refB;
	}*/
	
	// constructor
	A(B refB){
		this.refB = refB;
	} // end of constructor
	
	 public B getRefB() {
		return refB;
	}
	 
} // end of class A

class B{
	C refC;
	
	// setter
	/*public void setRefC(C refC) {
		this.refC = refC;
	}*/
	
	// constructor
	B(C refC){
		this.refC = refC;
	} // end of constructor
	
	public C getRefC() {
		return refC;
	}
	
} // end of class B

class C{
	String name;
	
	// setter method
	/*public void setName(String name) {
		this.name = name;
	}*/
	
	// constructor
	C(String name){
		this.name=name;
	} // end of constructor
	
	public String getName() {
		return name;
	}
} // end of class C
public class SimpleApplication {

	public static void main(String[] args) {
		C refC = new C("hello");
		B refB = new B(refC);
		A refA = new A(refB);
		
		
		//refC.setName("hello");
		
		//refA.setRefB(refB);
		//refB.setRefC(refC);
		
		System.out.println(refA.getRefB().getRefC().getName());
	}

}
