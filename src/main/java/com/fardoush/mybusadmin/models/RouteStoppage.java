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
	
	@Column(name = "route_stoppage_serial", updatable = true, nullable = false)
	private int routeStoppageSerial;

	public RouteStoppage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RouteStoppage(int routeStoppageId, Route route, Stoppage stoppage, int routeStoppageSerial) {
		super();
		this.routeStoppageId = routeStoppageId;
		this.route = route;
		this.stoppage = stoppage;
		this.routeStoppageSerial = routeStoppageSerial;
	}

	public RouteStoppage(Route route, Stoppage stoppage, int routeStoppageSerial) {
		super();
		this.route = route;
		this.stoppage = stoppage;
		this.routeStoppageSerial = routeStoppageSerial;
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
	
	
	
	
}
