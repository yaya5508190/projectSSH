package me.project.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class IDateSet4Hibernate {
	SessionFactory HibernateFactory;
	
	public boolean insert(Object o){
		/*Session session = HibernateFactory.openSession();
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
		session.close();*/
		Session session = HibernateFactory.getCurrentSession();
		session.persist(o);
		return false;
	}
	
	public void setHibernateFactory(SessionFactory hibernateFactory) {
		HibernateFactory = hibernateFactory;
	}
}
