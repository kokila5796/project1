package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.Supplier;

public interface Supplierdao {
public boolean save(Supplier supplier);
		
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier get(String sup_id);
	
	public List<Supplier> list();


}
