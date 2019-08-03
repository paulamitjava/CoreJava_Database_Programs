package threadpool2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Hotel {
	ExecutorService service = Executors.newFixedThreadPool(5);

	public void orderFood(Order order) {
		service.submit(order);
	}

	public void hotelClosedForDay() {
		service.shutdown();
	}

	public void hotelClosedForever() {
		service.shutdown();
		try {
			if (!service.awaitTermination(60, TimeUnit.SECONDS)) {
				service.shutdownNow();
				if (!service.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			service.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}
