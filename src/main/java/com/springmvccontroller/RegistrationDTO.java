
package com.springmvccontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// ek class create karaych ani tya madhe
//third way aahe yachya madhe registration  jsp page madhe name property la je name dile aahe te same name 
// field la ghyaych 
@Entity
@Table(name="Registration_DTO")
public class RegistrationDTO {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="User_ID")
int userID;

@Column(name="User_Name")
String username;

@Column(name="Email")
String email;

@Column(name="Password")
String password;

@Column(name="Password_Confirm")
String password_confirm;

@Column(name = "Registration_deleted")
String registrationDeleted="N";


//generate setter and getter
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword_confirm() {
	return password_confirm;
}
public void setPassword_confirm(String password_confirm) {
	this.password_confirm = password_confirm;
}

public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}

public String getRegistrationDeleted() {
	return registrationDeleted;
}
public void setRegistrationDeleted(String registrationDeleted) {
	this.registrationDeleted = registrationDeleted;
}
 
//no arg constructor
public RegistrationDTO() {
	
}

//generate To String
@Override
public String toString() {
	return "RegistrationDTO [userID=" + userID + ", username=" + username + ", email=" + email + ", password="
			+ password + ", password_confirm=" + password_confirm + ", registrationDeleted=" + registrationDeleted
			+ "]";
}

}
