package reservation;

public class ReservationApplication{
	

	public static void main(String[] args){
			BusReservation br = new BusReservation();
			Passenger pt1 = new Passenger(2,br,"Sulianto");
			Passenger pt2 = new Passenger(2, br, "Razli");
			Passenger pt3 = new Passenger(3, br, "Karthik");
		//	Passenger pt4 = new Passenger(6, br, "test4");
		//	Passenger pt5 = new Passenger(1, br, "test5");
			pt1.start();
			pt2.start();
			pt3.start();
		//	pt4.start();
		//	pt5.start();
	}
}
