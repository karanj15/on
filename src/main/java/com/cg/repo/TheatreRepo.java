package com.cg.repo;

import java.util.List;

import com.cg.entity.Theatre;

public interface TheatreRepo {

	public void save(Theatre entityObject);
	
	public Theatre findById(Integer id);
	
	public Theatre remove(Integer id);
	
	public Theatre remove(Theatre entityObject);
	
	public Theatre update(Integer id, Theatre entityObject);
	
	public List<Theatre> findAll();
	
	public Theatre update(Theatre entityObject);
	
	public List<Theatre> getTheatresByCity(String city);

}
