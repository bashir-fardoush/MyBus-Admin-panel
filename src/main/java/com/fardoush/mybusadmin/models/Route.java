package com.fardoush.mybusadmin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="routes")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="route_id", updatable=false, nullable=false)
	private int routeId;
	
	@Column(name="route_title", updatable=true, nullable=false, length= 100)
	private String routeTitle;
	
	@Column(name="route_isActive", updatable=true, nullable=false)
	private boolean isActive;
	
	@Column(name="route_open_date", updatable=true, nullable=true)
	private String openDate;
	
	@Column(name="route_close_date", updatable=true, nullable=true)
	private String closeDate;
	
	/*@ManyToMany(targetEntity = Stoppage.class, cascade = CascadeType.ALL)
	@JoinTable(name = "route_stoppage",
		joinColumns = @JoinColumn(name="route_id", referencedColumnName = "route_id"),
		inverseJoinColumns = @JoinColumn(name="stoppage_id", referencedColumnName = "stoppage_id"))
	private List<Stoppage> stoppageList;*/
	
	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	private List<RouteStoppage> routeStoppages;
	
	
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Route(int routeId, String routeTitle, boolean isActive, String openDate, String closeDate) {
		super();
		this.routeId = routeId;
		this.routeTitle = routeTitle;
		this.isActive = isActive;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}
	

	public Route( String routeTitle, boolean isActive, String openDate, String closeDate) {
		super();
		
		this.routeTitle = routeTitle;
		this.isActive = isActive;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getRouteTitle() {
		return routeTitle;
	}

	public void setRouteTitle(String routeTitle) {
		this.routeTitle = routeTitle;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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

	public List<RouteStoppage> getRouteStoppages() {
		return routeStoppages;
	}

	public void setRouteStoppages(List<RouteStoppage> routeStoppages) {
		this.routeStoppages = routeStoppages;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeTitle=" + routeTitle + ", isActive=" + isActive + ", openDate="
				+ openDate + ", closeDate=" + closeDate + ", routeStoppages=" + routeStoppages + "]";
	}

	


	
	

	

}
