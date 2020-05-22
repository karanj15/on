package com.cg.service;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;



import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Movie;
import com.cg.exception.NullPropertyException;
import com.cg.repo.UniversalRepo;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	TheatreService theatreservice;
	
	@Autowired
	UniversalRepo<Movie> dao;
	
	
	/********
	*Method name 			getMovie
	*Parameters				movieId (Integer)
	*description			This method gets the Set of movies with given movie id
	 * @throws				 EntityNotFoundException 
	*@Returns   			Returns movie
	*********/
	


	
	@Override
	public Movie getMovie(Integer id) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		Movie movie=dao.findById(id);
		if(movie==null)
		{
			throw new EntityNotFoundException("There is no movie with id"+id);
		}
		return movie;
	}
}