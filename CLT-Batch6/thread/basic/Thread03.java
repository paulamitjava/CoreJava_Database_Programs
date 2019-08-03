
// By extending thread class

package basic;

class MyClass3 extends Thread{
		 
	    @Override
	    public void run() {
	        System.out.println("Thread created by extending thread class");
	    }
	}

public class Thread03 {
	 
	    public static void main(String[] args) {
	 
	        MyClass3 thread = new MyClass3();
	        thread.start();
	    }
	 
	}