//Authentication Service

package com.matchzone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	
	@Id
	private String userEmail;
	private String userPassword;
	private String userName;
	private String userRole = "Employee";
	
	public User()
	{
		
	}
	
	public User(String userName, String userEmail, String userPassword, String userRole)
	{
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	
	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}


	public String getUserEmail() 
	{
		return userEmail;
	}
	
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}
	public String getUserRole() 
	{
		return userRole;
	}
	public void setUserRole(String userRole) 
	{
		this.userRole = userRole;
	}
	
	@Override
	public String toString() 
	{
		return "User [userEmail=" + userEmail + ", userPassword=" + userPassword + ", userRole=" + userRole + "]";
	}

}