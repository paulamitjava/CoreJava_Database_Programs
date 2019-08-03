package basic;

interface Netra{
	void show(); // abstract method
}

// without implementing the interface how to override show method
class Tushar {
	
	Netra ref = new Netra(){

		@Override
		public void show() {
			System.out.println("hello");
			
		}
		
	};
	
}

// with implements Interface

class Yugal implements Netra{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
