package com.fardoush.mybusadmin.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="route_stoppages")
public class RouteStoppage {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "route_stoppage_id", updatable = false, nullable = false)
	private int routeStoppageId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="route_id")
	private Route route;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="stoppage_id")
	private Stoppage stoppage; 
	
	/*Serial number for the stoppage in context of specific route**/	 
	@Column(name = "route_stoppage_serial", updatable = true, nullable = false)
	private int routeStoppageSerial;
	
	/**
	 * Edge time refers required time to reach from previous stoppage to current stoppage
	 * 
	 * Time Unit: Minute
	 * */
	@Column(name = "rs_edge_time", updatable=true, nullable=false)
	private int edgeTime;

	/**How much time bus will wait in this stoppage*/
	@Column(name = "rs_wait_time", updatable=true, nullable=false)
	private int waitTime;
	
	/**Stoppage is active for specific route or not**/
	@Column(name= "route_stoppage_isActive", updatable=true, nullable=false)
	private int isActive;
	
	public RouteStoppage() {
		super();

	}


	public int getRouteStoppageId() {
		return routeStoppageId;
	}

	public void setRouteStoppageId(int routeStoppageId) {
		this.routeStoppageId = routeStoppageId;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Stoppage getStoppage() {
		return stoppage;
	}

	public void setStoppage(Stoppage stoppage) {
		this.stoppage = stoppage;
	}

	public int getRouteStoppageSerial() {
		return routeStoppageSerial;
	}

	public void setRouteStoppageSerial(int routeStoppageSerial) {
		this.routeStoppageSerial = routeStoppageSerial;
	}

	public int getEdgeTime() {
		return edgeTime;
	}

	public void setEdgeTime(int edgeTime) {
		this.edgeTime = edgeTime;
	}

	public int getWaitTime() {
		return waitTime;
	}


	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}



	public int getIsActive() {
		return isActive;
	}


	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
