package com.cg.repo;

import java.util.List;

import com.cg.entity.Show;

public interface ShowRepo {

	public void save(Show entityObject);
	
	public Show findById(Integer id);
	
	public Show remove(Integer id);
	
	public Show remove(Show entityObject);
	
	public Show update(Integer id, Show entityObject);
	
	public Show update(Show entityObject);
	
	public List<Show> findAll();
	
	public List<Show> findActiveShows();

}
