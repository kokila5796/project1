package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.supplier;



public interface supplierdao {
public boolean save(supplier supplier);
		
	
	public boolean update(supplier supplier);
	
	public boolean delete(supplier supplier);
	
	public supplier get(String id);
	
	public List<supplier> list();


}
