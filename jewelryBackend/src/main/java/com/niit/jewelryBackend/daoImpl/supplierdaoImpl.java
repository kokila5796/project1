package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.niit.jewelryBackend.dao.supplierdao;
import com.niit.jewelryBackend.model.supplier;


public class supplierdaoImpl implements supplierdao {

	  SessionFactory sessionFactory;
		
		public  supplierdaoImpl (SessionFactory sessionFactory)
		{
			
			
			this.sessionFactory=sessionFactory;
		}
		
		public boolean save(supplier supplier) {
			try {
				sessionFactory.getCurrentSession().save(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
				return false;
			}
			
			
		}

		public boolean update(supplier supplier) {
			 try {
				sessionFactory.getCurrentSession().update(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
			}
			return false;
		}

		public boolean delete(supplier supplier) {
			try {
				sessionFactory.getCurrentSession().delete(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
			}
			return false;
		}

		public supplier get(String id) {
			
			return (supplier) sessionFactory.getCurrentSession().get(supplier.class, id);
		}

		public List<supplier> list() {
			String hql = "from supplier";
			Query query= sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
			
		}

		

}
