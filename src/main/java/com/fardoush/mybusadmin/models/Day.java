package com.fardoush.mybusadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "days")
public class Day {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="day_id", updatable=false, nullable=false)
	private int dayId;
	
	@Column(name="day_name", updatable=false, nullable=false)
	private String dayName;

	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Day(int dayId, String dayName) {
		super();
		this.dayId = dayId;
		this.dayName = dayName;
	}

	public int getDayId() {
		return dayId;
	}

	public void setDayId(int dayId) {
		this.dayId = dayId;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	
	
	
	
	

}
