package com.velocity.quiz;

public class RegistrationField {
	
	  private String firstName;
	   private String lastName;
	   private String userName;
	   private String userPassword;
	   private String City;
	   private long mobileNumber;
	   private String userEmail;
	   
	   
	   
	
	public RegistrationField(String firstName, String lastName, String userName, String userPassword, String city,
			int mobileNumber, String userEmail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userPassword = userPassword;
		  this.City = city;
		this.mobileNumber = mobileNumber;
		this.userEmail = userEmail;
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




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getUserPassword() {
		return userPassword;
	}




	public void setUserPassword(String userPassword) {
	
		this.userPassword = userPassword;
		}



	public String getCity() {
		return City;
	}




	public void setCity(String city) {
		City = city;
	}




	public long getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getUserEmail() {
		return userEmail;
	}




	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}





}
