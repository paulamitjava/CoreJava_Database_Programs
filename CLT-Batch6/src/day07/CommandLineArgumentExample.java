package day07;

public class CommandLineArgumentExample {

	public static void main(String[] city) {
		
		String cityNames[] = city;

		// System.out.println(cityNames[0]);
		
		for (String temp : cityNames) {
			System.out.println(temp);
		}
	}

}
