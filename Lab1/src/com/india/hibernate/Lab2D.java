package com.india.hibernate;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lab2D {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactoryObject();
			Session session=sessionFactory.openSession();
			
			tx=session.beginTransaction();
			
			Customer cust=(Customer)session.load(Customer.class,22); // delete record from table
			System.out.println(cust);
			
			session.delete(cust);
			System.out.println("***********");
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
