package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.niit.jewelryBackend.dao.productdao;
import com.niit.jewelryBackend.model.product;


public class productdaoImpl implements productdao {

      SessionFactory sessionFactory;
	
	public   productdaoImpl (SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	
	
	
	
	public boolean save(product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean update(product product) {
		 try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	public product get(String id) {
		
		return (product) sessionFactory.getCurrentSession().get(product.class, id);
	}

	public List<product> list() {
		String hql = "from product";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}

	

}
