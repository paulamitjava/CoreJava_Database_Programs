package day05;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {
		
		// step : 1 
		Mobile refMobile = new Mobile();
		
		// step : 2
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter your text : ");
		String myText = sc.next();
		
		// step : 3
		Chat refChat = new Chat();
		refChat.setChat(myText); // this argument will set the value to setter method in Chat class
		
		// step : 4
		WhatsApp refWhatsApp = new WhatsApp();
		refMobile.setRefWhatsApp(refWhatsApp);
		
		refWhatsApp.setRefChat(refChat);
		
		// step : 5
		System.out.println(refMobile.getRefWhatsApp().getRefChat().getChat());
		

	}

}
