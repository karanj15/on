package com.cg.repo;

import java.util.List;

import com.cg.entity.Screen;

public interface ScreenRepo {
	public void save(Screen entityObject);
	
	public Screen findById(Integer id);
	
	public Screen remove(Integer id);
	
	public Screen remove(Screen entityObject);
	
	public Screen update(Integer id, Screen entityObject);
	
	public List<Screen> findAll();
	
	public Screen update(Screen entityObject);

}
