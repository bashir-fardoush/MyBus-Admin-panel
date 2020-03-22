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
	
	@Column(name="driver_name", updatable=true, nullable=false)
	private String driverName;
	
	
	@Column(name="driver_email", updatable=true, nullable=true)
	private String driverEmail;
	
	@Column(name="driver_phone", updatable=true, nullable=true)
	private String driverPhone;
		
	@Column(name="driver_address", updatable=true, nullable=true)
	private String driverAddress;
	
	@Column(name="driver_join_date", updatable=true, nullable=true)
	private String joinDate;
	
	@Column(name="driver_resign_date", updatable=true, nullable=true)
	private String resignDate;

	
	@Column(name="driver_license_info", updatable=true, nullable=true)
	private String licenseInfo; 
	
	@Column(name="driver_isActive", updatable=true, nullable=false)
	private boolean isActive;

	public Driver() {
		super();
	
	}


	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverEmail() {
		return driverEmail;
	}

	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
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
	
	

}
