package com.techtalentsouth.SubcriberList.Subscriber;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Subscriber {
	
	@Id //annotation allows for auto generated number id
	@GeneratedValue(strategy=GenerationType.AUTO)   //this is part of the database
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	@Column
	@CreationTimestamp
	private Date dateCreated;
	
	
	public Subscriber() {
		
	}
	
	public Subscriber(String firstName, String lastName, String email, String userName, String password,
			Date dateOfBirth, Date dateCreated) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.dateCreated = dateCreated;
	}




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	//this is being automatically set
//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
	
	
	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	
	
	
}
