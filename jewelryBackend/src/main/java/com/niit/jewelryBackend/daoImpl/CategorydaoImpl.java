package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.jewelryBackend.dao.Categorydao;
import com.niit.jewelryBackend.model.Category;




@Repository("categorydao")
public class CategorydaoImpl implements Categorydao
{

	@Autowired
	SessionFactory sessionFactory;
	
	public  CategorydaoImpl (SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Category category) {
		try {
			
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Transactional
	public boolean update(Category category) {
		 try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	public boolean delete(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	public Category get(String id) {
		
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
	}

	@Transactional
	public List<Category> list() {
		String hql = "from category";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}





	





	}
	
	


