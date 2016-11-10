package com.niit.jewelryBackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.jewelryBackend.dao.Productdao;
import com.niit.jewelryBackend.model.Product;





@Repository("productdao")
public class ProductdaoImpl implements Productdao
{

	@Autowired
	SessionFactory sessionFactory;
	public ProductdaoImpl(){}
	public  ProductdaoImpl (SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Product product) {
		try {
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Transactional
	public boolean update(Product product) {
		 try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	public boolean delete(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	public Product get(String id) {
		
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Transactional
	public List<Product> list() {
		String hql = "from product";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}





	





	}