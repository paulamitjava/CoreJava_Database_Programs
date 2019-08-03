package day08;

public class EmployeeDetails implements MyPrototype{

	int empID;
	String empName;
	String designation;
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public MyPrototype clone() throws CloneNotSupportedException {
		System.out.println("\nCloning MyPrototype object");
		return (MyPrototype)super.clone();
	} // end of clone
	
	void showRecord() {
		System.out.println("\nEmploye ID\tEmployee Name\tEmployee Designation");
		System.out.println("================================================");
		System.out.println(empID+"\t\t"+empName+ "\t\t"+designation);
	} // end of showRecord

}
