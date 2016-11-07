package com.niit.jewelryBackend.dao;

import java.util.List;


import com.niit.jewelryBackend.model.product;

public interface productdao {
	public boolean save(product product);
		
	
	public boolean update(product product);
	
	public boolean delete(product product);
	
	public product get(String id);
	
	public List<product> list();

}
