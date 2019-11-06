package com.deepti.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLDao {

	static Scanner sc = new Scanner(System.in);

	public Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		// Register and load the driver for jdbc
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Initializing variables for jdbc connection to mysql
		// through jdbc driver -> mysql database ->localhost->port 3306->database
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "Swara@01";

		// Create the connection
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

	
	public Employee getEmployeeDetails() {

		System.out.println("Enter employee details below :");
		System.out.println("Employee Id :");
		int emp_id = Integer.parseInt(sc.nextLine());

		System.out.println("Name :");
		String emp_name = sc.nextLine();

		System.out.println("Last Name :");
		String emp_last_name = sc.nextLine();

		System.out.println("Gender :");
		String emp_gender = sc.nextLine();

		System.out.println("Position :");
		String emp_position = sc.nextLine();

		System.out.println("Dept :");
		int emp_dept = Integer.parseInt(sc.nextLine());

		System.out.println("Salary :");
		long emp_salary = Integer.parseInt(sc.nextLine());

		return new Employee(emp_id, emp_name, emp_last_name, emp_gender, emp_position, emp_dept, emp_salary);
	}
	
	
	public void AddNewEmployeeDetails() throws SQLException, ClassNotFoundException {

	 
		Connection con =  getMySQLConnection();
		Employee e =  getEmployeeDetails();
		System.out.println(e);

		String query = "insert into employees values (?,?,?,?,?,?,?)";

		PreparedStatement st = con.prepareStatement(query);

		st.setInt(1, e.emp_id);
		st.setString(2, e.name);
		st.setString(3, e.last_name);
		st.setString(4, e.gender);
		st.setString(5, e.position);
		st.setInt(6, e.dept_id);
		st.setLong(7, e.salary);

		int rowsAffected = st.executeUpdate();

		System.out.println("New Employee inserted into the table" + rowsAffected);
		st.close();

	}
	
	
	public void displayAllRowsinTable() throws SQLException, ClassNotFoundException {
	 
		Connection con =  getMySQLConnection();

		ResultSet rs = null;
		Statement st1 = con.createStatement();
		String query1 = "Select * from employees";

		rs = st1.executeQuery(query1);

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getInt(7));
		}

		rs.close();
		st1.close();
		con.close();
	}
	
	
	public Employee getEmployeeObjectfromTable() throws SQLException, ClassNotFoundException {

		Connection con = getMySQLConnection();

		String query = "Select * from employees where emp_id = ?";
		System.out.println("Enter employee id you want details of:");
		int emp_id = sc.nextInt();

		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, emp_id);
		ResultSet rs = st.executeQuery();
		rs.next();

		Employee e = new Employee(emp_id, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
				rs.getInt(6), rs.getLong(7));

		rs.close();
		st.close();
		con.close();
		return e;

	}
	
	public void deleteAEmployeeFromTable(int emp_id) throws ClassNotFoundException, SQLException {
		
		Connection con = getMySQLConnection();
		
		String query = "Delete from employees where emp_id = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, emp_id);
		int rs = st.executeUpdate();
		
		if(rs>=1) {
			System.out.println("The row was deleted");
		}
		 
		st.close();
		con.close();
		 
	}


}
