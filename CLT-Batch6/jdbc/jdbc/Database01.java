package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database01 {
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step - 1 : call your prepareConnection() from MyConnection class
		Connection con= MyConnection.prepareConnection();
		
		//Execute a query
        System.out.println("Creating table in given database...");
		Statement st = con.createStatement();
        
		
		// create table
		/*String sql = "CREATE TABLE students " +
                "(mobile INTEGER not NULL, " +
                " name VARCHAR(25), " + 
                " email varchar(35), " + 
                " PRIMARY KEY (mobile))"; 
			st.executeUpdate(sql); // for saving purpose
		System.out.println("Created table in given database...");*/
		
		
	/*	// insert record
		String sql = "INSERT INTO students " +
                "VALUES (676098612, 'yugal', 'yugal@gmail.com')";
		st.executeUpdate(sql);
		
		System.out.println("Data Inserted Successfully..");
*/		
		
		
		
		//edit a record
		String sql = "UPDATE students " +
                "SET name = 'vikas' WHERE mobile in (960168910)";
		st.executeUpdate(sql);
		System.out.println("Record Modified Successfully...");
	
		
		// delete a record 
				/*String sql = "DELETE FROM students " +
		                "WHERE mobile = 96016891";
				st.executeUpdate(sql);
				System.out.println("Record Deleted from table Successfully..");
				*/
	
	// Retrieve Data from Table
		/*String sql = "SELECT mobile, name, email FROM students";
	      ResultSet rs = st.executeQuery(sql);
	      
	      //STEP 5: Extract data from result set
	      
	             
	      System.out.println("\n\n");
	      System.out.println("Mobile\t\t"+"Name"+"\t\t"+"Email");
	      System.out.println("==========================================================");
	      
	      while(rs.next()){
	       System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
	      }*/
	     
	}
	

}
