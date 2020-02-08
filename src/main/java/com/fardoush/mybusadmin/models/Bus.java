package com.fardoush.mybusadmin.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="buses")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="bus_id", updatable=false, nullable=false)
	private int busId;
	
	@Column(name="bus_name", updatable=true, nullable=false, length=100)
	private String busName;
	
	@Column(name="bus_type", updatable=true, nullable=false, length=30)
	private String busType;
	
	@Column(name="bus_isActive", updatable=true, nullable=false)
	private boolean isActive;
	
	@Column(name="bus_desc", updatable=true, nullable=true)
	private String busDescription;
	
	@Column(name="bus_open_date", updatable=true, nullable=true)
	private String openDate;
	
	@Column(name="bus_close_date", updatable=true, nullable=true)
	private String closeDate;
	
	@ManyToOne
	@JoinColumn(name="route_id")
	private Route route;
	
	@OneToOne(mappedBy = "bus")
	private Driver driver;

	public Bus() {
		
	}

	public Bus( String busName, String busType, boolean isActive, String busDescription, String openDate,
			String closeDate) {
		super();
		
		this.busName = busName;
		this.busType = busType;
		this.isActive = isActive;
		this.busDescription = busDescription;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}
	
	public Bus(int busId, String busName, String busType, boolean isActive, String busDescription, String openDate,
			String closeDate) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busType = busType;
		this.isActive = isActive;
		this.busDescription = busDescription;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getBusDescription() {
		return busDescription;
	}

	public void setBusDescription(String busDescription) {
		this.busDescription = busDescription;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busType=" + busType + ", isActive=" + isActive
				+ ", busDescription=" + busDescription + ", openDate=" + openDate + ", closeDate=" + closeDate + "]";
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
