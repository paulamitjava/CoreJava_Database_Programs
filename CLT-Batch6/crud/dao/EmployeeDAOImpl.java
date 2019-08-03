package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import connection.DBConnection2;
import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		conRef = DBConnection2.myConnection();
	}
	
	@Override
	public void addEmployee(Employee refEmployee) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("insert into employee(id,name,password) values (?,?,?)");
			psRef.setInt(1,refEmployee.getEmployeeID());
			psRef.setString(2,refEmployee.getEmployeeName());
			psRef.setString(3,refEmployee.getEmployeePassword());
	
			psRef.executeUpdate();
			System.out.println("Record Added Successfully..");
		} 
		catch (SQLException e) {
			System.out.println("Ëxception caught.. Not able to add record..");
		}  
		
		finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught.. not able to close connection");
			}
		}
	}

	@Override
	public void updateEmployee(Employee refEmployee) {
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("update employee set name = ?,password = ? where id = ?");
			
			psRef.setString(1,refEmployee.getEmployeeName());
			psRef.setString(2, refEmployee.getEmployeePassword());
			psRef.setInt(3,refEmployee.getEmployeeID());
			
			psRef.executeUpdate();
			
			System.out.println("Record updated successfully!");
		}
		catch (Exception e) {
			System.out.println("Exception caught.. not able to update Record");
		}
	}

	@Override
	public List<Employee> viewAllEmployee(Employee refEmployee) {
		
		getConnection();
		List<Employee> list=new ArrayList<Employee>();		
		try {
			psRef = conRef.prepareStatement("select * from employee");
			ResultSet rs = psRef.executeQuery();
		
			if(rs.next()){ 
				do{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}while(rs.next());
			}
			
			/*if(rs.next()) {
				do {
				refEmployee.setEmployeeID(rs.getInt(1));
				refEmployee.setEmployeeName(rs.getString(2));
				refEmployee.setEmployeePassword(rs.getString(3));
			
				list.add(refEmployee);
				
				}while(rs.next());
			} // end of if
			*/
		} // end of try
		
		catch (Exception e) {
				System.out.println("Exception caught.. not able to get Employee Details..");
		} // end of catch
		
		return list;
	} // end of viewAllEmployee
} // end of EmployeeDAOImpl
