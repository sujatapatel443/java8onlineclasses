package com.india.hibernate;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lab2A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactoryObject();
			Session session=sessionFactory.openSession();
			
			tx=session.beginTransaction();
			
			Customer cust=new Customer("Raj","r@a.com",12345,"Blore");
			session.save(cust); // insert record in table
			System.out.println("***********");
			
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
