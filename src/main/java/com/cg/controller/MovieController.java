package com.cg.controller;



import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Movie;
import com.cg.service.MovieService;

@CrossOrigin(origins="localhost:4200")

@RestController
public class MovieController {

	@Autowired
	MovieService movieservice;

	
	/********
	*Method name 			getMovie
	*Parameters				movieId (Integer)
	*description			This method gets the Set of movies with given movie id
	 * @throws				 EntityNotFoundException 
	*@Returns   			Returns movie
	*HTTP-MethodType 		Get
	*********/
	
	
	
	@GetMapping(value="movie/{id}")
	public Movie getMovie(@PathVariable Integer id)
	{
		Movie movie=movieservice.getMovie(id);
		return movie;
	}

	
	
}