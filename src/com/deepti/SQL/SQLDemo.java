package com.deepti.SQL;
//Import sql package
import java.sql.*;
import java.util.Scanner;


public class SQLDemo {
	

 Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		SQLDemo demo = new SQLDemo();
		
		//To get particular employee details from the table
		//Employee x= demo.getEmployeeObject();
		//System.out.println(x);
		
		//Execute the statement to add new rows to table
		 //demo.AddNewEmployee();
		
		//to display all rows in a table
	   demo.displayAllRows();	
		
		//to delete a row from table
		//demo.deleteAEmployee();
	    
	    Employee e = new Employee();
	    int weird = Employee.B.weird;
	   // System.out.println(weird);
	    
		
	}
	
	public Employee getEmployeeObject() throws ClassNotFoundException, SQLException {
		SQLDao sqlDAO = new SQLDao();
		return sqlDAO.getEmployeeObjectfromTable();
	}

	public void AddNewEmployee() throws ClassNotFoundException, SQLException {
		SQLDao sqlDAO = new SQLDao();
		sqlDAO.AddNewEmployeeDetails();
	}
	
	public void displayAllRows() throws SQLException, ClassNotFoundException{
		SQLDao sqlDAO = new SQLDao();
		sqlDAO.displayAllRowsinTable();
	}
	
	
	public void deleteAEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("Enter employee_id of employee to be deleted :");
		int emp_id = sc.nextInt();
		SQLDao sqlDAO = new SQLDao();
		sqlDAO.deleteAEmployeeFromTable(emp_id);
	}
	

	
	
	
	
	}
