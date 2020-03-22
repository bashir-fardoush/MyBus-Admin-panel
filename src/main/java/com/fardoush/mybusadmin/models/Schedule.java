package com.fardoush.mybusadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="schedules")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="sch_id", updatable=false, nullable=false)
	private int scheduleId;
	

	@ManyToOne
	@JoinColumn(name="sch_bus_id")
	private Bus bus;
	
	@ManyToOne
	@JoinColumn(name="sch_route_id")
	private Route route;
	
	
	@ManyToOne
	@JoinColumn(name="sch_driver_id")
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name="sch_day_id")
	private int dayId;
	
	@Column(name="sch_start_time", updatable=true, nullable=false)
	private String startTime;
	
	@Column(name="sch_start_time", updatable=true, nullable=false)
	private String endTime;
	
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getScheduleId() {
		return scheduleId;
	}


	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}


	public Bus getBus() {
		return bus;
	}


	public void setBus(Bus bus) {
		this.bus = bus;
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


	public int getDayId() {
		return dayId;
	}


	public void setDayId(int dayId) {
		this.dayId = dayId;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
		
	
}
