
//By using Executor framework

package basic;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
	 
class MyClass11 implements Runnable{
	 
    @Override
	    public void run() {
	        System.out.println("MyClass1 created by using Executor Framework");
    		show2();
	    }
    
		void show2(){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your name :");
			String name = sc.next();
			System.out.println(name);
		}
	}

class MyClass12 implements Runnable{
	 
    @Override
	    public void run() {
	        System.out.println("MyClass2 created by using Executor Framework");
	        show1();
    		System.out.println(toString());
	    }
    	String name;
    	void show1(){
    		Scanner sc = new Scanner(System.in);
    		System.out.println("enter your name :");
    		String name = sc.next();
    		this.name=name;
    	}
    	public String toString(){
    		return name;
    	}
	}

public class Thread01 {
	 
	    public static void main(String[] args) {
	        //ExecutorService executor = Executors.newSingleThreadExecutor();
	        ExecutorService executor = Executors.newCachedThreadPool();
	        //ExecutorService executor = Executors.newFixedThreadPool(10);
	        executor.execute(new MyClass11());
	        executor.execute(new MyClass12());
	    }
}

	/* Fixed Thread Pool

    a) At any point, at most n Threads threads will be active processing tasks.
    b) If a thread is not available for the task, the task is put in queue waiting for another task to ends.
    c) If any thread terminates due to a failure during execution prior to shutdown, a new one will take 
       its place if needed to execute subsequent tasks.
    d) The threads in the pool will exist until it is explicitly shutdown. */


	/* Cached Thread Pool

    a) A thread pool that creates as many threads it needs to execute the task in parallel.
    b) The old available threads will be reused for the new tasks.
    c) If a thread is not used for 60 seconds, it will be terminated and removed from the pool.
    d) Suitable for applications that launch many short-lived tasks. */




