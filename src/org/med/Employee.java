package org.med;

public class Employee {
	//based on number of arguments
	public void empName() {
		System.out.println("EMPLOYEE NAME:SUBI");	
	}
	public void empName(int age, int rollno ) {
     System.out.println(age);
     System.out.println(rollno);
	}
	//datatypes
	public void empSalary(float salary) {
		System.out.println(salary);		
	}
	public void empName(String name) {
		System.out.println(name);
		
	}
	//based on order of arguments
	public void empName(float salary,long phno) {
		System.out.println(salary);
		System.out.println(phno);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		e.empName(27,1235);
		e.empSalary(25200.35f);
		e.empName(32567.987f,9849874323l);
		e.empName("Prasanth");
	}

}
