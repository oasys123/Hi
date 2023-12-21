package com.oasys.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.movies.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {

	

	

}
