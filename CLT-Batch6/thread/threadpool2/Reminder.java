package threadpool2;

import java.util.concurrent.*;

class Reminder implements Runnable {
	public void run() {
		// send reminder emails to all employees
		System.out.println("All Mails sent");
	}
}
