package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO refEmployeeDAO;

	@Override
	public void callAddEmployee(Employee refEmployee) { // call or invoke
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);

	}

	@Override
	public void callUpdateEmployee(Employee refEmployee) {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.updateEmployee(refEmployee);
	}

	@Override
	public List<Employee> callViewAllEmployee(Employee refEmployee) {
		refEmployeeDAO = new EmployeeDAOImpl();
		return refEmployeeDAO.viewAllEmployee(refEmployee);
	}
	
	

}
