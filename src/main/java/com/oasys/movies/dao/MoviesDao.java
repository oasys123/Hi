package com.oasys.movies.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.movies.entity.Movies;
import com.oasys.movies.repository.MoviesRepository;
@Repository
public class MoviesDao {
	@Autowired
	MoviesRepository moviesRepo;

	public Movies insertValue(Movies m) {
		return moviesRepo.save(m);
		
	}

	public String listAdd(List<Movies> m) {
		// TODO Auto-generated method stub
		moviesRepo.saveAll(m);
		return "SuccessFull";
	}

	public Movies getObj(Movies m) {
		// TODO Auto-generated method stub
		moviesRepo.save(m);
		return m;
	}

	public Optional<Movies> getById(int id) {
		
	return moviesRepo.findById(id);
	 
	}

	public List<Movies> find() {
		// TODO Auto-generated method stub
		return moviesRepo.findAll();
	}

	public String deleteId(int num) {
		// TODO Auto-generated method stub
		moviesRepo.deleteById(num);;
		return "Deleted Successfully";
	}

	public Movies updateValue(Movies m) {
		// TODO Auto-generated method stub
		return moviesRepo.save(m);
	}

	

}
