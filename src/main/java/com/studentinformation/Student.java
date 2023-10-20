
package com.studentinformation;

public class Student {
int stud_ID;
String stud_Name;
int stud_Age;



//generate setter getter
public int getStud_ID() {
	return stud_ID;
}
public void setStud_ID(int stud_ID) {
	this.stud_ID = stud_ID;
}
public String getStud_Name() {
	return stud_Name;
}
public void setStud_Name(String stud_Name) {
	this.stud_Name = stud_Name;
}

public int getStud_Age() {
	return stud_Age;
}
public void setStud_Age(int stud_Age) {
	this.stud_Age = stud_Age;
}
//genetare constructor

/**
 * @param stud_ID
 * @param stud_Name
 * @param stud_Age
 * @param stud_Salary
 */
public Student(int stud_ID, String stud_Name, int stud_Age) {
	super();
	this.stud_ID = stud_ID;
	this.stud_Name = stud_Name;
	this.stud_Age = stud_Age;
	
}


//generate to string

@Override
public String toString() {
	return "Student [stud_ID=" + stud_ID + ", stud_Name=" + stud_Name + ", stud_Age=" + stud_Age + "]\n";
}



//create no arg constructor 
public Student() {
	
}


}
