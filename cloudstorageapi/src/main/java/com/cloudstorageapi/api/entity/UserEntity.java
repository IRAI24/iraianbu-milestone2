package com.cloudstorageapi.api.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "hemavathy_users")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int userId;
    
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(name = "parent_user_id", nullable = false)
	private int parentUserId;
	 
	@Column(name = "created_at", nullable = false)
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
