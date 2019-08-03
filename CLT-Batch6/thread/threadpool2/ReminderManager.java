package threadpool2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ReminderMgr {
	ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
	Reminder reminder = new Reminder();

	public void sendReminders() {
		service.scheduleAtFixedRate(reminder, 0, 24,TimeUnit.HOURS);
	}

	public static void main(String args[]) {
		ReminderMgr mgr = new ReminderMgr();
		mgr.sendReminders();
	}
}

