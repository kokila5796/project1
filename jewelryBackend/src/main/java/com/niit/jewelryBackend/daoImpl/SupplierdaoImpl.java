package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.jewelryBackend.dao.Supplierdao;
import com.niit.jewelryBackend.model.Supplier;



@Repository("supplierdao")
public class SupplierdaoImpl implements Supplierdao {

	@Autowired
	  SessionFactory sessionFactory;
		
		public  SupplierdaoImpl (SessionFactory sessionFactory)
		{
			
			
			this.sessionFactory=sessionFactory;
		}
		
		@Transactional
		public boolean save(Supplier supplier) {
			try {
				sessionFactory.getCurrentSession().save(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
				return false;
			}
			
			
		}
		
		@Transactional

		public boolean update(Supplier supplier) {
			 try {
				sessionFactory.getCurrentSession().update(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
			}
			return false;
		}

		
		
		@Transactional
		public boolean delete(Supplier supplier) {
			try {
				sessionFactory.getCurrentSession().delete(supplier);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
			}
			return false;
		}

		
		@Transactional
		public Supplier get(String sup_id) {
			
			return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, sup_id);
		}

		
		@Transactional
		public List<Supplier> list() {
			String hql = "from Supplier";
			Query query= sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
			
		}

		

}
