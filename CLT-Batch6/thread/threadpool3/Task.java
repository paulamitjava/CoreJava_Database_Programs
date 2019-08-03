package threadpool3;

import java.util.concurrent.TimeUnit;

// With an executor, you only have to implement the Runnable objects and 
// send them to the executor. It is responsible for their execution, 
// instantiation, and running with necessary threads. But it goes beyond that 
// and improves performance using a pool of threads.

// Create a task to execute 
class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Doing a task during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
