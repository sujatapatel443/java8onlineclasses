package com.india.hibernate;


import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.india.hibernate.entity.Student;

public class Lab2A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactoryObject();
			Session session=sessionFactory.openSession();
			
			tx=session.beginTransaction();
			
			Student stu=new Student("SUJATA","01-01-1990","BCA");
			
			String courses[] = {"Hibernate","Spring","Spring Boot","Angular"};
			
			List<String> emails = new ArrayList<>();
			emails.add("r@gmail.com");
			emails.add("s@gmail.com");
			
			List<Integer> marks = new ArrayList<>();
			marks.add(80);
			marks.add(85);
			marks.add(88);
			marks.add(92);
			
			Set<Long> phones = new HashSet<>();
			phones.add(987654L);
			phones.add(6789543L);
			
			
			Map<String,Long> refs = new HashMap<>();
			refs.put("AA", 11L);
			refs.put("BB",22L);
			refs.put("CC", 33L);
			refs.put("DD", 44L);
			
			stu.setCouurses(courses);
			stu.setEmails(emails);
			stu.setMarks(marks);
			stu.setPhones(phones);
			stu.setRefs(refs);
			
			session.save(stu); // insert record in table
			System.out.println("***********");
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
