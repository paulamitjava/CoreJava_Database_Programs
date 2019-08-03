package reservation;
public class BusReservation implements Runnable{
	private int totalSeatsAvailable=5;
	

	public void run() {
		//BusReservation br = new BusReservation();
		Passenger pt = (Passenger) Thread.currentThread();
		boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());
		if(ticketsBooked==true){
			System.out.println("\tCongratulations!!  "+Thread.currentThread().getName()+" .. The number of seats requested ["+pt.getSeatsNeeded()+"]  are BOOKED Successfully..");
		}else{
			System.out.println("\n\tSorry "+Thread.currentThread().getName()+" .. The number of seats requested("+pt.getSeatsNeeded()+")  are not available");	
		}
	}
	
  public  synchronized boolean bookTickets(int seats, String name){
	  System.out.println("\n\tTickets Available : "+this.getTotalSeatsAvailable());
		
		if (seats>this.getTotalSeatsAvailable()) {
			return false;
		} else {
			
			totalSeatsAvailable = totalSeatsAvailable-seats;
			
			return true;
		}
	}

	private int getTotalSeatsAvailable() {
		return totalSeatsAvailable;
	}

}
