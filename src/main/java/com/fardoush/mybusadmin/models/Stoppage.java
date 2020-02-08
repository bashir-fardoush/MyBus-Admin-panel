package com.fardoush.mybusadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stoppages")
public class Stoppage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="stoppage_id", updatable=false, nullable=false)
	private int stoppageId;
	
	@Column(name="stoppage_name", updatable=true, nullable=false)
	private String StoppageName;
	
	@Column(name="stoppage_lat", updatable=true, nullable=false)
	private double stoppageLat;
	
	@Column(name="stoppage_lon", updatable=true, nullable=false)
	private double stoppageLon;

	@Column(name="stoppage_isActive", updatable=true, nullable=false)
	private boolean isAcive;
	
	@Column(name="stoppage_open_date", updatable=true, nullable=true)
	private String openDate;
	
	@Column(name="stoppage_close_date", updatable=true, nullable=true)
	private String closeDate;

	public Stoppage() {
		super();
	
	}

	public Stoppage(int stoppageId, String stoppageName, double stoppageLat, double stoppageLon, boolean isAcive,
			String openDate, String closeDate) {
		super();
		this.stoppageId = stoppageId;
		StoppageName = stoppageName;
		this.stoppageLat = stoppageLat;
		this.stoppageLon = stoppageLon;
		this.isAcive = isAcive;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}

	public Stoppage(String stoppageName, double stoppageLat, double stoppageLon, boolean isAcive, String openDate,
			String closeDate) {
		super();
		StoppageName = stoppageName;
		this.stoppageLat = stoppageLat;
		this.stoppageLon = stoppageLon;
		this.isAcive = isAcive;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}

	public int getStoppageId() {
		return stoppageId;
	}

	public void setStoppageId(int stoppageId) {
		this.stoppageId = stoppageId;
	}

	public String getStoppageName() {
		return StoppageName;
	}

	public void setStoppageName(String stoppageName) {
		StoppageName = stoppageName;
	}

	public double getStoppageLat() {
		return stoppageLat;
	}

	public void setStoppageLat(double stoppageLat) {
		this.stoppageLat = stoppageLat;
	}

	public double getStoppageLon() {
		return stoppageLon;
	}

	public void setStoppageLon(double stoppageLon) {
		this.stoppageLon = stoppageLon;
	}

	public boolean isAcive() {
		return isAcive;
	}

	public void setAcive(boolean isAcive) {
		this.isAcive = isAcive;
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
		return "Stoppage [stoppageId=" + stoppageId + ", StoppageName=" + StoppageName + ", stoppageLat=" + stoppageLat
				+ ", stoppageLon=" + stoppageLon + ", isAcive=" + isAcive + ", openDate=" + openDate + ", closeDate="
				+ closeDate + "]";
	}


	
	
}
