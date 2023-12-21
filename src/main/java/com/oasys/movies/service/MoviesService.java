package com.oasys.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.movies.dao.MoviesDao;
import com.oasys.movies.entity.Movies;
@Service
public class MoviesService {
	@Autowired
	MoviesDao moviesDao;

	public Movies insertValue(Movies m) {
	
		return moviesDao.insertValue(m);
	}

	public String listAdd(List<Movies> m) {
		// TODO Auto-generated method stub
		return moviesDao.listAdd(m);
	}

	public Movies getObj(Movies m) {
		// TODO Auto-generated method stub
		return moviesDao.getObj(m);
	}

	public Optional<Movies> getById(int id) {
		// TODO Auto-generated method stub
		return moviesDao.getById(id);
	}

	public List<Movies> find() {
	
		return moviesDao.find();
	}

	public String deleteId(int num) {
		// TODO Auto-generated method stub
		return moviesDao.deleteId(num);
	}

	public Movies updateValue(Movies m) {
		// TODO Auto-generated method stub
		return moviesDao.updateValue(m);
	}

	

}
