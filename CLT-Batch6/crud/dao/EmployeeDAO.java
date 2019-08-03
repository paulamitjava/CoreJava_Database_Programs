package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee refEmployee);
	public void updateEmployee(Employee refEmployee);
	public List<Employee> viewAllEmployee(Employee refEmployee);
	
	
}
