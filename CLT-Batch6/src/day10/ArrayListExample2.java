package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList refList = new ArrayList();
		refList.add("data1");
		refList.add("data2");
		refList.add("data3");
		refList.add("data4");
		refList.add("data5");
		
		
		// System.out.println(refList);
	
		ListIterator itr = refList.listIterator();
		
		System.out.println("forward direction");
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("\nbackward direction");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
		
	}

}
