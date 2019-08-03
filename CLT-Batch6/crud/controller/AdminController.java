package controller;

import java.util.List;
import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class AdminController {

	Employee refEmployee;
	EmployeeService refEmployeeService;
	Scanner sc;
	
	public void adminProcess() {
		refEmployee	= new Employee(); 
		refEmployeeService = new EmployeeServiceImpl();
		sc = new Scanner(System.in);
		
		// userInputAddEmployee();
		// userInputUpdateEmployee();
		printEmployeeDetails();
		
		
	} // end of adminProcess
	
	void userInputAddEmployee() {
				
		System.out.println("Enter Employee ID : ");
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		refEmployee.setEmployeeName(empName);
		
		System.out.println("Enter Employee Password : ");
		String empPassword = sc.next();
		refEmployee.setEmployeePassword(empPassword);
		
		refEmployeeService.callAddEmployee(refEmployee);
		
		
	} // end of userInput
	
	void userInputUpdateEmployee() {
		
		System.out.println("Enter Employee ID : ");
		int empID = sc.nextInt();
		refEmployee.setEmployeeID(empID);
		
		System.out.println("Change Employee Name : ");
		String empName = sc.next();
		refEmployee.setEmployeeName(empName);
		
		System.out.println("Change Employee Password : ");
		String empPassword = sc.next();
		refEmployee.setEmployeePassword(empPassword);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
		
	} // end of userInput
	
	void printEmployeeDetails() {

		System.out.println("ID\tName\tPawword");
		System.out.println("========================");
		refEmployeeService.callViewAllEmployee(refEmployee);
		/*List<Employee> refList = refEmployeeService.callViewAllEmployee(refEmployee);
		for (Employee employee : refList) {
			System.out.println(employee.getEmployeeID()+""+employee.getEmployeeName()+""+employee.getEmployeePassword());
		}*/		
	}
}
