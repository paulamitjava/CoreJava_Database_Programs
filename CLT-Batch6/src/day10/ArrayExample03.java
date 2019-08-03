package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer{
	String name;
	Customer(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object o){
        if(o instanceof Customer){
        	Customer p = (Customer) o;
             return this.name.equals(p.getName());
        } else
             return false;
    }
	
} // end of Customer

public class ArrayExample03 {
	public static void main(String[] args) {

		List refList = new ArrayList();
		
		refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));

		System.out.println(refList);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		if (refList.contains(name)) {
			System.out.println("sorry..");
		} else {
			refList.add(new Customer(name));
			System.out.println(refList);
		}
		
	}

}

