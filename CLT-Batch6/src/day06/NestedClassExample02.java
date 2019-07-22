package day06;

public class NestedClassExample02 {
	
	class MyInnerClass1{ // non-static inner class
		void myMthod1() {
			System.out.println("I am in MyInnerClass1 ==> myMthod1");
		}
		/*
		static void myMethod2() { // compilation error, we can't write static method in non-static inner class
			
		}
		*/
		
	} // end of MyInnerClass1
	
	static class MyInnerClass2{ // static inner class
		
		void myMethod3() {
			System.out.println("I am in MyInnerClass2 ==> myMthod3");
		}
		
		static void myMethod4() {
			System.out.println("I am in MyInnerClass2 ==> myMthod4");
		}
	} // end of MyInnerClass2
	
	void access() {	
		
		class MyInnerClass3{ // method local inner class
			
			void myMethod5() {
				System.out.println("I am in MyInnerClass2 ==> access ==> myMthod5");
			}
			/*
			static void myMethod6() { // compilation error, we can't write static method inside non-static inner class
			}*/
			
		} // end of MyInnerClass3
	} // end of access

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
