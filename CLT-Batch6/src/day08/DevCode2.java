package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DevCode2 {
	
	// 1. handle NullPointerException (pointing null)
	// 2. handle NumberFormatException (BufferedReader)
	// 3. handle InputMismatchException (Scanner)
	
	static void logic() throws IOException {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number = sc.nextInt();
		System.out.println(number);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number2 : ");
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
		
	}

}
