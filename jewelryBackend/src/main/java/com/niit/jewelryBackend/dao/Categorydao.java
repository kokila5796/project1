package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.Category;




public interface Categorydao {
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(String id);
	
	public List<Category> list();
	
	

}
