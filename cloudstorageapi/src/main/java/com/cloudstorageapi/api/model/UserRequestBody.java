package com.cloudstorageapi.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserRequestBody {
 
	private int userId;

	 
	private String userName;
	 
	private int parentUserId;
	  
	private Date createdAt;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getParentUserId() {
		return parentUserId;
	}

	public void setParentUserId(int parentUserId) {
		this.parentUserId = parentUserId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
 
 

}
