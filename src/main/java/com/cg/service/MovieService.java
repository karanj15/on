package com.cg.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.cg.entity.Movie;

@Service
public interface MovieService {
	
	

	Movie getMovie(Integer id) throws EntityNotFoundException;

}