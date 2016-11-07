package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.category;

public interface categorydao {
	public boolean save(category category);
	public boolean update(category category);
	public boolean delete(category category);
	public category get(String id);
	public List<category> list();
	
	

}
