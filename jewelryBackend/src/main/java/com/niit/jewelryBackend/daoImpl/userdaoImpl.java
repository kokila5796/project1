package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.niit.jewelryBackend.dao.userdao;
import com.niit.jewelryBackend.model.user;

public class userdaoImpl implements userdao {

	SessionFactory sessionFactory;
	
	public  userdaoImpl (SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	public boolean save(user user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean update(user user) {
		 try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(user user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	public user get(String id) {
		
		return (user) sessionFactory.getCurrentSession().get(user.class, id);
	}

	public List<user> list() {
		String hql = "from user";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}

	
	

}
