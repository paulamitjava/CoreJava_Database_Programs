package reservation;
public class Passenger extends Thread{
	
		private int seatsNeeded;

		public Passenger(int seats, Runnable target, String name) {
			super(target,name);
			this.seatsNeeded = seats;
		}

		public int getSeatsNeeded() {
			return seatsNeeded;
		}
	

}
