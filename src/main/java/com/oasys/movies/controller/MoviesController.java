package com.oasys.movies.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.movies.entity.Movies;
import com.oasys.movies.service.MoviesService;

@RestController
@RequestMapping(value="/movies")
@CrossOrigin(origins="*")
public class MoviesController {
	@Autowired
	MoviesService moviesSer;
	@PostMapping(value="/insert")
	public Movies insertValue(@RequestBody Movies m) {
		System.out.println(m);
		return moviesSer.insertValue(m);
	}
	@PostMapping(value="/list")
	public String listAdd(@RequestBody List<Movies> m) {
		return moviesSer.listAdd(m);
	}
	@PostMapping(value="/obj")
	public Movies getObj(@RequestBody Movies m) {
		return moviesSer.getObj(m);
	}
	@GetMapping(value="/get/{id}")
	public Optional<Movies> getById(@PathVariable int id) {
		return moviesSer.getById(id);
	}
	@GetMapping(value="/getall")
	public List<Movies> find(){
		return moviesSer.find();
	}
	@DeleteMapping(value="/delid/{num}")
	public String deleteId(@PathVariable int num) {
		return moviesSer.deleteId(num);
	}
	@PutMapping(value="update")
	public Movies updateValue(@RequestBody Movies m) {
		return moviesSer.updateValue(m);
	}
	
	

}
