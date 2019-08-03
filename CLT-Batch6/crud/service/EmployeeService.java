package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
		void callAddEmployee(Employee refEmployee);
		void callUpdateEmployee(Employee refEmployee);
		List<Employee> callViewAllEmployee(Employee refEmployee);
}
