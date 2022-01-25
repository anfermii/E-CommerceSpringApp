package com.hibernate.dao;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateDBUtil {
 public static Session getDBSession() {
	 //step1: Create Configuration object
	 Configuration configuration = new Configuration();
	 //step2: create Properties and set all DB properties in it
	  Properties dbProperties = new Properties();
	 dbProperties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	 dbProperties.put(Environment.URL, "jdbc:mysql://localhost:3306/sierranov1");
	 dbProperties.put(Environment.USER, "root");
	 dbProperties.put(Environment.PASS, "root");
	 dbProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	 dbProperties.put(Environment.SHOW_SQL, "true");
	 dbProperties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	 
	//step3: set the properties in to configuration
	 configuration.setProperties(dbProperties);
	 configuration.addAnnotatedClass(Employee.class);
	 configuration.addAnnotatedClass(Department.class);
	 
	  //step4: get the sessionFactory object to generate session object
	 SessionFactory sessionFactory = configuration.buildSessionFactory();
	 Session session = sessionFactory.getCurrentSession();
	return session;
	 
 }
}
