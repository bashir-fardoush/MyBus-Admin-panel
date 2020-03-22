package com.fardoush.mybusadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="user_id", updatable=false, nullable=false)
	private int userId;
	
	@Column(name="user_name", updatable=true, nullable=false)
	private String userName;
	
	@Column(name="user_type", updatable=true, nullable=false)
	private String userType;
	
	@Column(name="user_email", updatable=true, nullable=true)
	private String userEmail;
	
	@Column(name="user_phone", updatable=true, nullable=true)
	private String userPhone;
	
	@Column(name="user_isApproved", updatable=true, nullable=false)
	private boolean isApproved;
	
	@Column(name="user_address", updatable=true, nullable=true)
	private String userAddress;
	
	@Column(name="user_join_date", updatable=true, nullable=true)
	private String joinDate;
	
	@Column(name="user_resign_date", updatable=true, nullable=true)
	private String resignDate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getResignDate() {
		return resignDate;
	}

	public void setResignDate(String resignDate) {
		this.resignDate = resignDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + ", isApproved=" + isApproved + ", userAddress=" + userAddress
				+ ", joinDate=" + joinDate + ", resignDate=" + resignDate + "]";
	}
	
	
	

}
