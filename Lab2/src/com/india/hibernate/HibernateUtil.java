package com.india.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	static {
		try {
		Configuration cfg = new Configuration();
		Properties myprops = new Properties();
		myprops.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
		myprops.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
		myprops.put(Environment.USER, "system");
		myprops.put(Environment.PASS, "system");
		myprops.put(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
		myprops.put(Environment.SHOW_SQL, "true");
		myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		myprops.put(Environment.HBM2DDL_AUTO, "update");
		cfg.setProperties(myprops);
		cfg.addAnnotatedClass(Customer.class);
		StandardServiceRegistryBuilder ssrbuilder = new StandardServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = ssrbuilder.applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	
	public static SessionFactory getSessionFactoryObject() {
		
		return sessionFactory;
	}

}
