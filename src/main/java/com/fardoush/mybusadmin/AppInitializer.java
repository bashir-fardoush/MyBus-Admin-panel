package com.fardoush.mybusadmin;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		// add app configuration 
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		
		servletContext.addListener(new ContextLoaderListener(ac));
		// add servlet configuration
		AnnotationConfigWebApplicationContext servletContextConfig = new AnnotationConfigWebApplicationContext();
		servletContextConfig.register(AppServletConfig.class);
		// add servlet
		ServletRegistration.Dynamic dynamic =servletContext.addServlet("mybus_servlet", new DispatcherServlet(servletContextConfig));
		dynamic.setLoadOnStartup(1);
		//add mapping configuration
		dynamic.addMapping("/");
		
		
		
	}

}
