package day03;

class Student{
	String name="Tom";
	
	@Override
	public String toString() {
		return name + " "+200;
	}
}

public class ToStringExample {

	public static void main(String[] args) {
		
		System.out.println(new Student());

	}

}
