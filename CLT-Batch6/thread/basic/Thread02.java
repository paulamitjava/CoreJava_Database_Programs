
// By implementing Runnable interface

package basic;

class MyClass2 implements Runnable{
		 
	    @Override
	    public void run() {
	        System.out.println("Thread created by implementing Runnable interface");
	    }
	}


public class Thread02 {
	 
	    public static void main(String[] args) {
	        Thread thread = new Thread(new MyClass2());
	        thread.start();
	    }
	 
	}