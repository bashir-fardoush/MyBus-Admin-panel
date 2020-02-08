package com.fardoush.mybusadmin.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="drivers")
public class Driver {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="driver_id", updatable=false, nullable=false)
	private int driverId;
	
	@Column(name="driver_license_info", updatable=true, nullable=true)
	private String licenseInfo; 
	
	@Column(name="driver_isActive", updatable=true, nullable=false)
	private boolean isActive;

	/* @OneToOne Annotation does not make desired field UNIQUE
	 * In a unidirectional relationship you will get the expected unique constraint if you mark it
	 *  as "optional=false". You also get it if you set the join column explicitly as unique, of course.	 * 
	 * */

	@OneToOne(optional = false)
	@JoinColumn(name="user_id")
	private User userInfo;
	
	@OneToOne(optional = false)
	@JoinColumn(name="bus_id", unique=true)
	private Bus bus;
	
	

	public Driver() {
		super();
	
	}
	
	
	public Driver( String licenseInfo, boolean isActive) {
		super();
	
		this.licenseInfo = licenseInfo;
		this.isActive = isActive;
	}
	
	
	public Driver(int driverId, String licenseInfo, boolean isActive) {
		super();
		this.driverId = driverId;
		this.licenseInfo = licenseInfo;
		this.isActive = isActive;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getLicenseInfo() {
		return licenseInfo;
	}


	public void setLicenseInfo(String licenseInfo) {
		this.licenseInfo = licenseInfo;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", licenseInfo=" + licenseInfo + ", isActive=" + isActive + "]";
	}


	public User getUserInfo() {
		return userInfo;
	}


	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}


	public Bus getBus() {
		return bus;
	}


	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	
	
	
	
	
	
}
