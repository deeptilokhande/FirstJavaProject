package com.deepti.SQL;

public class Employee implements Comparable<Employee> {
	
	public int emp_id;
	public String name;
	public String last_name;
	public String gender;
	public String position;
	public int dept_id;
	public long salary;

	
	static class B {
		static int weird=45;
	}
	
	public Employee() {}
	
	public Employee(int emp_id, String name, String last_name, String gender, String position, int dept_id,
			long salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.last_name = last_name;
		this.gender = gender;
		this.position = position;
		this.dept_id = dept_id;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return String.format(
				"Employee [emp_id=%s, name=%s, last_name=%s, gender=%s, position=%s, dept_id=%s, salary=%s]", emp_id,
				name, last_name, gender, position, dept_id, salary);
	}


	 
	public int compareTo(Employee o) {
		
	  return this.emp_id > o.emp_id ? 1:-1;	 
	}
	
	 
	

}

