package com.niit.jewelryBackend.dao;

import java.util.List;

import com.niit.jewelryBackend.model.user;



public interface userdao {
public boolean save(user user);
		
	
	public boolean update(user user);
	
	public boolean delete(user user);
	
	public user get(String id);
	
	public List<user> list();
}
