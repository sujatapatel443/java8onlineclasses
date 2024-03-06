package com.india.hibernate;


import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.india.hibernate.entity.Address;
import com.india.hibernate.entity.Customer;

public class Lab2A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactoryObject();
			Session session=sessionFactory.openSession();
			
			tx=session.beginTransaction();
			
			Address add = new Address("BTM Layout", "Blore", "KA");
			session.save(add);
			
			Customer cust = new Customer("Sri", "Sri@jlc", 555);
			session.save(cust);
			
			cust.setAddress(add); //IMP
			
			System.out.println("***********");
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
