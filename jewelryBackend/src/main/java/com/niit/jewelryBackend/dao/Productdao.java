package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.Product;


public interface Productdao {
	public boolean save(Product product);
		
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id);
	
	public List<Product> list();

}
