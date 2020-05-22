package com.cg.repo;

import java.util.List;

import com.cg.entity.Seat;

public interface SeatRepo
{
	public void save(Seat entityObject);
	
	public Seat findById(Integer id);
	
	public Seat remove(Integer id);
	
	public Seat remove(Seat entityObject);
	
	public Seat update(Integer id, Seat entityObject);
	
	public List<Seat> findAll();
	
	public Seat update(Seat entityObject);
}