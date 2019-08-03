package threadpool2;

import java.util.concurrent.Callable;

class Order implements Callable<Void> {
	String name;

	Order(String name) {
		this.name = name;
	}

	public Void call() throws Exception {
		System.out.println(name);
		if (name.equalsIgnoreCase("berry"))
			throw new Exception("Berry unavailable");
		return null;
	}
}
