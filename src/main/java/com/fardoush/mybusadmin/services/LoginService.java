	package com.fardoush.mybusadmin.services;

import java.util.ArrayList;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import com.fardoush.mybusadmin.configs.HibernateConfig;
import com.fardoush.mybusadmin.models.Bus;
import com.fardoush.mybusadmin.models.Driver;
import com.fardoush.mybusadmin.models.Route;
import com.fardoush.mybusadmin.models.RouteStoppage;
import com.fardoush.mybusadmin.models.Stoppage;
import com.fardoush.mybusadmin.models.User;

import antlr.collections.List;

@Service
public class LoginService {
	
	private HibernateConfig hibernateConfig;

	public LoginService(HibernateConfig hibernateConfig) {
		super();
		this.hibernateConfig = hibernateConfig;
	}
	

	
	public void Adduser() {
		
		User user = new User("Jamal Hossen","driver","","",false,"address","j date","r date");
		
		var session = hibernateConfig.getSession();
		var transaction = session.beginTransaction();
		session.save(user);	
		transaction.commit();
		session.close();
	}
	
public void addBus() {
		
		var session = hibernateConfig.getSession();
		var transaction = session.beginTransaction();
	
	
		try {
			
			
			Bus bus = new Bus("bus name","public",false,"desc","","");
		
			Bus bus2 = new Bus("bus name2","public",false,"desc","","");
			
		
			session.save(bus);
			session.save(bus2);
			transaction.commit();
			
		}catch(HibernateException e){
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}		
		
	}



	public void addDriver() {
		
		var session = hibernateConfig.getSession();
		var transaction = session.beginTransaction();
		
	CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
	
	CriteriaQuery<User> userQuery = criteriaBuilder.createQuery(User.class);
	
	Root<User> root = userQuery.from(User.class);

	var query = session.createQuery(userQuery);
	
	
	CriteriaQuery<Bus> busQuery = criteriaBuilder.createQuery(Bus.class);
	
	Root<Bus> rootbus = busQuery.from(Bus.class);

	var querybus = session.createQuery(busQuery);
	

	
		
		try {
			
			User user = query.getResultList().get(0);
			Bus bus = querybus.getResultList().get(0);
			
		
			Driver driver = new Driver("demo license info",false);
			
			
			driver.setBus(bus);
			driver.setUserInfo(user);
			
			session.save(driver);
			transaction.commit();
			
		}catch(HibernateException e){
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	
			
		
	}
	public void addStoppage() {
		
		var session = hibernateConfig.getSession();
		var transaction = session.beginTransaction();
		
		var stoppage1 = new Stoppage("Azampur",13.89374,89.7102348,false,"","");
		var stoppage2 = new Stoppage("Josim Uddin",13.89374,89.7102348,false,"","");
		try {
			
			
			session.save(stoppage1);
			session.save(stoppage2);
			transaction.commit();
			
		}catch(HibernateException e){
			
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
		
	public void addRoute() {
		
		var session = hibernateConfig.getSession();
		var transaction = session.beginTransaction();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Stoppage> stoppageQuery = criteriaBuilder.createQuery(Stoppage.class);		
		Root<Stoppage> root = stoppageQuery.from(Stoppage.class);
		
		var query = session.createQuery(stoppageQuery);
		
		Route route = new Route("route name",false,"","");	

		var routeStoppageList = new ArrayList<RouteStoppage>();
	
	
		try {		
			
		
			var stoppageList = query.getResultList();
			stoppageList = (ArrayList<Stoppage>) query.getResultList();
			
			RouteStoppage routeStoppage1 = new RouteStoppage(route,stoppageList.get(0),1);
			RouteStoppage routeStoppage2 = new RouteStoppage(route,stoppageList.get(1),2);
			routeStoppage1.setRoute(route);
			routeStoppage2.setRoute(route);
			
			routeStoppageList.add(routeStoppage1);
			routeStoppageList.add(routeStoppage2);
			
			route.setRouteStoppages(routeStoppageList);
			
			session.save(route);
			transaction.commit();
			
		}catch(HibernateException e){
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}
	

	

}
