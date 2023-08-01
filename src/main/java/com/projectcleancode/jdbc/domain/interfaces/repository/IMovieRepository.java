package com.projectcleancode.jdbc.domain.interfaces.repository;

import com.projectcleancode.jdbc.domain.model.Movie;

import java.util.List;

public interface IMovieRepository {
    List<Movie> findAll();
    Movie findById(Long id);
    Movie findByName(String title);
    void create(Movie movie);
    void update(Movie movie);
    void delete(Long id);
}
