package com.fardoush.mybusadmin.configs.persistance;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.Entity;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.reflections.Reflections;

import javassist.Modifier;

public class HibernateConfig {
	private SessionFactory sessionFactory = null;
	private Session session = null;

	public Session getSession() {
		this.session = createAndGetLocalSessionfactoryBean().getCurrentSession();
		return session != null ? this.session : createAndGetLocalSessionfactoryBean().openSession();
	}

	public CriteriaBuilder getCriteriaBuilder() {
		Session  session = getSession();
		Transaction  transaction = session.beginTransaction();
		return session.getCriteriaBuilder();

	}

	private SessionFactory createAndGetLocalSessionfactoryBean() {

		if (this.sessionFactory == null) {
			Configuration configuration = new Configuration();
			Properties configProperty = getProperties("hibernate.properties");
			configuration.setProperties(configProperty);
			configuration.addPackage("com.fardoush.mybusadmin.models");

			for (Class<?> modelClass : (new Reflections("com.fardoush.mybusadmin.models"))
					.getTypesAnnotatedWith(Entity.class)) {
				
				  if(!Modifier.isAbstract(modelClass.getModifiers())) {
				  configuration.addAnnotatedClass(modelClass);
				  
				  }
				 

			}

			StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
					.applySettings(configProperty);

			sessionFactory = configuration.buildSessionFactory(registryBuilder.build());
		}

		return sessionFactory;
	}

	private Properties getProperties(String fileName) {
		Properties properties = new Properties();
		InputStream input = Hibernate.class.getClassLoader().getResourceAsStream(fileName);

		try {
			properties.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

}
