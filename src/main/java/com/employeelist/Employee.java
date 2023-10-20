package com.employeelist;


public class Employee {

int empID;


String empName;
int empSalary;

//generate setter getter
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}


//generate constructor
/**
 * @param empID
 * @param empName
 * @param empSalary
 */
public Employee(int empID, String empName, int empSalary) {
	super();
	this.empID = empID;
	this.empName = empName;
	this.empSalary = empSalary;
}

//generate to string
@Override
public String toString() {
	return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]\n";
}

//create no arg constructor
public Employee() {
	
}


}
